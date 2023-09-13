import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
		protected void	doGet(HttpServletRequest req, HttpServletResponse resp){
			System.out.println("Servlet Running..."); // Tomcat console
	}
}