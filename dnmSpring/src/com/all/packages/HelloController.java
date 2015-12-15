package com.all.packages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(Model m) {
		m.addAttribute("controlMessage","Bu message controllerdan");
		return "hello";
	}
}
