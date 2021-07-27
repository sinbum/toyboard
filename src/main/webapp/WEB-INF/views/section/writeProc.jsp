<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<form action="inputProc" method="post">
    <div class="section">    	
        <div>제목 :<input type="text" name="" id="" class="contentname"></div><br>
        <div><input type="text" class="content"></div><br>
        <div><input type="submit" class="contentsave" value="저장"></div>
    </div>
</form>


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