<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录</title>
<link rel="stylesheet" type="text/css" href="css/public.css" />
<link rel="stylesheet" type="text/css" href="css/page.css" />
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	  $("#login").click(function(){
	  var adminUser=$("input[name='adminUser']").val();
	  var adminPassword=$("input[name='adminPassword']").val();
	  $.ajax({
		  url:"/kenya/Admin/login",
		  data: {adminUser:adminUser,adminPassword:adminPassword},
		  type: "POST",                   //类型，POST或者GET
          dataType: 'json',
          success: function (result) {      //成功，回调函数
           if(result==null){
         	  alert("用户名或密码错误！");
           }else{
         	  window.location.href ="index.jsp";
           }
           },
           error: function(error) {//失败，回调函数
              alert("用户名或密码错误！");
           }
          
		  });
	  });
});

</script>
</head>
<body class="bg">   
    <div  class="vertical-center">  
      	<center><h3>请登录</h3></center>
        <label for="username" class="sr-only">用户名</label>  
        <input type="text" id="username" class="form-control" placeholder="用户名" name="adminUser">  
        <label for="inputPassword" class="sr-only">密码</label>  
        <input type="password" id="inputPassword" class="form-control" placeholder="密码" name="adminPassword">  
        <div class="checkbox">  
          <label>  
            <input type="checkbox" value="remember-me">  
            记住我 </label>  
        </div>  
        <button id="login" type="button">提交</button>
    </div>  

</body>
<style>
.vertical-center{
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
input text{
	height:300px;
}
*{
    margin: 0;
    padding: 0;
}
body {
	background: url(img/2cf5e0fe9925bc31f996dfb554df8db1ca1370d0.jpg) no-repeat center center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}
</style>

</html>