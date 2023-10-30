package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.exam.domain.Board;
import com.exam.service.BoardService;

@Controller
// Request로 class로 접근
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService boardService;
//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
//			throws Exception {
//		// TODO Auto-generated method stub
//		return new ModelAndView ("/WEB-INF/views/board/list.jsp");
//	}
	@GetMapping("/list")
	public ModelAndView list(Model model) throws Exception {
		// db에서 꺼내오기
		
		// 전체 글 조회
		List<Board> list = boardService.getList();
		// view에게 데이터 전달
		ModelAndView mv = new ModelAndView("board/list");
		mv.addObject("list", list);
		return mv;
	}
	@GetMapping("/write")
	public String write() {
		return "board/write";
	}
	
	// 오버라이딩
	@PostMapping("/write")
	public String write(@ModelAttribute Board board) throws Exception {
		// db에 저장
		boardService.write(board);
		// list로 리턴
		return "redirect:/board/list";
	}
	
	@GetMapping("/read")
	public void read(@RequestParam int bNo, Model model) throws Exception{
		Board board = boardService.read(bNo);
		model.addAttribute(board);
	}
	@GetMapping("/delete")
	public String delete() {
		return null;
	}
}
