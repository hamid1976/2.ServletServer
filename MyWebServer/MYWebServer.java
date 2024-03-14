// import java.io.*;
// import java.util.*;
// import java.net.*;

// class MYWebServer {
    // public static void main(String arg[]) throws Exception {
        // ServerSocket server = new ServerSocket(1414);
        // System.out.println("Server Started....");

        // Socket socket =null;
        // DataInputStream in =null;
        // PrintStream out =null;
        
		// do { 
			// if(in!=null)in.close();
			// if(out!=null)out.close();
			// if(socket!=null)socket.close();
		
            // socket = server.accept();
            // System.out.println("Client Connected....");
            // in = new DataInputStream(socket.getInputStream());
            // out = new PrintStream(socket.getOutputStream());

            // try {
                // String statusLine = in.readLine();
				// System.out.println(statusLine); // Print the request line
				// if (statusLine == null)// Handle the case where no data is received from the client
                 // continue;
                
				
                // StringTokenizer t = new StringTokenizer(statusLine, " ");

                // String method = t.nextToken();
                // String url = t.nextToken();
                // String protocolVersion = t.nextToken();
                // String header = "";

                // if (url.equals("/favicon.ico")) {
                    // out.println("HTTP/1.1 404 Not Found");
                    // out.println();
					// continue;
		        // } 


       //         Read and display headers until an empty line is encountered
                // do {
                    // header = in.readLine();
                    // System.out.println(header);
                // } while (!header.trim().equals(""));

        
			             // int size =-1;
           		         // byte[] data;
                         // String contentType;
	 //		Remove leading slashes from the URL
                // url = url.startsWith("/") ? url.substring(1) : url;
   			 
	                     // if(url.startsWith("servlets/")){
							// String className=url.replace('/','.');

							// t = new StringTokenizer(className, ".");

							// String servletFolder = t.nextToken();
							// className = t.nextToken();


							
							// System.out.println("class: "+className);
							
							// Class c=Class.forName(className);
							// Object obj=c.newInstance();
							// Servlet servlet=(Servlet)obj;
							// StringBuffer buffer=new StringBuffer();
							// contentType=servlet.service(buffer);
							// String str=buffer.toString();
							// data=str.getBytes();
							// size=data.length;
						 // }else{
                    
							// if(url.trim().equals(""))url="index.html";
								 
                            // FileInputStream f = new FileInputStream("html/" + url);
                            // size = f.available();
           		            // data = new byte[size];
                            // f.read(data, 0, size);
                            // f.close();
                            // contentType=getContentType(url);
						 // }
									
                    // out.println("HTTP/1.1 200 OK");
                    // out.println("Content-Type: " + contentType);
                    // out.println("Content-Length: " + size);
                    // out.println();

                    // out.write(data, 0, size);

            // } catch (FileNotFoundException e) {
                // out.println("HTTP/1.1 404 Not-Found");
                // out.println();
			// } 
        // } while (true);
    // }//end main
		// private static String getContentType(String cleanUrl) {
	//	Determine the content type based on the file extension or set as generic "application/octet-stream"
		// String contentType = "application/octet-stream";
		// String contentDisposition = "attachment"; // Default to attachment

		// String fileExtension = getFileExtension(cleanUrl);

		// switch (fileExtension) {
			// case "html":
				// contentType = "text/html";
				// break;
			// case "jpg":
			// case "jpeg":
				// contentType = "image/jpeg";
				// break;
			// case "gif":
				// contentType = "image/gif";
				// break;
			// case "png":
				// contentType = "image/png";
				// break;
			// case "mp3":
				// contentType = "audio/mpeg";
				// break;
			// case "mp4":
				// contentType = "video/mp4";
				// break;
			// case "pdf":
				// contentType = "application/pdf";
				// break;
			// case "doc":
			// case "docx":
				// contentType = "application/msword";
				// break;
			// case "xls":
			// case "xlsx":
				// contentType = "application/vnd.ms-excel";
				// break;
			// case "json":
				// contentType = "application/json";
				// break;
			// case "xml":
				// contentType = "application/xml";
				// break;
			// case "zip":
				// contentType = "application/zip";
				// break;
			// case "txt":
				// contentType = "text/plain";
				// break;
			// case "css":
				// contentType = "text/css";
				// break;
			// case "js":
				// contentType = "application/javascript";
				// break;
			// case "csv":
				// contentType = "text/csv";
				// break;
			// case "svg":
				// contentType = "image/svg+xml";
				// break;
			// case "woff":
				// contentType = "font/woff";
				// break;
			// case "woff2":
				// contentType = "font/woff2";
				// break;
			// case "ttf":
				// contentType = "font/ttf";
				// break;
			// case "otf":
				// contentType = "font/otf";
				// break;
			// case "eot":
				// contentType = "application/vnd.ms-fontobject";
				// break;
			// case "ico":
				// contentType = "image/x-icon";
				// break;
			// case "avi":
				// contentType = "video/x-msvideo";
				// break;
			// case "webm":
				// contentType = "video/webm";
				// break;
			// case "ogg":
				// contentType = "audio/ogg";
				// break;
			// case "mpg":
			// case "mpeg":
				// contentType = "video/mpeg";
				// break;
			// case "wav":
				// contentType = "audio/wav";
				// break;
			// case "webp":
				// contentType = "image/webp";
				// break;
			// case "weba":
				// contentType = "audio/webm";
				// break;
			// Add more cases as needed
			// default:
				//Handle additional MIME types here as needed
				// contentType = "text/plain";
				// break;
		// }

		// return contentType;
	// }

	// private static String getFileExtension(String filename) {
		// int lastDotIndex = filename.lastIndexOf(".");
		// if (lastDotIndex != -1 && lastDotIndex < filename.length() - 1) {
			// return filename.substring(lastDotIndex + 1);
		// }
		// return "";
	// }

