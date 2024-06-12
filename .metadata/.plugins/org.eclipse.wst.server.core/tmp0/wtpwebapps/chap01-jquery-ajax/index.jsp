<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQuery Ajax</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</head>
<body>
  <h1>jQuery를 이용해 AJAX 요청 후 stream을 이용한 문자열 응답</h1>
  
  <h3>1. 데이터 전송 없이 문자열 반환</h3>
     <button id="send-no-data">SEND</button>
     <script>
     $("#send-no-data").click(function(){
           
    	 $.ajax({             // -> 중괄호로 열고 닫음 + key:value로 프로퍼티 구성 + 프로퍼티 간, 
    	   url: "/chap01/receive",            //요청보낼 url
    	   type: "get",           //요청방식
    	   success: function(data){  //성공 시 콜백함수 (매개변수로 성공 데이터 받아 쓸 수 있음)
    		   console.log(data);
    	   
    	     /* JSON.parse(): json 형태의 문자열을 object 타입의 객체로 파싱하여 반환하는 메소드   */
    	     let jsonObject = JSON.parse(data);
    	     console.log(jsonObject);
    	     
    	   
    	   },
    	   error: function(error){  //실패 시 쿨백함수(매개변수로 에러 정보 받아 쓸 수 있음)
    		  console.log(error);   
    	   }
    		 
    		 
    	 });
    	 
     });
     
     </script>
    
  <h3>2. data로 값 전송 후 문자열 반환</h3>
  
  <h3>2. data로 값 전송 후 문자열 반환</h3>
  <input type="text" id="message">
  <button id ="send-with-data">Message SEND</button>
  
  <script>
     $("#send-with-data").click(function(){
    	  const messageVal =$("#message").val();
    	  
    	 $.ajax({
    		 url:"/chap01/receive",
    		 type:"post",
    		 data: {
    			message: messageVal 
    		 },
    		 success: function(data){
    			 alert(data);
    		 },
    		 error: function(error){
    			 console.log(error);
    		 } 
    	 });    	
     });
  </script>
  
  
  
  
  
  
</body>
</html>