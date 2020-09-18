package com.capestart.module.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capestart.module.dao.validateUserDetailsDao;
import com.capestart.module.dao.validateUserDetailsDaoImpl;
import com.capestart.module.entity.RegisterEntity;



public class validateUserDetailsServiceImpl implements validateUserDetailsService{
	validateUserDetailsDao detailDao=new validateUserDetailsDaoImpl();
	@Override
	public boolean saveUserDetails(RegisterEntity registerEntity) {
		boolean flag=false;
		List<RegisterEntity> registerEntityList=detailDao.getUserDetails();
		for(RegisterEntity entity :registerEntityList ) {
			if(entity.getMoblieNumber().equals(registerEntity.getMoblieNumber())) 
				flag=true;
			    break;
		}
		if(flag) {
			return false;
		}
		boolean result = detailDao.saveUserDetails(registerEntity);
		return result;
	}

	@Override
	public boolean validateLoginUser(RegisterEntity registerEntity) {
		boolean flag=false;
		List<RegisterEntity> registerEntityList=detailDao.getUserDetails();
		for(RegisterEntity entity :registerEntityList ) {
			if(entity.getMoblieNumber().equals(registerEntity.getMoblieNumber())) {
				if(entity.getMobilePin()==registerEntity.getMobilePin())
					flag=true;
			    	break;
			}
		}
		return flag;
	}
	

}
