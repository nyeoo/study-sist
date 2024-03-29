<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsptest005.jsp</title>

<link rel="styleSheet" type="text/css" href="css/main.css">

</head>
<body>

<div>
	<h1>JSP 관찰하기</h1>
	<hr>
</div>

<div>
	<h2>HttpServlet 관련 실습</h2>
	<!-- ※ 입력 컨트롤을 활용하여 서버로 데이터를 전송하기 위해서는 form 필요 -->
	<!-- 서버로 전송하는데 식별하는 속성은 name이다. script 제어를 위해서 id 속성을 추가로 사용해도 문제는 없음 -->
	<!-- form 태그의 action 속성은 데이터 전송 및 페이지의 요청을 해야하는 대상 페이지를 등록하는 기능을 수행함
	     action 속성을 기재하지 않았거나 action 속성의 값을 비워둔 경우 데이터를 전송 및 요청하는 페이지는 나(자신)이다.-->
	<!-- ※ form 태그의 method 속성은 데이터 전송 및 페이지 요청에 대한 방식.
	     get 방식은 무엇이 넘겨지는지 중간에서 확인 가능한 형식(엽서), post 방식은 봉투에 넣어서 보내는 형식이므로 확인 불가(편지)
	     명시적으로 기재하지 않으면 get 방식으로 데이터 전송 및 페이지 요청을 수행함
	     method 속성은 action 방식과 묶여져서 함께 처리됨 -->
	<!-- submit 액션을 수행하기 위해서는 submit 버튼을 만들거나, javascript 로 submit을 수행하게 하는 등 다양한 방법 존재함-->
	<form action="/WebApp04/login" method="get">
		<table>
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" name="userId" size="10" maxlength="10" class="txt">
				</td>
			</tr>
			<tr>
				<th>패스워드</th>
				<td>
					<input type="password" name="userPwd" size="10" class="txt">
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<!-- ※ submit 액션 → form 데이터 전송 및 페이지 요청 -->
					<input type="submit" value="로그인" class="btn control" style="width: 48%">
					<input type="reset" value="다시입력" class="btn control" style="width: 48%">
				</td>
			</tr>
			
		</table>
	</form>
</div>

</body>
</html>