import javax.http.servlet.*;

public class AddSession extends HttpServlet{
   public void doGet(httpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
       PrintWrtiter out=res.getWriter();
	   
	   String item=req.getParameter("item");
	   String quantity=req.getParameter("quantity");
	   
	   HttpSession session=req.getSession(true);
	   session.addSession(item,quantity);
	   
	   out.println("successfully created....");  
   }//end doGet
}//end class 

public class ViewSession extends HttpServlet{
   public void doGet(httpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
       PrintWrtiter out=res.getWriter();
	   	   
	   HttpSession session=req.getSession(true);
	   Enumeration e=session.getAttributeNames();
	   
	   while(e.hasMoreElements()){
	      String item=e.nextElement();
	      String quantity=session.getAttribute(item);
		  
	      out.println("item: "+item);
		  out.println("quantity: "+quantity);
		  
		  out.println("<br>");
	   }//end for     
   }//end doGet
} //end class

public class DeleteSession extends HttpServlet{
   public void doGet(httpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
       PrintWrtiter out=res.getWriter();

	   String userItem=req.getParameter("item");	   	   
	   
	   HttpSession session=req.getSession(true);
	   
	   Enumeration e=session.getAttributeNames();
	   
	   while(e.hasMoreElements()){
	      String item=e.nextElement();
	      
		  if(userItem.equals(item)){
		      session.removeAttribute(item);
			  break;
		  }
	   }//end for     

	   out.println("successfully created....");  
   }//end doGet
} //end class


public class DeleteAll extends HttpServlet{
   public void doGet(httpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
       PrintWrtiter out=res.getWriter();

	   HttpSession session=req.getSession(true);
       session.invalidate();
	   
	   out.println("successfully created....");  
   }//end doGet
} //end class
