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


<form action="updateProc" method="post">
  <div class="section">    	
		<input type="text" value="${select.idx}" hidden="">    
        <div>제목 :<input type="text" name="title" id="" class="contentname" value="${select.title}" readonly></div><br>
        <div>작성일 :<input type="text" name="content" value="${select.date}" readonly></div><br>
        <div><textarea rows="10" cols="100" readonly>${select.content}</textarea></div><br>
        <div><input type="submit" class="contentsave" value="저장"></div>                      
    </div>
</form>