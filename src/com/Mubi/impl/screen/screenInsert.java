package com.Mubi.impl.screen;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ticketDAO.ticketDAO;



public class screenInsert implements screenImpl {

	@Override
	public void screen(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		String title = request.getParameter("title");
		String theater = request.getParameter("theater");
		String scheduleDate = request.getParameter("scheduleDate");
		String scheduleTime = request.getParameter("scheduleTime");
		
		ticketDAO tdao = new ticketDAO();
		
		tdao.screenInsert(title, theater, scheduleDate, scheduleTime);		
	}

}
