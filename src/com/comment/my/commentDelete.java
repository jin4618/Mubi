package com.comment.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commentDAO.commentDAO;

public class commentDelete implements commentImpl {

	@Override
	public void comment(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		int rno = Integer.parseInt(request.getParameter("rno"));
		
		commentDAO bdao = new  commentDAO();
		
		bdao.commentDelete(rno);
				
	}

}
