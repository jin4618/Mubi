package com.Mubi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Mubi.impl.screen.checkTicket;
import com.Mubi.impl.screen.insertTicket;
import com.Mubi.impl.screen.movieAll;
import com.Mubi.impl.screen.movieInsert;
import com.Mubi.impl.screen.screenAll;
import com.Mubi.impl.screen.screenImpl;
import com.Mubi.impl.screen.screenInsert;
import com.Mubi.impl.screen.searchDate;
import com.Mubi.impl.screen.searchTheater;
import com.Mubi.impl.screen.searchTime;
import com.Mubi.impl.screen.theaterAll;
import com.Mubi.impl.screen.theaterInsert;
import com.Mubi.impl.screen.viewTicket;
import com.Mubi.impl.user.userDelete;
import com.Mubi.impl.user.userImpl;
import com.Mubi.impl.user.userInsert;
import com.Mubi.impl.user.userLogin;
import com.Mubi.impl.user.userLogout;
import com.Mubi.impl.user.userUpdate;
import com.comment.my.Allcomment;
import com.comment.my.commentDelete;
import com.comment.my.commentInsert;
import com.comment.my.commentSearchOne;
import com.comment.my.commentUpdate;
import com.comment.my.commentImpl;



//import user.userDAO;
//import user.userVO;

/**
 * Servlet implementation class Join
 */
@WebServlet({
	"/userInsert.do",
	"/login.do",
	"/logout.do",
	"/userUpdate.do",
	"/userDelete.do",
	
	"/movieAllInfo.do", "/theaterAllInfo.do", "/screenAllInfo.do",
	"/movieInsert.do", "/theaterInsert.do", "/screenInsert.do",
	"/rscreen.do", "/searchTheater.do", "/searchDate.do", "/searchTime.do",
	"/reservation.do", "/reservationView.do", "/reservationCheck.do",
	
	"/Allcomment.do" ,"/commentInsert.do","/commentSearchOne.do",
	"/commentUpdate.do","/commentDelete.do"
})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String c
		= request.getRequestURI().substring(request.getContextPath().length());
		
		String str = null;
		userImpl u1 = null;
		screenImpl s1 = null;
		commentImpl h = null;
		
		switch (c) {
		
		// ========== user =============
		case "/userInsert.do":
			u1 = new userInsert();
			try {
				u1.user(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			str = "joinCheck.jsp";
			
			break;
			
		case "/login.do":
			u1 = new userLogin();
			try {
				u1.user(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			str = "logCheck.jsp";
			
			break;
			
		case "/logout.do":
			u1 = new userLogout();
			System.out.println("out");
			try {
				u1.user(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			str = "index.jsp";
			
			break;
			
		case "/userUpdate.do":
			u1 = new userUpdate();
			/* System.out.println("update!!!!!!"); */
			try {
				u1.user(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			str = "index.jsp";
			
			break;
			
		case "/userDelete.do":
			u1 = new userDelete();
			try {
				u1.user(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			str = "deleteTest.jsp";
			
			break;
		// ==========================================
			
			
		// ========== screen =============
			
		case "/movieAllInfo.do":
			s1 = new movieAll();
			
			try {
				s1.screen(request, response);
			} catch (Exception e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			
			str = "admin.jsp";
			
			break;
			
		case "/theaterAllInfo.do":
			s1 = new theaterAll();
			
			try {
				s1.screen(request, response);
			} catch (Exception e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			
			str = "admin.jsp";
			
			break;
						
			
		case "/screenAllInfo.do":	// admin.jsp [모두보기]
			s1 = new screenAll();
			
			try {
				s1.screen(request, response);
			} catch (Exception e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			
			str = "admin.jsp";
			
			break;
			
		case "/movieInsert.do":
			s1 = new movieInsert();
			
			try {
				s1.screen(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			str = "admin.jsp";
			
			break;
	
		case "/theaterInsert.do":
			s1 = new theaterInsert();
			
			try {
				s1.screen(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			str = "admin.jsp";
			
			break;				
				
		case "/screenInsert.do":	// admin.jsp 영화 상영 시간표 insert
			s1 = new screenInsert();
			
			try {
				s1.screen(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			str = "admin.jsp";
			
			break;
			
		case "/rscreen.do":	// reservataion.jsp 영화목록
			s1 = new movieAll();
			
			try {
				s1.screen(request, response);
			} catch (Exception e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			
			str = "reservation.jsp";
			
			break;
			
		case "/searchTheater.do":	// reservation.jsp 극장 목록
			
			s1 = new searchTheater();
			
			try {
				s1.screen(request, response);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			str = "reservation.jsp";
			
			break;
			
		case "/searchDate.do":
			
			s1 = new searchDate();
			
			try {
				s1.screen(request, response);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			str = "reservation.jsp";
			
			break;
		
		case "/searchTime.do":
			s1 = new searchTime();
			
			try {
				s1.screen(request, response);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
						
			str = "reservation.jsp";
			
			break;
			
		case "/reservationView.do":
			s1 = new viewTicket();
			
			try {
				s1.screen(request, response);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			str = "reservation.jsp";
			
			break;
			
		case "/reservation.do":
			
			s1 = new insertTicket();
			
			try {
				s1.screen(request, response);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}		
			
			str = "kakaopay.jsp";
			
			break;
			
		case "/reservationCheck.do":
			
			s1 = new checkTicket();
			
			try {
				s1.screen(request, response);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}		
			
			str = "reservationCheck.jsp";
			
			break;
			// ==========================================
			
			
			// ========== comment =============
		case "/Allcomment.do":

			h = new Allcomment();

			try {
				h.comment(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			str = (String) request.getAttribute("str");
			
			break;

		case "/commentUpdate.do":
			h = new commentUpdate();

			try {
				h.comment(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			str = "index.jsp";
			
			break;
			
			
		case "/commentSearchOne.do":
			h = new commentSearchOne();

			try {
				h.comment(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			str = "commentSearchOne.jsp";
			
			break;

		case "/commentInsert.do":
			h = new commentInsert();

			try {
				h.comment(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			str = "Allcomment.do";
			
			break;
			
		case "/commentDelete.do":

			h = new commentDelete();

			try {
				h.comment(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			str = "index.jsp";
			
			break;

		}
		
		
		RequestDispatcher rd1 = request.getRequestDispatcher(str);
		rd1.forward(request, response);	

		
	}

}
