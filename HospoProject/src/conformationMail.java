import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
  
public class conformationMail extends HttpServlet {  
public void doGet(HttpServletRequest request,  
 HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    String to=request.getParameter("to");  
    String subject="User Registration Conformation Email";
    String msg="Dear user thank u for Registration with us.";
          
    Mailer.send(to, subject, msg);  
    out.print("message has been sent successfully");  
    out.println("welcome");
    out.println("");
    out.close();  
    }  
  
}  


