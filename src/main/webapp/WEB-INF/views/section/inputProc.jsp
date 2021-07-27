<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <c:set var="result" value="${result}" />
<c:if test="${result eq '1'}">
	<script type="text/javascript">
		alert("등록이 완료되었습니다.");
	</script>
</c:if>
<c:if test="${result eq '0'}">
	<script type="text/javascript">
		alert("등록에 실패하였습니다.");
	</script>
</c:if>

<div><a href="/index">홈으로 돌아가기</a></div>