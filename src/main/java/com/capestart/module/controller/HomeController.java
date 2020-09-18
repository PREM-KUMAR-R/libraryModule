package com.capestart.module.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capestart.module.config.libraryModuleConfig;
import com.capestart.module.entity.BooksEntity;
import com.capestart.module.service.validateBookDetailsService;

@Controller
public class HomeController {
	ApplicationContext context = 
	         new AnnotationConfigApplicationContext(libraryModuleConfig.class);
	@Autowired
	validateBookDetailsService bookDetailService;
	@RequestMapping("home")
	public String viewHome(Model model){
		return "home";
	}
	
	@RequestMapping("addBooks")
	public String viewAddBook(Model model) {
		BooksEntity bookEntity=context.getBean(BooksEntity.class);
		model.addAttribute("book",bookEntity);
		return "addBooks";
	}
	
	@PostMapping("addBooks")
	public String loadAddBook(@ModelAttribute("book")BooksEntity entity) {
		BooksEntity bookEntity=context.getBean(BooksEntity.class);
		boolean result = bookDetailService.saveBookDetails(bookEntity);
		if(result) {
			return "home";
		}
		else
			return "addBooks";
	}
	
}
