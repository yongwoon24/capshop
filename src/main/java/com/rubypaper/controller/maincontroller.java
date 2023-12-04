package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class maincontroller {
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", "안녕하세요, 스프링 부트 웹 페이지입니다!");
        return "hello";
	}
}
