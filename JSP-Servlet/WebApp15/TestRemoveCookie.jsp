<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	// 비어있는 내용으로 기존의 쿠키를 덮어쓰기 하는 개념 → 삭제
	Cookie killCookie = new Cookie("cookie_test", ""); 		//→ ()안에 쿠키이름이 덮어쓰기 될 쿠키 이름과 같아야함
	
	killCookie.setMaxAge(0);
	response.addCookie(killCookie);
	//-- 처음 쿠키를 구성할 때에도 『addCookie()』로 처리하였기 때문에
	//   삭제할 때에도 같은 이름의 쿠키를 『addCookie()』로 처리해야 안정적으로 삭제.
	//   즉, 내용이 포함된 쿠키를 심었다가...
	//   이번에는 내용이 비어있는 쿠키를 심는다는 개념.
	
	// ※ 여기서 쿠키 삭제는 클라이언트의 입장에서의 삭제이다.
	//    한 명의 클라이언트가 쿠키를 삭제했다고 해서
	//    다른 클라이언트들의 쿠키도 삭제되면 안되기 때문에
	//    이 쿠키의 정보는 로컬 PC 에서 컨트롤하게 된다. (브라우저가...)
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TestRemoveCookie.jsp</title>
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>

<div>
	<h1>쿠키 정보 삭제하기</h1>
	<hr>
</div>

<div>
	<h2>성공적으로 쿠키를 제거했습니다~!!!</h2>
</div>

<div>
	<a href="TestSetCookie.jsp"><button type="button" class="btn">쿠키 정보 설정</button></a>
	<a href="TestGetCookie.jsp"><button type="button" class="btn">쿠키 정보 확인</button></a>
</div>

</body>
</html>