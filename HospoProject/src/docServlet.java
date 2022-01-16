import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/userServlet")
public class docServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
//		out.println("Hello Lahu");
		
		int uId=Integer.parseInt(request.getParameter("uId"));
		String Name=request.getParameter("name");
		String Email=request.getParameter("email");
		String password=(request.getParameter("pass"));
		String cPassword=(request.getParameter("cpass"));
		String mobile=(request.getParameter("mob"));
		String Qual=request.getParameter("qaul");
		String spec=request.getParameter("spec");
		String City=request.getParameter("city");
		int pincode=Integer.parseInt(request.getParameter("pin"));
		
		System.out.println(Name + " "+mobile + "" +Email);
		
		hibernateDocDao hdd=new hibernateDocDao();
		
		docter d=new docter(uId,Name,Email,password,cPassword,mobile,Qual,spec,City,pincode);
//		user u=new user();
		
		hdd.insertUser(d);
		
		
		//Sending user conformation Emails
		
		out.println("<h1 style='color:green;'><center>Hello Docter Thank you for Registration with us<center></h1> ");
		
	    String to=request.getParameter("email");  
	    String subject="User Registration Conformation Email";
	    String msg="Hello Docter thank u for Registration with us.We are Heartly Welcome you to our Healthify family"; 
	          
	    Mailer.send(to, subject, msg);  
	    out.print("<h2><center>Please check you Email for more Details<center></h2>");  
	    out.close();  
		
	
	}

}

