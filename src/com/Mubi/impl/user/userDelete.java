package com.Mubi.impl.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.userDAO;

public class userDelete implements userImpl {

	@Override
	public void user(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println("아이디 : " + id);
		System.out.println("비번 : " + pw);
		
		userDAO udao3 = new userDAO();
		int delete = udao3.userDelete(id, pw);
		int login = udao3.userLogin(id, pw);
		
		String result = "";
		
		if(delete == 1) {
			result = "탈퇴 성공 ";
			HttpSession session = request.getSession();
			session.setAttribute("delete", delete);
			session.setAttribute("login", -3);
		}
		
		else {
			result = "탈퇴 실패 ";
			HttpSession session = request.getSession();
			session.setAttribute("delete", delete);
			session.setAttribute("login", 1);
		}
		
		System.out.println(result + delete);
		
		udao3.userDelete(id, pw);

	}

}
