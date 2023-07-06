<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h2>이젠 사원정보 등록</h2>
   <hr>
   <form action="/emp/write" method="POST">
      
      사번 : <input type = "text" name="empno" style="color: blue; font-size: 16px;"><br>
      이름 : <input type = "text" name="ename"style="color: blue; font-size: 16px;"><br>
      직무 : <input type = "text" name="job"style="color: blue; font-size: 16px;"><br>
      상사 : <input type = "text" name="mgr"style="color: blue; font-size: 16px;"><br>
      급여 : <input type = "text" name="sal"style="color: blue; font-size: 16px;"><br>
      <input type="submit" value="등록"   >   
   </form>
</body>
</html>
