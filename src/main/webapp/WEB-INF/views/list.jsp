<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="memo" items="${list}" varStatus="status">
 <c:out value="${memo.id}"/>
 : 
 <c:out value="${memo.name}"/>
 :
 <c:out value="${memo.content}"/>
<br>
</c:forEach>



</body>
</html>