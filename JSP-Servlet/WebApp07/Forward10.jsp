<%@ page contentType="text/html; charset=UTF-8"%>
<%
	// Forward10.jsp
	
	// 이전 페이지(Send10.jsp)로부터 넘어온 데이터 수신
	// → num1, calResult, num2
	
	String num1Str = request.getParameter("num1");
	String num2Str = request.getParameter("num2");
	String calResult = request.getParameter("calResult");
	
	int num1 = 0;
	int num2 = 0;
	String result = "";
	
	try
	{
		num1 = Integer.parseInt(num1Str);
		num2 = Integer.parseInt(num2Str);
		
		if (calResult.equals("1"))		// 더하기
			result = String.format("%d + %d = %d", num1, num2, (num1+num2));
		else if (calResult.equals("2"))		// 빼기
			result = String.format("%d - %d = %d", num1, num2, (num1-num2));
		else if (calResult.equals("3"))		// 곱하기
			result = String.format("%d * %d = %d", num1, num2, (num1*num2));
		else if (calResult.equals("4"))		// 나누기
			result = String.format("%d / %d = %.1f", num1, num2, (num1/(double)num2));
			
	}
	catch (Exception e)
	{
		System.out.println(e.toString());
	}
	
	// 요청에 내용 추가
	request.setAttribute("resultStr", result);
	//-- body 안에 객체를 적재하는 형식(Parameter과 다르게 문자열 뿐만 아니라 객체 자체를 set 가능 -- map 자료구조로 생각)
	//-- setAttribute 로 적재한 객체(object)는 getAttribute로 꺼내야함!
	
	// → 결과적으로 Forward10.jsp 는 클라이언트와 만나지 않음 → 로직에 충실할 수 있음

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forward10.jsp</title>
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>

<!-- JSP 액션 태그를 활용한 forward 처리 -->
<jsp:forward page="Receive10.jsp"></jsp:forward>

</body>
</html>




















