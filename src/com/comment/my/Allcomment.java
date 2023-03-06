package com.comment.my;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commentDAO.commentDAO;
import commentVO.commentVO;

public class Allcomment implements commentImpl {

	@Override
	public void comment(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		commentDAO bdao = new commentDAO();
		
		String movieName = request.getParameter("title");
		System.out.println(movieName);
		ArrayList<commentVO> alist = bdao.movie1(movieName);
		
		String str = null;
		
		if(movieName.equals("아바타 - 물의 길")) {
			str = "movieinformationA.jsp";
		}
		else if(movieName.equals("올빼미")){
			str = "movieinformationB.jsp";
		}
		else if(movieName.equals("탄생")){
			str = "movieinformationC.jsp";
		}
		else if(movieName.equals("영웅")){
			str = "movieinformationD.jsp";
		}
		
		System.out.println(str);
		
		request.setAttribute("str", str);
		
		request.setAttribute("alist", alist);
	}

}
