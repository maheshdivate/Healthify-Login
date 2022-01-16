

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class verification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 response.setContentType("text/html");
	 PrintWriter out=response.getWriter();
	 
	 String Email=request.getParameter("email");
	 String pass=request.getParameter("pass");
	 
	 hibernateMain hbr=new hibernateMain();
	 
	 
	 if(hbr.validateUser(Email))
	 {
		 out.println("Successfully Verified Welcome User");
	 }
	 
	 if(Email.equals("admin@healtify.com") && pass.equals("Mahesh#@123"))
	 {
		List<user>result= hbr.viewData();
		
		for(user u:result)
		{
			out.println(u);
			out.println("");
		}
	 }
	 
	 else {
		 out.print("Seems you dont have registered With us.Please Register");
	 }
	 
		
	}

}
