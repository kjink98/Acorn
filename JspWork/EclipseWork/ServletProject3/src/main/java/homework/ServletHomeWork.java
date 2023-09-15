package homework;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletHomeWork extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("euc-kr");
		
		String cookies = req.getParameter("cook");
		PrintWriter out = resp.getWriter(); 
		out.println("<html><body>");
		
		Enumeration<String> enumer = req.getParameterNames();
		while(enumer.hasMoreElements()) {
			String name = enumer.nextElement();
			if(name != null) {
				String[] values = req.getParameterValues(name);
				out.println("<ul>");
				out.println(name);
				for(String val : values) {
					out.println("<li>" + val + "</li>");
					if(cookies != null && cookies.equals("on")) {
						Cookie cooks = new Cookie(name, val);
						cooks.setMaxAge(60 * 60 * 24);
						resp.addCookie(cooks);
					}
				}
				out.println("</ul>");
			}
		}
		
		
		out.println("</body></html>");
		out.close();
	}

}
