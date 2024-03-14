import java.io.*;
import java.net.*;
import java.util.StringTokenizer;

class WebServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(2222);
            System.out.println("Web Server started...");

            while (true) {
                Socket socket = server.accept();
                System.out.println("Client Connected...");

                HandleClientReq t = new HandleClientReq(socket);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class HandleClientReq extends Thread {
    private Socket socket;

    public HandleClientReq(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataInputStream in = new DataInputStream(socket.getInputStream());
            PrintStream out = new PrintStream(socket.getOutputStream());

            String statusLine = in.readLine();
            System.out.println(statusLine); // Print the request line

            if (statusLine == null) {
                // Handle the case where no data is received from the client
                socket.close();
                return;
            }

            StringTokenizer t = new StringTokenizer(statusLine, " ");

            String method = t.nextToken();
            String url = t.nextToken();
            String protocolVersion = t.nextToken();
            String header = "";

            // Read and display headers until an empty line is encountered
            do {
                header = in.readLine();
                System.out.println(header);
            } while (!header.trim().equals(""));

            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: application/octet-stream");
            out.println();

            String cleanUrl = url.startsWith("/") ? url.substring(1) : url;

            if (cleanUrl.equals("favicon.ico")) {
                out.println("HTTP/1.1 404 Not Found");
                out.println();
            } else {
                FileInputStream f = new FileInputStream("html/" + cleanUrl);
                int size = f.available();

                String contentType = "application/octet-stream";
                if (cleanUrl.endsWith(".html")) {
                    contentType = "text/html";
                } else if (cleanUrl.endsWith(".jpg") || cleanUrl.endsWith(".jpeg")) {
                    contentType = "image/jpeg";
                } else if (cleanUrl.endsWith(".png")) {
                    contentType = "image/png";
                }

                out.println("HTTP/1.1 200 OK");
                out.println("Content-Type: " + contentType);
                out.println("Content-Length: " + size);
                out.println();

                byte[] data = new byte[size];
                f.read(data, 0, size);

                out.write(data, 0, size);

                f.close();
            }

            in.close();
            out.close();
            socket.close();
            System.out.println("Upload Complete...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
