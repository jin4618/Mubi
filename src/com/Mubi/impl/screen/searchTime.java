package com.Mubi.impl.screen;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ticketDAO.ticketDAO;
import ticketVO.movieVO;
import ticketVO.scheduleVO;

public class searchTime implements screenImpl {

	@Override
	public void screen(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String orititle = request.getParameter("title");
		String oritheater = request.getParameter("theater");
		String oridate = request.getParameter("scheduleDate");
		
		ticketDAO tdao = new ticketDAO();
		
		ArrayList<scheduleVO> time = tdao.searchTime(orititle, oritheater, oridate);
		
		System.out.println(orititle);
		System.out.println(oritheater);
		System.out.println(oridate);		
		
		request.setAttribute("orititle", orititle);
		request.setAttribute("oritheater", oritheater);
		request.setAttribute("oridate", oridate);
		request.setAttribute("time", time);
		
		ArrayList<movieVO> mlist1 = tdao.movieAll();
		ArrayList<scheduleVO> theater = tdao.searchTheater(orititle);
		ArrayList<scheduleVO> date = tdao.searchDate(orititle, oritheater);
		
		request.setAttribute("mlist1", mlist1);
		request.setAttribute("theater", theater);
		request.setAttribute("date", date);
	}

}
