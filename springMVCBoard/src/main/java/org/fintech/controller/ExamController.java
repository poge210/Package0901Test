package org.fintech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/exam/*")
@Controller
public class ExamController {
	
	@GetMapping("/test1")
	public void dotest1() {
	}
	

	@GetMapping("/test2")
	public void dotest2() {
	}
	

	@GetMapping("/test3")
	public void dotest3() {
	}
}
