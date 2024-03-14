import java.io.*;
import javax.servlet.*;
abstract class GenericServlet implements Servlet{
	ServletConfig con;
	
	public void init(){
		
	}
	
	public void init(ServletConfig conf){
		this.con=conf;
		System.out.println("init(ServletConfig conf)....From GenericServlet class ");
		init();
	}
	
	public abstract void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException;
	
	public void destroy(){
		
	}
	
	public String getServletInfo(){
		return "Test";
	}
	
	public ServletConfig getServletConfig(){
		return con;
	}
} 
public class ABCServlet extends GenericServlet{
	
	public void init(){//overriden
		System.out.println("init() Overriden in ABCServlet Class ");
	}
	
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter out=res.getWriter();
		out.println("Service Method from ABCServlet Class");
	}
}