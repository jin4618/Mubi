package com.comment.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commentDAO.commentDAO;
import commentVO.commentVO;

public class commentUpdate implements commentImpl {

	@Override
	public void comment(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String contents = request.getParameter("contents");
		int rno = Integer.parseInt(request.getParameter("rno"));
		
		commentDAO bdao = new commentDAO();
		bdao.commentUpdate(contents,rno);
			
	}

}
