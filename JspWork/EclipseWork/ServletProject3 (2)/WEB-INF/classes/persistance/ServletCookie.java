package persistance;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCookie extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("euc-kr");
		
		if(req.getMethod().equals("POST")) {
			String name = req.getParameter("name");
			String addr = req.getParameter("addr");
			
			Cookie nameCook = new Cookie("name", name);
			Cookie addrCook = new Cookie("addr", addr);
			
			// 초 단위. 만료기간 설정
			nameCook.setMaxAge(60 * 60 * 24);
			addrCook.setMaxAge(60 * 60 * 24);
			
			// 사용자에게 응답할 때 쿠키도 같이 저장시키겠다
			resp.addCookie(nameCook);
			resp.addCookie(addrCook);
			
			resp.getWriter().println("쿠키가 저장되었습니다.");
		} 
		else {
			Cookie[] cooks = req.getCookies();
			for(Cookie c : cooks) {
				resp.getWriter().println(c.getName() + ", " + c.getValue());
			}
		}
	}
	
}
