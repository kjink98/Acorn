package io.netsong7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
// @RestController : 이 클래스가 view다. 응답할 클래스이다.
@RestController
public class HelloController {
	// 처음 접속했을 때 호출
	@GetMapping("/")
	// 데이터를 바로 호출
	@ResponseBody
	public String hello() {
		return "Hello Spring Boot!!!";
	}
}
