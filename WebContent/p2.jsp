<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/fileinput.css" media="all" rel="stylesheet" type="text/css" />
<link href="layui/css/layui.css">
<script src="js/jquery-2.0.3.min.js"></script>
<script src="layer/layer.js" type="text/javascript" charset="utf-8"></script>

<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<style>
	.file {
    position: relative;
    display: inline-block;
    background: #D0EEFF;
    border: 1px solid #99D3F5;
    border-radius: 4px;
    padding: 4px 12px;
    overflow: hidden;
    color: #1E88C7;
    text-decoration: none;
    text-indent: 0;
    line-height: 20px;
}
.file input {
    position: absolute;
    font-size: 100px;
    right: 0;
    top: 0;
    opacity: 0;
}
.file:hover {
    background: #AADFFD;
    border-color: #78C3F3;
    color: #004974;
    text-decoration: none;
}
</style>
<body>

<form id="insertfunds" enctype="multipart/form-data">
	<table name="Table1" align="center">
		<tr>
			<h1 align="center">Have funds to find projects</h1>
		</tr>
		<tr>
			<td width="200px" height="100px">
				<label for="exampleInputName2">fundsname</label>
			</td>
			<td>
				<input type="hidden" id="fundsid" name="fundsid">
    			<input name="fundsname" type="text" class="form-control" id="fundsname" placeholder="fundsname"><p style="color :red" id="name"/>
			</td>
		</tr>
		<tr>
			<td width="300px" height="100px">
				<label for="exampleInputName2">Details of the fund</label>
			</td>
			<td>
    			<textarea name="fundsdesc" id="fundsdesc" class="form-control" placeholder="Details of the fund" rows="3"></textarea><p style="color :red" id="desc"/>
			</td>
		</tr>
		<tr>
			<td>
				<label for="exampleInputName2">fundsprice</label>
			</td>
			<td>
    			<input style="margin-Bottom:10px" class="input-mini" type="text" id="minprice" name="minprice" placeholder="minprice" size="6">-<input id="maxprice" name="maxprice" class="input-mini" type="text" placeholder="maxprice" size="6">
			</td>
		</tr>
		<tr>
			<td>
				<label for="exampleInputName2">Contact name</label>
			</td>
			<td>
    			<input type="text" name="fundsuser" class="form-control" id="fundsuser" placeholder="Contact name"><p style="color:red" id="username"></p>
			</td>
		</tr>
		<tr>
			<td>
				<label for="exampleInputName2">Contact phone</label>
			</td>
			<td>
    			<input type="text" name="fundsphone" class="form-control" id="fundsphone" placeholder="Contact phone"><p style="color:red" id="userphone"></p>
			</td>
		</tr>
		<tr>
			<td>
				<label for="exampleInputName2">Fund Advantage</label>
			</td>
			<td>
    			<input type="text" name="fundadvantage" class="form-control" id="fundadvantage" placeholder="Contact name"><p style="color:red"></p>
			</td>
		</tr>
		<tr>
			<td>
				<label for="exampleInputName2">Please upload the picture :</label>
			</td>
			<td>
				<a href="javascript:;" class="file">选择文件
				    <input type="file" name="files" id="files" multiple="multiple"/>
				</a>
				<div id="dd" style=" width:500px;"></div>
			</td>
		</tr>
		<tr>
			<td><label for="exampleInputName2">fundshead:</label></td>
			<td>
				<a href="javascript:;" class="file">选择文件
				    <input type="file" name="Fundhead" id="fundshead"/>
				</a>
				<div id="fundhead" style=" width:500px;"></div>
			</td>
		</tr>
		<tr>
			<td>
				<input class="btn btn-primary" id="inserfund" name="" type="button" value="Submission">
			</td>
			<td>
				<input type="reset" class="btn btn-default" value="reset">
			</td>
		</tr>
	</table>
	
</form>
	

                


</body>
<script type="text/javascript">


