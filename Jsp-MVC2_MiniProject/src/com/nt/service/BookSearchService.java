package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.BookBO;
import com.nt.dao.BookSearch;
import com.nt.dao.BookSearchDAO;
import com.nt.dto.BookDTO;

public class BookSearchService  implements BookSearchInterface {
	private BookSearch dao;
	public BookSearchService() {
		dao=new BookSearchDAO();
	}
public List<BookDTO> search(String category)throws Exception{
	BookSearchDAO dao=null;
	List<BookBO> listBO=null;
	List<BookDTO> listDTO=null;
	BookDTO dto=null;
	//use DAO
	dao=new BookSearchDAO();
    listBO=dao.find(category);
    //convert listBO to listDTO
    listDTO=new ArrayList<BookDTO>();
    
    for(BookBO bo:listBO) {
    	//copy each BO object to each DTO object
    	dto=new BookDTO();
    	dto.setBkid(bo.getBkid());
    	dto.setBookname(bo.getBookname());
    	dto.setAuthor(bo.getAuthor());
    	dto.setStatus(bo.getStatus());
    	dto.setCategory(bo.getCategory());
    //add DTO class object to listCollection
    	listDTO.add(dto);
   }//forloop
    return listDTO;
}//search()
}//class
