import java.io.*;
import java.util.*;
import java.net.*;

class MYWebServer{
    public static void main(String arg[]) throws Exception {
        ServerSocket server = new ServerSocket(1414);
        System.out.println("Server Started....");
        do { 
            Socket socket = server.accept();
            System.out.println("Client Connected....");

            try {
                DataInputStream in = new DataInputStream(socket.getInputStream());
                PrintStream out = new PrintStream(socket.getOutputStream());

                String statusLine = in.readLine();
                System.out.println(statusLine); // Print the request line
                if (statusLine == null) {
                    // Handle the case where no data is received from the client
                    socket.close();
                    continue;
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

                // Remove leading slashes from the URL
                String cleanUrl = url.startsWith("/") ? url.substring(1) : url;

                // Check if the requested URL is for favicon.ico and respond with a 404 if it is
                if (cleanUrl.equals("favicon.ico")) {
                    out.println("HTTP/1.1 404 Not Found");
                    out.println();
                } else {
                    if (method.equals("POST")) {
                        // Handle POST requests here
                        // Read the POST data from the input stream
                        int contentLength = 0;

                        // Find the Content-Length header to determine the data size
                        for (String line; (line = in.readLine()) != null && !line.isEmpty(); ) {
                            if (line.startsWith("Content-Length: ")) {
                                contentLength = Integer.parseInt(line.substring("Content-Length: ".length()));
                            }
                        }

                        // Read the POST data as binary (you can modify this to handle form data or other content types)
                        byte[] postData = new byte[contentLength];
                        in.readFully(postData);

                        // Process the POST data as needed (e.g., save to a file)
                        // Example: FileOutputStream fos = new FileOutputStream("path/to/save/file");
                        // fos.write(postData);
                        // fos.close();

                        // Respond to the POST request as required
                        out.println("HTTP/1.1 200 OK");
                        out.println("Content-Type: text/plain");
                        out.println("Content-Length: 0"); // Responding with an empty body for now
                    } else {
                        // Process other requests and serve files as before
                        FileInputStream f = new FileInputStream("html/" + cleanUrl);
                        int size = f.available();

                        // Determine the content type based on the file extension or set as generic "application/octet-stream"
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
                }
            } catch (FileNotFoundException e) {
                // Handle the case where the requested file is not found
                PrintStream out = new PrintStream(socket.getOutputStream());
                out.println("HTTP/1.1 404 Not Found");
                out.println();
            } finally {
                socket.close();
            }
        } while (true);
   }
}
