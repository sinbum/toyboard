<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <div class="section">    	
		<input type="text" name="id" id="idx" value="${select.idx}" hidden="">    
        <div>제목 :<input type="text" name="" id="" class="contentname" value="${select.title}"readonly></div><br>
        <div>작성일 :<input type="text" value="${select.date}" readonly></div><br>
        <div><textarea rows="10" cols="100" readonly>${select.content}</textarea></div><br>
        
        
        <!-- <input type="textarea" class="content" value=""readonly> -->
    </div>

