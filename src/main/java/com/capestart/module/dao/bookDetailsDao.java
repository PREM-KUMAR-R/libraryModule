package com.capestart.module.dao;

import java.util.List;

import com.capestart.module.entity.BooksEntity;


public interface bookDetailsDao {
	public boolean saveBookDetails(BooksEntity bookEntity);
    public List<BooksEntity> getBookDetails();
}
