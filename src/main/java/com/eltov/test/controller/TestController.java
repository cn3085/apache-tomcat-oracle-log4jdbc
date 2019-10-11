package com.eltov.test.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eltov.test.service.TestService;

@Controller
public class TestController {
	
	@Inject
	TestService testService;

	@RequestMapping("*.do")
	public String getJsp(HttpServletRequest req, Model model) {
		String result = testService.getTest();
		model.addAttribute("result", result);
		return "home";
	}
	
	@RequestMapping("/test")
	public String getTest(Model model) {
		String result = testService.getTest();
		model.addAttribute("result", result);
		return "home";
	}
	
}
