package com.capestart.module.service;

import com.capestart.module.entity.RegisterEntity;

public interface validateUserDetailsService {

		public boolean saveUserDetails(RegisterEntity registerEntity);
		public boolean validateLoginUser(RegisterEntity registerEntity);
}
