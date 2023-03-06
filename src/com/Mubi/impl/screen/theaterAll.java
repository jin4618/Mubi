package com.Mubi.impl.screen;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ticketDAO.ticketDAO;
import ticketVO.theaterVO;

public class theaterAll implements screenImpl {

	@Override
	public void screen(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		ticketDAO tdao =  new ticketDAO();

		ArrayList<theaterVO> thlist1 = tdao.theaterAll();
		
		request.setAttribute("thlist1", thlist1);
	}

}
