
public class Xyz implements Servlet{
	public String service(StringBuffer buf){
         
		for(int i=6; i>=1; i--)
			buf.append("<h"+i+">revers loop Hello Servlet</h"+i+">");
         
		return "text/html"; 
        }
}