// }//end class










import java.io.*;
import java.net.*;
import java.util.StringTokenizer;

class MYWebServer{
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1414);
        System.out.println("Server Started....");

        while (true) {
            Socket socket = server.accept();
            System.out.println("Client Connected....");

            try (DataInputStream in = new DataInputStream(socket.getInputStream());
                 PrintStream out = new PrintStream(socket.getOutputStream())) {

                handleRequest(in, out);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void handleRequest(DataInputStream in, PrintStream out) throws IOException {
        String statusLine = in.readLine();
        System.out.println(statusLine);

        if (statusLine == null) {
            return;
        }

        StringTokenizer tokenizer = new StringTokenizer(statusLine, " ");
		
        String method = tokenizer.nextToken();
        String url = tokenizer.nextToken();
        String protocolVersion = tokenizer.nextToken();
		String header="";

        if ("/favicon.ico".equals(url)) {
            sendNotFoundResponse(out);
            return;
        }
		do{
			header=in.readLine();
			System.out.println(header);
		}while(!header.trim().equals(""));

        url = url.startsWith("/") ? url.substring(1) : url;
        String contentType;
        byte[] data;
        int size;

        if (url.startsWith("servlets/")) {
            String className = url.replace('/', '.');
            StringTokenizer classTokenizer = new StringTokenizer(className, ".");
            String servletFolder = classTokenizer.nextToken();
            className = classTokenizer.nextToken();

            System.out.println("Class: " + className);

            try {
                Class c = Class.forName(className);
                Object obj = c.newInstance();
                Servlet servlet = (Servlet) obj;
                StringBuffer buffer = new StringBuffer();
                contentType = servlet.service(buffer);
                String str = buffer.toString();
                data = str.getBytes();
                size = data.length;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                sendNotFoundResponse(out);
                return;
            }
        } else {
            if (url.trim().isEmpty()) {
                url = "index.html";
            }

            try {
                FileInputStream fileInputStream = new FileInputStream("html/" + url);
                size = fileInputStream.available();
                data = new byte[size];
                fileInputStream.read(data, 0, size);
                fileInputStream.close();
                contentType = getContentType(url);
            } catch (FileNotFoundException e) {
                sendNotFoundResponse(out);
                return;
            }
        }

        out.println("HTTP/1.1 200 OK");
        out.println("Content-Type: " + contentType);
        out.println("Content-Length: " + size);
        out.println();
        out.write(data, 0, size);
    }//end handleRequest

    private static void sendNotFoundResponse(PrintStream out) {
        out.println("HTTP/1.1 404 Not Found");
        out.println();
    }

    private static String getContentType(String cleanUrl) {
    String fileExtension = getFileExtension(cleanUrl);

		switch (fileExtension.toLowerCase()) {
			case "html":
				return "text/html"; // HTML files
			case "jpg":
			case "jpeg":
				return "image/jpeg"; // JPEG images
			case "gif":
				return "image/gif"; // GIF images
			case "png":
				return "image/png"; // PNG images
			case "mp3":
				return "audio/mpeg"; // MP3 audio
			case "mp4":
				return "video/mp4"; // MP4 video
			case "pdf":
				return "application/pdf"; // PDF documents
			case "doc":
			case "docx":
				return "application/msword"; // Microsoft Word documents
			case "xlsx":
				return "application/vnd.ms-excel"; // Microsoft Excel documents
			case "json":
				return "application/json"; // JSON data
			case "xml":
				return "application/xml"; // XML data
			case "zip":
				return "application/zip"; // ZIP archives
			case "txt":
				return "text/plain"; // Plain text files
			case "css":
				return "text/css"; // CSS stylesheets
			case "js":
				return "application/javascript"; // JavaScript files
			case "csv":
				return "text/csv"; // CSV data
			case "svg":
				return "image/svg+xml"; // SVG images
			case "woff":
				return "font/woff"; // WOFF fonts
			case "woff2":
				return "font/woff2"; // WOFF2 fonts
			case "ttf":
				return "font/ttf"; // TrueType fonts
			case "otf":
				return "font/otf"; // OpenType fonts
			case "eot":
				return "application/vnd.ms-fontobject"; // Embedded OpenType fonts
			case "ico":
				return "image/x-icon"; // Icon files
			case "avi":
				return "video/x-msvideo"; // AVI videos
			case "webm":
				return "video/webm"; // WebM videos
			case "mpg":
			case "mpeg":
				return "video/mpeg"; // MPEG videos
			case "wav":
				return "audio/wav"; // WAV audio
			case "webp":
				return "image/webp"; // WebP images
			case "tif":
			case "tiff":
				return "image/tiff"; // TIFF images
			case "xls":
				return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"; // Excel (OpenXML)
			case "ppt":
			case "pptx":
				return "application/vnd.openxmlformats-officedocument.presentationml.presentation"; // PowerPoint (OpenXML)
			case "odt":
				return "application/vnd.oasis.opendocument.text"; // OpenDocument Text
			case "ods":
				return "application/vnd.oasis.opendocument.spreadsheet"; // OpenDocument Spreadsheet
			case "odp":
				return "application/vnd.oasis.opendocument.presentation"; // OpenDocument Presentation
			case "psd":
				return "image/vnd.adobe.photoshop"; // Adobe Photoshop
			case "ai":
				return "application/illustrator"; // Adobe Illustrator
			case "eps":
				return "application/postscript"; // Encapsulated PostScript
			case "wmv":
				return "video/x-ms-wmv"; // Windows Media Video
			case "midi":
			case "mid":
				return "audio/midi"; // MIDI audio
			case "apk":
				return "application/vnd.android.package-archive"; // Android Package (APK)
			case "rtf":
				return "application/rtf"; // Rich Text Format
			case "tar":
				return "application/x-tar"; // Tar archive
			case "7z":
				return "application/x-7z-compressed"; // 7-Zip archive
			case "rar":
				return "application/x-rar-compressed"; // RAR archive
			case "gz":
			case "gzip":
				return "application/gzip"; // GZIP compressed file
			case "jar":
				return "application/java-archive"; // Java Archive (JAR)
			case "ogg":
				return "audio/vorbis"; // Ogg Vorbis audio
			case "rss":
				return "application/rss+xml"; // RSS feed
			case "atom":
				return "application/atom+xml"; // Atom feed
			case "yaml":
			case "yml":
				return "application/x-yaml"; // YAML data
			case "ics":
				return "text/calendar"; // iCalendar data
			case "vcard":
				return "text/vcard"; // vCard data
			case "kml":
				return "application/vnd.google-earth.kml+xml"; // KML data
			case "kmz":
				return "application/vnd.google-earth.kmz"; // KMZ data
			case "dwg":
				return "application/acad"; // AutoCAD drawing
			case "odg":
				return "application/vnd.oasis.opendocument.graphics"; // OpenDocument Graphics
			case "mpga":
				return "audio/mpeg"; // MPEG audio
			case "wma":
				return "audio/x-ms-wma"; // Windows Media Audio
			case "ps":
				return "application/postscript"; // PostScript
			case "mov":
				return "video/quicktime"; // QuickTime video
			case "mkv":
				return "video/x-matroska"; // Matroska video
			case "flv":
				return "video/x-flv"; // Flash video
			case "aac":
				return "audio/aac"; // AAC audio
			default:
				return "application/octet-stream";
		}//end switch
	}//end getContentType


    private static String getFileExtension(String filename) {
        int lastDotIndex = filename.lastIndexOf(".");
        if (lastDotIndex != -1 && lastDotIndex < filename.length() - 1) {
            return filename.substring(lastDotIndex + 1);
        }
        return "";
    }
}
