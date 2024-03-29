<%@page import="java.sql.Connection"%>
<%@page import="com.util.DBConn"%>
<%@page import="com.test.BoardDAO"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
%>

<jsp:useBean id="dto" class="com.test.BoardDTO" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>

<%
	// Updated_ok.jsp
	// 위의 액션 태그를 통해 dto 의 속성값들을 이전 페이지(Updated.jsp)로부터 수신
	//→ num, pageNum 필요.. (dto에는 pageNum 속성이 없으므로 따로 수신)
	String pageNum = request.getParameter("pageNum");
	
	Connection conn = DBConn.getConnection();
	BoardDAO dao = new BoardDAO(conn);
	
	int result = dao.updateData(dto);
	
	// result 값에 따른 분기 처리코드 삽입 가능~!!!
	
	DBConn.close();
	
	// 사용자에게 리스트 페이지를 다시 요청할 수 있도록 안내
	//response.sendRedirect(cp + "/list.jsp?pageNum=" + pageNum);
	
	// 사용자에게 게시물 내용 페이지를 다시 요청할 수 있도록 안내
	response.sendRedirect(cp + "/Article.jsp?pageNum=" + pageNum + "&num=" + dto.getNum());
	
%>