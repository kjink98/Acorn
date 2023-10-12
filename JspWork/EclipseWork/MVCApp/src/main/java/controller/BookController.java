package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BookDto;

public class BookController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String url= "";
		
		String cmd = req.getParameter("command");
		HttpSession session = req.getSession();
		// 똑같은 바구니를 계속 가져올 수 있게
		ArrayList bookList = (ArrayList)session.getAttribute("bookList");
		if(cmd.equals("BOOKSHOP")) {
			url = "views/bookshop.jsp";
		}
		else if(cmd.equals("CART")) {
			
			url = "views/bookshop.jsp";
			
			// 처음 실행했을 경우 bookList 생성
			if(bookList == null) {
				bookList = new ArrayList();
			}
			
			String book = req.getParameter("book");
			String quantity = req.getParameter("quantity");
			
			StringTokenizer token = new StringTokenizer(book, "/");
			String title = token.nextToken().trim();
			String author = token.nextToken().trim();
			String price = token.nextToken().trim();
			
			BookDto dto = new BookDto();
			dto.setAuthor(author);
			dto.setPrice(Integer.parseInt(price));
			dto.setQuantity(Integer.parseInt(quantity));
			dto.setTitle(title);
			
			// dto에 하나 담기
			//req.setAttribute("dto", dto);
			
			// 여러권 담기
			bookList.add(dto);
			session.setAttribute("bookList", bookList);
		}
		else if(cmd.equals("CHECKOUT")) {
		    url = "/WEB-INF/views/checkout.jsp";
			
			int sum = 0;
			for(int i=0; i<bookList.size(); i++) {
				BookDto book = (BookDto)bookList.get(i);
				sum += book.getPrice() * book.getQuantity();
			}
			session.setAttribute("amount", sum);
		}
		else if(cmd.equals("DEL")) {
		    url = "/WEB-INF/views/bookshop.jsp";
			// 몇 번째껄 삭제할 건지 순서
			int idx = Integer.parseInt(req.getParameter("cnt"));
			
			bookList.remove(idx);
		}
		RequestDispatcher view = 
				req.getRequestDispatcher(url);
		view.forward(req, resp);
		
	}
	
}