package songhq.club.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import songhq.club.service.HelloService;

@Controller
@RequestMapping("hello")
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/world")
	@ResponseBody
	public String hello() {
		return "hello world";
	}

}