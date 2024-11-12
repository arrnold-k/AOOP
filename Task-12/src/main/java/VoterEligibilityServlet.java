import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VoterEligibilityServlet")
public class VoterEligibilityServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        String message;

        try {
            int age = Integer.parseInt(ageStr);

            if (age < 0 || age > 120) {
                message = "Invalid age. Please enter a realistic age.";
            } else if (age >= 18) {
                message = "Hello " + name + ", you are eligible to vote!";
            } else {
                message = "Hello " + name + ", you are not eligible to vote yet.";
            }
        } catch (NumberFormatException e) {
            message = "Invalid age format. Please enter a valid number for age.";
        }

        response.getWriter().println("<html><body>");
        response.getWriter().println("<h3>" + message + "</h3>");
        response.getWriter().println("</body></html>");
    }
}
