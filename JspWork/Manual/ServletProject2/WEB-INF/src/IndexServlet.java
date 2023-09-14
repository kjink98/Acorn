import javax.servlet.http.*;
import java.io.*;

// javac -d ../classes .\IndexServlet.java
public class IndexServlet extends HttpServlet {
		protected void	doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
			//System.out.println("Get Test ...");
			
			// Returns a PrintWriter object that can send character text to the client
			PrintWriter out = resp.getWriter();
			// need to decorate html inside Java
			out.println("<html><body><h1>Good Request~<h1></body></html>");
			out.close();
	}

		protected void	doPost(HttpServletRequest req, HttpServletResponse resp){
			System.out.println("Post Test ...");
	}
}