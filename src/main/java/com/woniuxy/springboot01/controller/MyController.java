package com.woniuxy.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@ResponseBody
	@RequestMapping("/doTest")
	public String doTest() {
		return "DoTest222";
	}
}
