package com.Mubi.impl.user;

//import javax.servlet.RequestDispatcher;

//import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.userDAO;
//import user.userVO;

public class userLogin implements userImpl {

	@Override
	public void user(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println("아이디 : " + id);
		System.out.println("비번 : " + pw);
		
		userDAO udao = new userDAO();
		int login = udao.userLogin(id, pw);
		//int delete = udao.userDelete(id, pw);
		
		//System.out.println(delete + " dd");
		
		String result = "";
		
		if(login == 2) {
			result = "관리자 로그인 성공";
			HttpSession session = request.getSession();
			session.setAttribute("login", login);
			session.setAttribute("id", id);
		}
		
		else if(login == 1) {
			result = id + "님 정상 로그인 되셨습니다. ";
			HttpSession session = request.getSession();
			session.setAttribute("login", login);
			session.setAttribute("id", id);
		}
		
		else {
			result = "아이디 또는 비밀번호를 확인하세요.";
			HttpSession session = request.getSession();
			session.setAttribute("login", login);
		}
		
		//System.out.println(result + login + delete);
		
		udao.userLogin(id, pw);
		
	}
}
