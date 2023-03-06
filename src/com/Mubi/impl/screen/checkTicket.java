package com.Mubi.impl.screen;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ticketDAO.ticketDAO;
import ticketVO.ticketVO;

public class checkTicket implements screenImpl {

	@Override
	public void screen(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		String id = request.getParameter("id");
		
		System.out.println(id);
		
		ticketDAO tdao = new ticketDAO();
		
		ArrayList<ticketVO> tlist1 = tdao.checkTicket(id);
		
		request.setAttribute("tlist1", tlist1);
		
	}

}
