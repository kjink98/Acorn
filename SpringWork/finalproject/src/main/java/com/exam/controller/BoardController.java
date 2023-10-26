package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// Request로 class로 접근
@RequestMapping("/board")
public class BoardController {

//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
//			throws Exception {
//		// TODO Auto-generated method stub
//		return new ModelAndView ("/WEB-INF/views/board/list.jsp");
//	}
	@GetMapping("/list")
	public String list() {
		return "/WEB-INF/views/board/list.jsp";
	}
	@GetMapping("/write")
	public String write() {
		return "/WEB-INF/views/board/write.jsp";
	}
	@GetMapping("/read")
	public String read() {
		return null;
	}
	@GetMapping("/delete")
	public String delete() {
		return null;
	}
}
