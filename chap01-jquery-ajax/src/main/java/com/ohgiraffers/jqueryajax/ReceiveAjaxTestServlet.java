package com.ohgiraffers.jqueryajax;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/receive")
public class ReceiveAjaxTestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String output = "I'm Get request! 요청 처리 완료~!";
		// 비동기 요청 방식은 인코딩 방식을 응답하도록 세팅되어있음 , 컨텐트 타입을 지정해주지 않아도 한글이 깨지지 않음 
		
		PrintWriter out = response.getWriter();
		out.print(output);
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		String message =request.getParameter("message");
		                                     //key value로 받음
		PrintWriter out =response.getWriter();
		out.print("전달받은 message: " + message);
		out.close();
	
		
	}

}
