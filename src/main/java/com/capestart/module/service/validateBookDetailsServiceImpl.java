package com.capestart.module.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capestart.module.dao.bookDetailsDao;
import com.capestart.module.entity.BooksEntity;
import com.capestart.module.entity.RegisterEntity;

public class validateBookDetailsServiceImpl implements validateBookDetailsService {
	
	@Autowired
	bookDetailsDao detailDao;

	@Override
	public boolean saveBookDetails(BooksEntity bookEntity) {
		boolean flag=false;
		List<BooksEntity> bookEntityList=detailDao.getBookDetails();
		for(BooksEntity entity :bookEntityList ) {
			if(entity.getBookName().equals(bookEntity.getBookName())) 
				flag=true;
			    break;
		}
		if(flag) {
			return false;
		}
		boolean result = detailDao.saveBookDetails(bookEntity);
		return result;
	}

	@Override
	public List<BooksEntity> ShowBooks(List<BooksEntity> bookEntity) {
		List<BooksEntity> bookEntityList=detailDao.getBookDetails();
		return bookEntityList;
	}

}
