package com.Mubi.impl.screen;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ticketDAO.ticketDAO;

public class theaterInsert implements screenImpl {

	@Override
	public void screen(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		int tid = Integer.parseInt(request.getParameter("tid"));
		String theater = request.getParameter("theater");
		
		ticketDAO tdao = new ticketDAO();
		
		tdao.theaterInsert(tid, theater);
	}

}
