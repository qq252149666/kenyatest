<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>头部</title>
<link rel="stylesheet" type="text/css" href="css/public.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/public.js"></script>

</head>
<body>
	<!-- 头部 -->
	<div class="head">
		<div class="headL">
			<img class="headLogo" src="img/logLOGO.png"/>
		</div>
		<div class="headR">
			<span style="color:#FFF">欢迎：${UserName}</span><a id="edit" href="head2.jsp" rel="external">【退出】</a>
		</div>
	</div>
</body>
<script type="text/javascript">
$(document).ready(function(){
	  $("#edit").click(function(){
		  $.ajax({url:"Admin/edit",async:false});
		  window.parent.location.href="login.jsp";
	  });
});
</script>
</html>