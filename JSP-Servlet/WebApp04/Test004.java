/*=========================
 	Test004.java
	- Servlet 실습
=========================*/

// 현재... 자바의 기본 클래스 Test004
// 이를... Servlet 으로 구성하는 방법

// 제네릭 서블릿을 상속받는 형태로 서블릿을 구성할 수 있음
// http 서블릿을 상속받는 형태로 서블릿을 구성할 수 있음(가장 많이 사용되는 방법)
// → 서블릿화 할 수 있음

// GenericServlet 을 상속받는 클래스로 설계 → Servlet

package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//import javax.servlet.Servlet;

//public class Test004 implements Servlet
//public abstract class Test004 extends GenericServlet
public class Test004 extends GenericServlet
{
	private static final long serialVersionUID = 1L;
	
	
	// GenericServlet 의 추상메소드 재정의~!!!
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
	{
		// 요청에 대한 응답 방법
		// -- HTML 형식의 데이터를 UTF-8 문자 인코딩으로 전송한다고 설정하는 것
		response.setContentType("text/html; charset=UTF-8");
		
		try
		{
			// 출력 스트림 구성
			PrintWriter out = response.getWriter();
			
			out.print("<html>");
			out.print("<head>");
			out.print("<title>");
			out.print("Test004.java");
			out.print("</title>");
			out.print("</head>");
			
			out.print("<body>");
			out.print("<div>");
			out.print("<h1>");
			out.print("서블릿 관련 실습");
			out.print("</h1>");
			out.print("</div>");
			
			out.print("<div>");
			out.print("<h2>");
			out.print("GenericServlet 클래스를 이용한 서블릿 테스트");
			out.print("</h2>");
			out.print("</div>");

			out.print("</body>");

			out.print("</html>");
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
}











































