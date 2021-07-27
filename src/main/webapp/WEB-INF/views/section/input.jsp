<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="inputProc" method="post">
  <div class="section">
        <div>제목 :<input type="text" name="title" id="selectedId" class="contentname" value="${select.name}"></div><br>        
        <div><textarea rows="10" name="content" cols="100" >${select.content}</textarea></div><br>
        <div><input type="submit" class="contentsave" value="저장"></div>
                      
    </div>
</form>