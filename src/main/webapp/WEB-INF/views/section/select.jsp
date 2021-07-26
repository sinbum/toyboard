<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <div class="section">    	
		<input type="text" value="${select.id}" hidden="">    
        <div>제목 :<input type="text" name="" id="" class="contentname" value="${select.name}"readonly></div><br>
        <div>작성일 :<input type="text" value="${select.time}" readonly></div><br>
        <div><textarea rows="10" cols="100" readonly>${select.content}</textarea></div><br>
        
        
        <!-- <input type="textarea" class="content" value=""readonly> -->
    </div>

