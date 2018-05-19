<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="generator" content="" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/iconfont.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="layui/css/layui.css"  media="all">
<script src="js/jquery-1.10.1.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/paging.js"></script>

<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.css" rel="stylesheet">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<style type="text/css">

</style>
</head>

<body>
	<h1 align="center" style="margin-top:20px;">funds 管理</h1>
	<div class="input-append" style="margin-top:50px;" align="center">
	    <input style="width:300px" type="text" id="fundname" class="span2 search-query">
	    <button type="submit" id="search" class="btn">Search</button>
  	</div>
	<table class="table table-striped" id="funds" style="margin-top:30px;">
	<thead>
		<tr>
			<td>
				<p>编号</p>
			</td>
			<td>
				<p>fundname</p>
			</td>
			<td>
				<p>fundprice</p>
			</td>
			<td>
				<p>fundphone</p>
			</td>
			<td>
				<p>funduser</p>
			</td>
			<td>
				<p>fundAdvantage</p>
			</td>
			<td>
				<p>
					Administration
				</p>
			</td>
		</tr>
	</thead>
	<tbody>
        
    </tbody>
	</table>
<button class="btn btn-success" id="insertbtn" value='+data.result[i].fundsid+'>添加</button> 
<div align="center" id="demo7"></div>
</body>

<script src="layui/layui.js" charset="utf-8"></script>
<script type="text/javascript">
//完整功能
getListData();
$(document).ready(function(){
	$("#insertbtn").click(function(){
		layer.open({
			  type: 2,
			  title: 'insert funds',
			  shadeClose: true,
			  shade: 0.8,
			  area: ['1000px', '90%'],
			  content: 'p2.jsp'
		});
	})
	$("#search").click(function(){
		getListData();
	})
})

function getListData(num){
	var search = $("#fundname").val();
		 $.ajax({  
	         type: 'POST',  
	         url: "Funds/selectbyfile", // ajax请求路径  
	         data: {'pn':num,'fundsName':search},  
	         dataType:'json',  
	         async: false,
	         success: function(data){
	        	 console.log(data.result);
                 layui.use(['laypage', 'layer'], function(){
               	  var laypage = layui.laypage
               	  ,layer = layui.layer;
	               	laypage.render({
	               	  elem: 'demo7'
	               	  ,count: data.count //数据总数，从服务端得到
	               	  ,curr:num||1
	               	  ,limit:7
	               	  ,layout: ['count', 'prev', 'page', 'next', 'skip']
	               	  ,jump: function(obj, first){
	               	    //obj包含了当前分页的所有参数，比如：
	               	    console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
	               	    console.log(obj.limit); //得到每页显示的条数
	               	    
	               	    //首次不执行
	               	    if(!first){
	               	    	getListData(obj.curr);
	               	    }
	               	  }
	               	});
               	});
                 shuju(data);
	         }  
	     });  
}

function shuju(data){
	var number=1;
	$("#funds tbody").html("");
	for(var i = 0;i<data.result.length;i++){
		$("#funds tbody").append('<tr><td>	<p>'+(number++)+'</p></td><td>	<p>'+data.result[i].fundsname+'</p></td><td>	<p>'+data.result[i].fundsprice+'</p></td><td>	<p>'+data.result[i].fundsphone+'</p></td><td>	<p>'+data.result[i].fundsuser+'</p></td><td>	<p>'+data.result[i].fundadvantage+'</p></td><td><button class="btn btn-danger" id="deleteBtn" value='+data.result[i].fundsid+'>删除</button></td></tr>');
	}
	$("#funds tbody").off("click", "#deleteBtn").on("click", "#deleteBtn", function() {
		var userid=<%=session.getAttribute("adminid")%>;
		if(userid!=null){
	        var id = $(this).val();
	        layer.confirm('确定要删除吗？', {
	        	  btn: ['确定','取消'] //按钮
	        	}, function(){
	        		$.ajax({  
	       	         type: 'POST',  
	       	         url: "Funds/deletefunds", // ajax请求路径  
	       	         data: {'fundsid':id},  
	       	         dataType:'json',
	       	         success: function(data){
						if(data.code=="000"){
	                        layer.msg(data.message, {icon: 1});
	                        setTimeout(function(){  //使用  setTimeout（）方法设定定时2000毫秒
	                        	window.location.reload();//页面刷新
	                        },2000)
						}else{
							layer.msg(data.message, {icon: 2})
						}
	       	         }
	       	     });
	        		
	        	}, function(){
	        		
	        	});
		}else{
			alert("请您先登陆");
			window.parent.location.href="login.jsp"; 
		}
    	});
}
	
    
</script>
</html>