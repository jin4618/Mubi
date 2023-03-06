package com.Mubi.impl.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.userDAO;
import user.userVO;

public class userUpdate implements userImpl {

	@Override
	public void user(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String ori_id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		
		userDAO udao2 = new userDAO();
		udao2.userUpdate(pw, name, email, tel, address, ori_id);

	}

}
