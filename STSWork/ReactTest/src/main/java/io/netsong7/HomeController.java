package io.netsong7;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class LoginDto{
	private String userId;
	private String passwd;
	
	public LoginDto(String userId, String passwd) {
		this.userId = userId;
		this.passwd = passwd;
	}

	public String getUserId() {
		return userId;
	}

	public String getPasswd() {
		return passwd;
	}
}
@Controller
@RestController
public class HomeController {
	@RequestMapping("/")
	public LoginDto test1() {
		return new LoginDto("hong", "1234");
	}
	
	@RequestMapping("/map")
	public HashMap<String, String> test2(){
		HashMap<String, String> map = new HashMap<>();
		map.put("userid", "kim");
		map.put("address", "seoul");
		return map;
	}
	
	@RequestMapping("/list")
	public ArrayList<LoginDto> test3() {
		ArrayList<LoginDto> list = new ArrayList<LoginDto>();
		
		list.add(new LoginDto("hong", "1234"));
		list.add(new LoginDto("lee", "5678"));
		list.add(new LoginDto("kim", "4321"));
		
		return list;
	}
}
