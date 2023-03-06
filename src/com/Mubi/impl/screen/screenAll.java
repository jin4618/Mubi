package com.Mubi.impl.screen;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ticketDAO.ticketDAO;
import ticketVO.movieVO;
import ticketVO.scheduleVO;
import ticketVO.theaterVO;

public class screenAll implements screenImpl {

	@Override
	public void screen(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		ticketDAO tdao =  new ticketDAO();
		ArrayList<scheduleVO> sclist1 = tdao.scheduleAll();
		
		request.setAttribute("sclist1", sclist1);
	
	}
}
