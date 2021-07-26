<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
     <script>          
		   		function update(){
		   			var id=document.getElementById('id').value;
		   			location.href='/update?id='+id;
		   		}
		   		
		   		function select(id){
		   			location.href='/select?id='+id;                	                	               	 
                }
    </script>

    <style>
        body{width: 100%}
        main{display: flex; width: 100%;}
        nav{height: 60px;}
        aside{width: 30%;}        
        section{width: 70%;}

        .headerline{text-align:center; line-height: 150px; background-color: #91A8d0;}
        .nav{text-align:center; line-height: 80px; float: right;}
        .nav > span{padding-right: 100px;}
        .aside{}
        .aside > div{padding-left: 20px; padding-top: 12px; width: 150px; height: 30px; text-align: center; }
        .section{width: 80%;}
        .content{width: 100%; height: 300px;}
        .contentsave{float: right;}
        .contentname{width: 40%;}

    </style>
</head>
<body>
    <header>
        <div class="headerline"><h1><a href="/index">Memo Board for toyproject</a></h1></div>
    </header>
    <nav>
        <div class="nav">
            <span><input type="button" value="메모생성" onclick="location.href='/memo/input'"></span>
            <span><input type="button" value="수정" onclick="update(this)" id="updateButton"></span>
            <span><input type="button" value="삭제"></span>
        </div>
       
    </nav>
    <main>
        <aside>
            <div class="aside">
            <!--c태그라이브러리사용  -->
            <c:forEach var="memo" items="${list}" varStatus="status">
            	<div id="memoname" onclick="select(${memo.id})">${memo.name}</div>
            </c:forEach>               
                
             
                
            </div>
        </aside>
        
        <section>
        <jsp:include page="/WEB-INF/views/section/${section}"></jsp:include>
        </section>
    </main>
</body>
</html>