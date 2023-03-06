package com.Mubi.impl.screen;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ticketDAO.ticketDAO;
import ticketVO.movieVO;

public class movieAll implements screenImpl {

	@Override
	public void screen(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		ticketDAO tdao =  new ticketDAO();
		
		ArrayList<movieVO> mlist1 = tdao.movieAll();
		
		request.setAttribute("mlist1", mlist1);

	}

}
