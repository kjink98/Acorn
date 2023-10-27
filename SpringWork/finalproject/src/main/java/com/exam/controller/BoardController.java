package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.domain.Board;

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
		return "board/list";
	}
	@GetMapping("/write")
	public String write() {
		return "board/write";
	}
	
	// 오버라이딩
	@PostMapping()
	public String write(@ModelAttribute Board board) {
		System.out.println("rwrwr");
		return null;
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
