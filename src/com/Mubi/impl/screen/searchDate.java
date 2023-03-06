package com.Mubi.impl.screen;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ticketDAO.ticketDAO;
import ticketVO.movieVO;
import ticketVO.scheduleVO;

public class searchDate implements screenImpl {

	@Override
	public void screen(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String orititle = request.getParameter("title");
		
		String oritheater = request.getParameter("theater");
		
		ticketDAO tdao = new ticketDAO();
		
		ArrayList<scheduleVO> date = tdao.searchDate(orititle, oritheater);
		
		request.setAttribute("orititle", orititle);
		request.setAttribute("oritheater", oritheater);
		request.setAttribute("date", date);
		
		ArrayList<movieVO> mlist1 = tdao.movieAll();
		ArrayList<scheduleVO> theater = tdao.searchTheater(orititle);
		
		request.setAttribute("mlist1", mlist1);
		request.setAttribute("theater", theater);
		

	}

}
