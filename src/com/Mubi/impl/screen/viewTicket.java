package com.Mubi.impl.screen;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class viewTicket implements screenImpl {

	@Override
	public void screen(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		String orititle = request.getParameter("title");
		String oritheater = request.getParameter("theater");
		String oridate = request.getParameter("scheduleDate");
		String oritime = request.getParameter("scheduleTime");
		
		request.setAttribute("id", id);
		request.setAttribute("orititle", orititle);
		request.setAttribute("oritheater", oritheater);
		request.setAttribute("oridate", oridate);
		request.setAttribute("oritime", oritime);

	}

}
