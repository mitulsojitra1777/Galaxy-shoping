package com.srinathji.shoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("page", "home");
		mv.addObject("message", "Welcome to galaxy ace");
		return mv;
	}

	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("page", "contact");
		mv.addObject("message", "Welcome to galaxy ace");
		return mv;
	}

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("page", "about");
		mv.addObject("message", "Welcome to galaxy ace");
		return mv;
	}

	// queary string just Like
	// http://localhost:8080/shoping/testQuery?greeting=how r u
	@RequestMapping(value = { "/testQuery" })
	public ModelAndView testQuery(@RequestParam("greeting") String greeting) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("page", "testQuery");
		mv.addObject("message", greeting);
		return mv;
	}

	// path variable(clean url)
	//  just Like http://localhost:8080/shoping/parhVar/hello
	@RequestMapping(value = { "/parhVar/{greeting}" })
	public ModelAndView parhVar(@PathVariable("greeting") String greeting) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("page", "testQuery");
		mv.addObject("message", greeting);
		return mv;
	}

}