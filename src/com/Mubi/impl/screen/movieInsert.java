package com.Mubi.impl.screen;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ticketDAO.ticketDAO;

public class movieInsert implements screenImpl {

	@Override
	public void screen(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		int mid = Integer.parseInt(request.getParameter("mid"));
		String title = request.getParameter("title");
		
		ticketDAO tdao = new ticketDAO();
		
		tdao.movieInsert(mid, title);

	}

}
