<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<form action="updateProc" method="post">
  <div class="section">    	
		<input type="text" name="id" value="${select.id}" hidden="">    
        <div>제목 :<input type="text" name="name" id="selectedId" class="contentname" value="${select.name}"></div><br>
        <div>작성일 :<input type="text" name="time" value="${select.time}" readonly></div><br>
        <div><textarea rows="10" name="content" cols="100" >${select.content}</textarea></div><br>
        <div><input type="submit" class="contentsave" value="저장"></div>
                      
    </div>
</form>