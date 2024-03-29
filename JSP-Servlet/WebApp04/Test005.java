/*========================
	Test005.java
	- Servlet 관련 실습
========================*/

// 현재... 자바의 기본 클래스 Test005
// 이를... Servlet 으로 구성하는 방법

// 제네릭 서블릿을 상속받는 형태로 서블릿을 구성할 수 있음
// http 서블릿을 상속받는 형태로 서블릿을 구성할 수 있음(가장 많이 사용되는 방법)
// → 서블릿화 할 수 있음

// HttpServlet 을 상속받는 클래스로 설계 → Servlet

package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 추상메소드를 갖지 않는 추상클래스
public class Test005 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	
	// 사용자의 http 프로토콜 요청(데이터 전송 및 페이지 요청 방식)이 GET 방식일 때 호출되는 메소드
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGetPost(request, response);
	}
	
	// 사용자의 http 프로토콜 요청(데이터 전송 및 페이지 요청 방식)이 POST 방식일 때 호출되는 메소드
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGetPost(request, response);
	}
	
	// 사용자 정의 메소드
	protected void doGetPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// GET 방식이든 POST 방식이든
		// 어떤 방식의 요청에도 모두 처리할 수 있는 사용자 정의 메소드
		
		// request → 요청 객체
		String id = request.getParameter("userId");		// request 객체안에 담긴 내용을 얻을 수 있음. ()안에는 name 속성 값
		String pwd = request.getParameter("userPwd");
		
		// 요청에 대한 응답 방법
		// -- HTML 형식의 데이터를 UTF-8 문자 인코딩으로 전송한다고 설정하는 것
		response.setContentType("text/html; charset=UTF-8");
		
		String str = "아이디 : " + id + ", 패스워드 : " + pwd;
		
		// 응답을 출력 스트림으로 구성하기 위한 준비
		PrintWriter out = response.getWriter();
		
		// 출력 스트림을 활용해서 페이지 렌더링
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("<title>Test005.java</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("");
		out.print("<div>");
		out.print("	<h1>서블릿 관련 실습</h1>");
		out.print("	<hr>");
		out.print("</div>");
		out.print("");
		out.print("<div>");
		out.print("	<h2>HttpServlet 클래스를 활용한 서블릿 테스트</h2>");
		out.print("	");
		out.print("	<p>" + str +"</p>");
		out.print("</div>");
		out.print("");
		out.print("</body>");
		out.print("</html>");

		
		
	}
	
}











