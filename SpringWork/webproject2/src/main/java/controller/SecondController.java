package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.User;


@Controller
public class SecondController {
	// name과 같음
	@RequestMapping("/first")
	public String firstPage() {
		return "WEB-INF/views/first.jsp";
	}

	// request 받아와서 꺼내오기
	@RequestMapping("/second")
	public ModelAndView secondPage(HttpServletRequest req) {
		String p1 = req.getParameter("p1");
		String p2 = req.getParameter("p2");
		System.out.println(p1 + ", " + p2);
		
		// 데이터를 갖고 페이지 이동을 하기 위해
		ModelAndView mv = new ModelAndView("/WEB-INF/views/second.jsp");
		mv.addObject("param1", p1);
		mv.addObject("param2", p2);
		return mv;
	}
	
	// value라는 것이 원래는 생략. 여러 번 쓰려면 써야함
//	@RequestMapping(value="/third", method=RequestMethod.POST)
	@PostMapping("/third")
	public String thirdPage(
			// 넘어오는 변수와 이름이 같으면 어노테이션 생략 가능
			String name, 
			@RequestParam ("age") int nai, 
			@RequestParam double point) {
		System.out.println(name + ", " + nai + ", " + point);
		return "/WEB-INF/views/third.jsp";
	}
	
//	@GetMapping("/fourth")
//	public String fourthPage(String name, int age, double point, Model model) {
//		User dto = new User();
//		dto.setName(name);
//		dto.setAge(age);
//		dto.setPoint(point);
//		
//		model.addAttribute(dto);
//		
//		return "/WEB-INF/views/fourth.jsp";
//	}
	
//	@GetMapping("/fourth")
//	public ModelAndView fourthPage(String name, int age, double point) {
//		User dto = new User();
//		dto.setName(name);
//		dto.setAge(age);
//		dto.setPoint(point);
//		
//		
//		ModelAndView mv = new ModelAndView("/WEB-INF/views/fourth.jsp");
//		mv.addObject("user", dto);
//		
//		return mv;
//	}
	
	@GetMapping("/fourth")
	public ModelAndView fourthPage(@ModelAttribute User dto) {
		
		
		ModelAndView mv = new ModelAndView("/WEB-INF/views/fourth.jsp");
		mv.addObject("user", dto);
		
		return mv;
	}
}
