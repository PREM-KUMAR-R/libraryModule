package com.capestart.module.dao;

import java.util.List;

import com.capestart.module.entity.RegisterEntity;

public interface validateUserDetailsDao {
        public boolean saveUserDetails(RegisterEntity register);
        public List<RegisterEntity> getUserDetails();
}
