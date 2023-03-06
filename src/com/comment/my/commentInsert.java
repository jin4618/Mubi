package com.comment.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commentDAO.commentDAO;

public class commentInsert implements commentImpl {

	@Override
	public void comment(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		commentDAO bdao = new commentDAO();
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		
		bdao.commentInsert(id, title, contents);
	}

}
