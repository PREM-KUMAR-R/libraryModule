package com.capestart.module.service;

import java.util.List;

import com.capestart.module.entity.BooksEntity;
import com.capestart.module.entity.RegisterEntity;

public interface validateBookDetailsService {
	public boolean saveBookDetails(BooksEntity bookEntity);
	public List<BooksEntity> ShowBooks(List<BooksEntity> bookEntity);
}
