package com.nt.dao;

import java.util.List;

import com.nt.bo.BookBO;

public interface BookSearch {
	public List<BookBO> find(String category)throws Exception;
	
}
