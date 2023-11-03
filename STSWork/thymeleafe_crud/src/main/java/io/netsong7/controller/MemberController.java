package io.netsong7.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.netsong7.domain.Member;
import io.netsong7.repository.MemDao;

@Controller
@RequestMapping()
public class MemberController {
	// dao 주입 받기
	@Autowired
	private MemDao dao;
	
	@GetMapping("list")
	public String list(Model model) {
		ArrayList<Member> list = (ArrayList<Member>) dao.getDataAll();
		model.addAttribute("members", list);
		return "list";
	}
	
	// 페이지 이동
	@GetMapping("insert")
	public String insert() {
		return "insert";
	}
	
	// 데이터 받기
	@PostMapping("insert")
	public String insert(Member mem) {
		boolean result = dao.insertData(mem);
		
		if(result) {
			// redirect : 새로고침
			return "redirect:/list";
		}
		else {
			return "redirect:/error";
		}
	}
	
	@GetMapping("update")
	public String update(Member mem) {
		return "update";
	}
}
