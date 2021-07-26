<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<form action="/member/inputProc" method="post">
id:<input type="text" name="id" value="${select.id}" readonly><br>
time:<input type="text" name="id" value="${select.time}" readonly><br>
name:<input type="text" name="name" value="${select.name}" readonly><br>
content:<input type="text" name="content" value="${select.content}" readonly><br>
<h1>select.jsp</h1>
<input type="submit" value="저장">
</form>

</html>