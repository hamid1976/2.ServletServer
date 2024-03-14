import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
abstract class HttpServlet extends GenericServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		ServletException e=new ServletException();
			throw e;
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		ServletException e=new ServletException();
			throw e;
	}
	
	public void doPut(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		ServletException e=new ServletException();
			throw e;
	}
	
	public void doTrace(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		ServletException e=new ServletException();
			throw e;
	}
	
	public void doDelete(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		ServletException e=new ServletException();
			throw e;
	}
	
	public void doHead(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		ServletException e=new ServletException();
			throw e;
	}
	
	public void doXxx(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		ServletException e=new ServletException();
			throw e;
	}
	
	public void service(ServletRequest req,ServletResponse res)
		throws ServletException,IOException{
			
			HttpServletRequest request=(HttpServletRequest)req;
			
			HttpServletResponse response=(HttpServletResponse)res;
			
			service(request,response);
			
			
	}
	
	public void service(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
			
		String m=req.getMethod();
		
		if(m.equals("GET"))
			doGet(req,res);
			
		if(m.equals("POST"))
			doPost(req,res);

		if(m.equals("PUT"))
			doPut(req,res);
		
		if(m.equals("TRACE"))
			doTrace(req,res);
		
		if(m.equals("DELETE"))
			doDelete(req,res);
		
		if(m.equals("HEAD"))
			doHead(req,res);
		
		if(m.equals("XXX"))
			doXxx(req,res);
		
	}
	
}
public class XYZServlet extends HttpServlet{
	
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter out=res.getWriter();
		out.println("service()....");
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		PrintWriter out=res.getWriter();
		out.println("Hello from doGet()....");
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		PrintWriter out=res.getWriter();
		out.println("Hello from doPost()....");
	}
	
	public void service(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		PrintWriter out=res.getWriter();
		out.println("service(HttpServletRequest)....");
	}
	
}