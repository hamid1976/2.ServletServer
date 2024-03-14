
public class Abc implements Servlet{
	public String service(StringBuffer buf){
         
		for(int i=1; i<=6; i++)
			buf.append("<h"+i+">Hello Servlet</h"+i+">");
         
		return "text/html"; 
        }
}
