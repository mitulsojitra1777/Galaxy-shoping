package com.srinathji.shoping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.srinathji.shopngback.dao.CategoryDao;
import com.srinathji.shopngback.daoimpl.CategoryDaoImpl;
import com.srinathji.shopngback.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDao categoryDao; 
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("page", "home");
		mv.addObject("catogeries", categoryDao.list());
		mv.addObject("userClickHome", true);
		
		return mv;
	}

	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("page", "contact");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	@RequestMapping(value = { "/show/all/product" })
	public ModelAndView showAllProduct() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("page", "contact");
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("page", "about");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping(value = { "/show/catogery/{id}/products" })
	public ModelAndView showCategorywiseProduct(@PathVariable("id") int id) {
		Category category=null;
		category=categoryDao.getCategoryById(id);
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("page", category.getName());
		mv.addObject("catogeries", categoryDao.list());
		mv.addObject("catogery", category);
		mv.addObject("userClickCategoryProducts", true);
		mv.addObject("id", id);
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
