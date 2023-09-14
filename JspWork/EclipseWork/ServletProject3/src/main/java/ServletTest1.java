import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// System.out.println("서블릿 테스트..");
		// 데이터 꺼내오기
//		String name = req.getParameter("name");
//		String age = req.getParameter("age");
//		System.out.println("get: " + name + ", " + age);
		
		// 정보가 어딨는지 알아오겠다. 그걸 객체로 만든다
		// 사용자에게 보기좋게 보여주기 위해 html로 출력
//		PrintWriter out = resp.getWriter();
//		out.println("<html><body>");
//		out.println("<ul>");
//		out.println("<li>이름 : " + name + "</li>");
//		out.println("<li>나이 : " + age + "</li>");
//		out.println("</ul>");
//		out.println("</html></body>");
//		out.close();
		
		// get과 post가 똑같이 처리가 된다면 한 쪽으로 몰아줘서 내용 중복 안되고 호출할 수 있도록
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 인코딩
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("euc-kr");
		
		String name = req.getParameter("name");
		String age = req.getParameter("age");
//		System.out.println("post: " + name + ", " + age);
		// req.getMethod() : 요청 방식이 클라이언트가 어떤 방식으로 했는지 뽑아내는 방법
		System.out.println(req.getMethod() + ": " + name + ", " + age);
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<ul>");
		out.println("<li>이름 : " + name + "</li>");
		out.println("<li>나이 : " + age + "</li>");
		out.println("</ul>");
		out.println("</html></body>");
		out.close();
	}

}