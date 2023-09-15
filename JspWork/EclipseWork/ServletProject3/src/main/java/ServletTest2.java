import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 인코딩
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("euc-kr");

		// 화면에 출력
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		
		// getParameterValues 사용
		// getParameterValues은 중복 코드가 너무 많음
		/* 
		// 좋아하는 가수 데이터 꺼내오기
		String[] singers = req.getParameterValues("singer");

		System.out.println("singers : " + singers.length); // 개수 알아보기
		// textbox는 기본적으로 공백문자가 입력 됨. 따라서 4개가 전달 됨

		out.println("<h3>당신이 입력한 가수이름입니다.</h3>");
		out.println("<ul>");
		for (String singer : singers) {
			out.println("<li>" + singer + "</li>");
		}
		out.println("</ul>");

		try {
			// 좋아하는 음식 데이터 꺼내오기
			String foods[] = req.getParameterValues("food");

			System.out.println("foods : " + foods.length); // 개수 알아보기
			// checkbox는 아무것도 선택안하면 null값 리턴

			out.println("<h3>당신이 입력한 음식이름입니다.</h3>");
			out.println("<ul>");
			for (String food : foods) {
				out.println("<li>" + food + "</li>");
			}
			out.println("</ul>");
		} catch (NullPointerException err) {
			out.println("음식을 선택하지 않았습니다.");
		}

		try {
			String[] citys = req.getParameterValues("city");

			System.out.println("citys : " + citys.length); // 개수 알아보기

			out.println("<h3>당신이 입력한 도시이름입니다.</h3>");
			out.println("<ul>");
			for (String city : citys) {
				out.println("<li>" + city + "</li>");
			}
			out.println("</ul>");
		} catch (NullPointerException err) {
			out.println("도시를 선택하지 않았습니다.");
		}
		// 좋아하는 도시 데이터 꺼내오기
*/
		
		//getParameterNames 사용
		// Enumeration: iterator. 열거형. 줄세우기. 꺼내오는거 쉽게 하기 위해
		Enumeration<String> enumer = req.getParameterNames();
		// 꺼내올게 없을 때까지 반복
		while(enumer.hasMoreElements()) {
			String name = enumer.nextElement();
			if(name != null) {
				// name이 null값이 아니면 데이터 꺼내오기
				String[] values = req.getParameterValues(name);
				out.print("<h3>당신이 입력한 " + name + "이름입니다.</h3>");
				out.println("<ul>");
				for (String val : values) {
					out.println("<li>" + val + "</li>");
				}
				out.println("</ul>");
			}
		}
		out.println("</body></html>");
		out.close();

	}

}