$(document).ready(function(){  
    var qs = getQueryString(); 
	var id = qs["id"]; // abc
	
	$("#files").change(function(){
		var file = document.getElementById("files");
		var dd=document.getElementById("dd");
		var fileList = file.files;
		var img_id=document.getElementById('files').value; //根据id得到值
		var index= img_id.indexOf("."); //得到"."在第几位
		img_id=img_id.substring(index); //截断"."之前的，得到后缀
	    if(img_id!=".bmp"&&img_id!=".png"&&img_id!=".gif"&&img_id!=".jpg"&&img_id!=".jpeg"){  //根据后缀，判断是否符合图片格式
	        alert("No picture format is specified,Please upload .bmp .png .gif .jpg .jpeg"); 
	        document.getElementById('files').value="";  // 不符合，就清除，重新选择
	        dd.innerHTML="";
		}else{
			for(var i =0;i<fileList.length;i++){
				dd.innerHTML += "<div style='float:left' > <img id='img" + i + "'  /> </div>"
				var imgObjPreview = document.getElementById("img"+i); 
				if (file.files && file.files[i]) {
				    //火狐下，直接设img属性
				    imgObjPreview.style.display = 'block';
				    imgObjPreview.style.width = '150px';
				    imgObjPreview.style.height = 'auto';
				    imgObjPreview.src = window.URL.createObjectURL(file.files[i]);
				}
			}
		}
		
	});
	$("#fundshead").change(function(){
		var file = document.getElementById("fundshead");
		var dd=document.getElementById("fundhead");
		var fileList = file.files;
		var img_id=document.getElementById('fundshead').value; //根据id得到值
		var index= img_id.indexOf("."); //得到"."在第几位
		img_id=img_id.substring(index); //截断"."之前的，得到后缀
	    if(img_id!=".bmp"&&img_id!=".png"&&img_id!=".gif"&&img_id!=".jpg"&&img_id!=".jpeg"){  //根据后缀，判断是否符合图片格式
	        alert("No picture format is specified,Please upload .bmp .png .gif .jpg .jpeg"); 
	        document.getElementById('files').value="";  // 不符合，就清除，重新选择
	        dd.innerHTML="";
		}else{
			dd.innerHTML += "<div style='float:left' > <img id='imgfundshead'  /> </div>"
			var imgObjPreview = document.getElementById("imgfundshead"); 
		    //火狐下，直接设img属性
		    imgObjPreview.style.display = 'block';
		    imgObjPreview.style.width = '150px';
		    imgObjPreview.style.height = 'auto';
		    imgObjPreview.src = window.URL.createObjectURL(file.files[0]);
		}
	});
	
	
    $("#inserfund").click(function(){  
			   var userName=<%=session.getAttribute("adminid")%>;
			   var formData = new FormData($('#insertfunds')[0]);
			   if(userName!=null){
				    if($("#fundsname").val()==""){
				    	alert("fundsname not null!");
				    	return false;
				    }
			    	if($("#fundsdesc").val()==""){
			    		alert("The details of the funds can not be empty!");
			    		return false;
			    	}
		    		if($("#minprice").val()==""){
		    			alert("The minprice amount can not be empty or less than 0!");
		    			return false;
		    		}else{
		    			var patrn=/^[0-9]*[1-9][0-9]*$/;
		    			if(!patrn.exec($("#minprice").val())){
    						alert("Please enter the correct amount!");
    						return false;
    					}
		    		}
		    		if($("#maxprice").val()!=""){
		    			var patrn=/^[0-9]*[1-9][0-9]*$/;
		    			if(!patrn.exec($("#minprice").val())){
    						alert("Please enter the correct amount!");
    						return false;
    					}
		    		}
	    			if($("#fundsuser").val()==""){
	    				alert("A contact can't be empty!");
	    				return false;
	    			}else{
	    				var patrn=/^[a-zA-Z\u4e00-\u9fa5 ]{1,20}$/;
	    				if(!patrn.exec($("#fundsuser").val())){
    						alert("A contact can only be in English!");
    						return false;
    					}
	    			}
    				if($("#fundsphone").val()==""){
    					alert("Cell phone number can not be empty!");
    					return false;
    				}
   					if($("#fundsphone").val().length!=10){
   						alert("Please enter the correct cell phone number!");
   						return false;
   					}else{
   						var patrn=/^[0-9]{1,20}$/;
    					if(!patrn.exec($("#fundsphone").val())){
    						alert("Please enter the correct cell phone number!");
    						return false;
    					}
   					}
				    					
  					if($("#fundadvantage").val()==""){
  						alert("The advantage of the fund can not be empty!");
  						return false;
  					}
					if($("#files").val()==""){
						alert("The picture of the fund can't be empty!");
						return false;
					}
					if($("#fundshead").val()==""){
						alert("The head portrait of a contact can not be empty!");
						return false;
					}
						$.ajax({
				            url:"Funds/inserfunds",
				            data:formData,  
				            type: "POST",                   //类型，POST或者GET  
				            dataType: 'json',  
				            cache: false,  
				            processData: false,    
				            contentType : false,  
				            async:false,
				            success: function (data) {      //成功，回调函数  
				            	if(data.code=="000"){
				                	layer.msg(data.message, {icon: 1},function(){
				                		window.parent.location.reload(); //刷新父页面
				                		var index = window.parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
				                		window.parent.layer.close(index);//再执行关闭 
				                	});
				            	}else{
				            		layer.msg(data.message, {icon: 2});
				            	}	
				            }  
				    	});  
			    }else{
					   alert("请您登陆");
					   top.location.href="login.jsp"; //刷新父页面
	        		   var index = window.parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
	        		   window.parent.layer.close(index);//再执行关闭 
				}
		});
});

//获取url中的参数
function getQueryString() {  
  var qs = location.search.substr(1), // 获取url中"?"符后的字串  
    args = {}, // 保存参数数据的对象
    items = qs.length ? qs.split("&") : [], // 取得每一个参数项,
    item = null,
    len = items.length;
 
  for(var i = 0; i < len; i++) {
    item = items[i].split("=");
    var name = decodeURIComponent(item[0]),
      value = decodeURIComponent(item[1]);
    if(name) {
      args[name] = value;
    }
  }
  return args;
}


</script>
</html>