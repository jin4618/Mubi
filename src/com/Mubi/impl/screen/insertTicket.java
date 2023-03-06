package com.Mubi.impl.screen;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ticketDAO.ticketDAO;

public class insertTicket implements screenImpl {

	@Override
	public void screen(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		response.setContentType("application/json; charset=utf-8");
		
		String id = request.getParameter("id");
		String orititle = request.getParameter("title");
		String oritheater = request.getParameter("theater");
		String oridate = request.getParameter("scheduleDate");
		String oritime = request.getParameter("scheduleTime");
		
		System.out.println(id);
		System.out.println(orititle);
		System.out.println(oritheater);
		System.out.println(oridate);
		System.out.println(oritime);
		
		ticketDAO tdao = new ticketDAO();
		
		tdao.insertTicket(id, orititle, oritheater, oridate, oritime);

	}

}
