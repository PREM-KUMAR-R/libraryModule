package com.capestart.module.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capestart.module.config.libraryModuleConfig;
import com.capestart.module.entity.RegisterEntity;
import com.capestart.module.service.validateUserDetailsService;
import com.capestart.module.service.validateUserDetailsServiceImpl;


@Controller
public class RegisterController {
	
	ApplicationContext context = 
	         new AnnotationConfigApplicationContext(libraryModuleConfig.class);
	@RequestMapping("register")
	public String viewRegister(Model model) {
		RegisterEntity register=context.getBean(RegisterEntity.class);
		model.addAttribute("register",register);
		return "register";
	}
	
	@PostMapping("register")
	public String submitRegister(@ModelAttribute("register") RegisterEntity register) {
		validateUserDetailsService userDetailService=new validateUserDetailsServiceImpl();
		boolean result = userDetailService.saveUserDetails(register);
		if(result) {
			return "login";
		}
		return "register";
	}
}
