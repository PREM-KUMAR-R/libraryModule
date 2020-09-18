package com.capestart.module.config;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.capestart.module.dao.validateUserDetailsDao;
import com.capestart.module.dao.validateUserDetailsDaoImpl;
import com.capestart.module.entity.BooksEntity;
import com.capestart.module.entity.RegisterEntity;
import com.capestart.module.service.validateUserDetailsService;
import com.capestart.module.service.validateUserDetailsServiceImpl;


@Component
public class libraryModuleConfig {
	@Bean
	public RegisterEntity getRegisterEntity() {
		return new RegisterEntity();
	}
	
	@Bean
	public validateUserDetailsService getUserDetailsService() {
		return new validateUserDetailsServiceImpl();
	}
	
	@Bean
	public validateUserDetailsDao getUserDetailsDao() {
		return new validateUserDetailsDaoImpl();
	}
	
	@Bean
	public BooksEntity getBooksEntity() {
		return new BooksEntity();
	}
}
