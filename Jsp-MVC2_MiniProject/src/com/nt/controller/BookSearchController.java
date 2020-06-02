package com.nt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.nt.dto.BookDTO;
import com.nt.service.BookSearchInterface;
import com.nt.service.BookSearchService;

@WebServlet("/controllerurl")
public class BookSearchController extends HttpServlet {
	private BookSearchInterface service;
	@Override
	public void init() throws ServletException {
	service=new BookSearchService();	
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String category=null;
		String source=null;
		List<BookDTO> listDTO=null;
		RequestDispatcher rd=null;
		//read form data
		category=req.getParameter("category");
		source=req.getParameter("source");
		//use service class
		service=new BookSearchService();
		try {
			listDTO=service.search(category);
		}
		catch(Exception e) {
			rd=req.getRequestDispatcher("/err.jsp");
			rd.forward(req, res);
			return;
		}
		//keep ListDTO in request attribute
		req.setAttribute("bookslist",listDTO);
		//forward the request to destination page based on the button that is clicked
		if(source.equals("html")) {
			rd=req.getRequestDispatcher("/html_screen.jsp");
		}
		else {
			rd=req.getRequestDispatcher("/excel_screen.jsp");
		}
		rd.forward(req, res);
	}//doget()
	public void Destroy() {
		service=null;
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
