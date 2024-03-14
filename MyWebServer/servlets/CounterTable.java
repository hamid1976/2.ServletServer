public class CounterTable implements Servlet {
    public String service(StringBuffer buf) {
        int counter = 10;
        int table = 7;

        buf.append("<table border=1>");

        for (int i = 1; i <= counter; i++) {
            buf.append("<tr>");
            buf.append("<td>").append(table).append(" x ").append(i).append(" = ").append(table * i).append("</td>");
            buf.append("</tr>");
        }

        buf.append("</table>");

        return "text/html";
    }
}
