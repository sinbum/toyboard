<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<form action="" method="post">
    <div class="section">    	
		<input type="text" value="${select.id}" hidden="">    
        <div>제목 :<input type="text" name="" id="" class="contentname" value="${select.name}"></div><br>
        <div>작성일 :<input type="text" value="${select.time}" readonly></div><br>
        <div><input type="textarea" class="content" value="${content}"></div><br>
        <div><input type="submit" class="contentsave" value="저장"></div>
    </div>
</form>

