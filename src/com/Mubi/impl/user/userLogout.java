package com.Mubi.impl.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import user.userDAO;

public class userLogout implements userImpl {

	@Override
	public void user(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		request.getSession().invalidate();
		
	/*
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		userDAO udao = new userDAO();
		int login = udao.userLogin(id, pw);
		
		System.out.println(login);
		
		request.getSession().setAttribute("login", login);
	*/	
		
	
		
		
		/*
		 * PrintWriter out = response.getWriter();
		 * out.println("<script>document.location.href='index.jsp';</script>");
		 */
			/* response.sendRedirect("index.jsp"); */
		
	}

}
