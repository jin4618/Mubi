package com.Mubi.impl.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.userDAO;

public class userInsert implements userImpl {

	@Override
	public void user(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		
		userDAO udao2 = new userDAO();
		/*
		 * HttpSession session = request.getSession(); session.setAttribute("id", id);
		 */
		udao2.userInsert(id, pw, name, birth, email, tel, address);

	}

}
