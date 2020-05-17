package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: win
 * @date: 星期日
 */
@Controller
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String helloWorld(){
		return "hello world!";
	}

}
