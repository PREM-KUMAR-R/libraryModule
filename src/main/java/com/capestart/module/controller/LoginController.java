package com.capestart.module.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capestart.module.entity.RegisterEntity;
import com.capestart.module.service.validateUserDetailsService;
import com.capestart.module.service.validateUserDetailsServiceImpl;


@Controller
public class LoginController {
	@Autowired
	validateUserDetailsService userDetailService;
	
	@RequestMapping("login")
	public String viewRegister(Model model) {
		RegisterEntity register=new RegisterEntity();
		model.addAttribute("login",register);
		return "login";
	}
	
	@PostMapping("login")
	public String submitRegister(@ModelAttribute("login") RegisterEntity registerEntity) {
		boolean result = userDetailService.validateLoginUser(registerEntity);
		if(result)
			return "home";
		else 
			return "login";
	}
}
