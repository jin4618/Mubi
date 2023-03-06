package com.Mubi.impl.screen;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ticketDAO.ticketDAO;
import ticketVO.movieVO;
import ticketVO.scheduleVO;

public class searchTheater implements screenImpl {

	@Override
	public void screen(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String orititle = request.getParameter("title");
		
		ticketDAO tdao = new ticketDAO();
		
		ArrayList<scheduleVO> theater = tdao.searchTheater(orititle);
		
		System.out.println(orititle);
		
		request.setAttribute("orititle", orititle);
		request.setAttribute("theater", theater);
		
		ArrayList<movieVO> mlist1 = tdao.movieAll();
		
		request.setAttribute("mlist1", mlist1);

	}

}
