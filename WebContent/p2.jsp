<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" />
<link href="css/iconfont.css" rel="stylesheet" type="text/css"/>
<link href="css/fileUpload.css" rel="stylesheet" type="text/css">
<script src="js/jquery-2.1.3.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/fileUpload.js"></script>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<style>
 .imageDiv {
	display:inline-block;
	width:160px;
	height:130px;
	-webkit-box-sizing:border-box;
	-moz-box-sizing:border-box;
	box-sizing:border-box;
	border:1px dashed darkgray;
	background:#f8f8f8;
	position:relative;
	overflow:hidden;
	margin:10px
}
.cover {
	position:absolute;
	z-index:1;
	top:0;
	left:0;
	width:160px;
	height:130px;
	background-color:rgba(0,0,0,.3);
	display:none;
	line-height:125px;
	text-align:center;
	cursor:pointer;
}
.cover .delbtn {
	color:red;
	font-size:20px;
}
.imageDiv:hover .cover {
	display:block;
}
.addImages {
	display:inline-block;
	width:160px;
	height:130px;
	-webkit-box-sizing:border-box;
	-moz-box-sizing:border-box;
	box-sizing:border-box;
	border:1px dashed darkgray;
	background:#f8f8f8;
	position:relative;
	overflow:hidden;
	margin:10px;
}
.text-detail {
	margin-top:40px;
	text-align:center;
}
.text-detail span {
	font-size:40px;
}
.file {
	position:absolute;
	top:0;
	left:0;
	width:160px;
	height:130px;
	opacity:0;
}
</style>
</head>
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
    			<input name="fundsname" type="text" class="form-control" id="exampleInputName2" placeholder="fundsname"><p style="color :red" id="name"/>
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
    			<input type="text" name="fundsprice" class="form-control" id="fundsprice" placeholder="fundsprice"><p style="color:red" id="price"/>
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
				<label for="exampleInputName2">Please upload the picture :</label>
			</td>
			<td>
				<input type="file"  name="files" id="doc" multiple="multiple"  accept="image/*" />

				<div id="dd" style=" width:500px;"></div>
				
			</td>
		</tr>
		<tr>
			<td>
				<input class="btn btn-primary" id="inserfunds" name="" type="button" value="Submission">
			</td>
			<td>
				<input type="reset" class="btn btn-default" value="reset">
			</td>
		</tr>
	</table>
</form>
</body>
<script type="text/javascript">
function setImagePreviews(avalue) {
	var dd = document.getElementById("dd");
	var img_id=document.getElementById('doc').value; //根据id得到值
	var index= img_id.indexOf("."); //得到"."在第几位
	img_id=img_id.substring(index); //截断"."之前的，得到后缀
	
    var docObj = document.getElementById("doc");
    if(img_id!=".bmp"&&img_id!=".png"&&img_id!=".gif"&&img_id!=".jpg"&&img_id!=".jpeg"){  //根据后缀，判断是否符合图片格式
        alert("No picture format is specified,Please upload .bmp .png .gif .jpg .jpeg"); 
        document.getElementById('doc').value="";  // 不符合，就清除，重新选择
        dd.innerHTML="";
   }else{
	   var fileList = docObj.files;
	   if(fileList.length>5){
	    	alert("Choose five pictures at most!");
	    	document.getElementById('doc').value="";
	   }else{
	    	for (var i = 0; i < fileList.length; i++) {            
		        dd.innerHTML += "<div style='float:left' > <img id='img" + i + "'  /> </div>";
		        var imgObjPreview = document.getElementById("img"+i); 
		        if (docObj.files && docObj.files[i]) {
		            //火狐下，直接设img属性
		            imgObjPreview.style.display = 'block';
		            imgObjPreview.style.width = '150px';
		            imgObjPreview.style.height = '180px';
		            //imgObjPreview.src = docObj.files[0].getAsDataURL();
		            //火狐7以上版本不能用上面的getAsDataURL()方式获取，需要一下方式
		            imgObjPreview.src = window.URL.createObjectURL(docObj.files[i]);
		        }
		        else {
		            docObj.select();
		            var imgSrc = document.selection.createRange().text;
		            alert(imgSrc)
		            var localImagId = document.getElementById("img" + i);
		            //必须设置初始大小
		            localImagId.style.width = "150px";
		            localImagId.style.height = "180px";
		            //图片异常的捕捉，防止用户修改后缀来伪造图片
		            try {
		                localImagId.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
		                localImagId.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = imgSrc;
		            }
		            catch (e) {
		                alert("您上传的图片格式不正确，请重新选择!");
		                return false;
		            }
		            imgObjPreview.style.display = 'none';
		            document.selection.empty();
		        }
		    }
	    }
	      
	    return true;
   }
}


$(document).ready(function(){  
    $("#inserfunds").click(function(){  
    	var string=document.getElementById("exampleInputName2").value;
		var parent=/^[\u4e00-\u9fa5_a-zA-Z0-9]+$/;
		if(parent.test(string))
		{
			var string=document.getElementById("fundsdesc").value;
			var parent=/^[\u4e00-\u9fa5_a-zA-Z0-9]+$/;
			if(parent.test(string))
			{
				var string=document.getElementById("fundsprice").value;
				var parent=/^(-?\d+)(\.\d+)?$/;
				if(parent.test(string))
				{
					var string=document.getElementById("fundsuser").value;
					var parent=/^[\u4e00-\u9fa5_a-zA-Z0-9]+$/;
					if(parent.test(string))
					{
						var string=document.getElementById("fundsphone").value;
						var parent=/^[\u4e00-\u9fa5_a-zA-Z0-9]+$/;
						if(parent.test(string))
						{
							var docObj = document.getElementById("doc");
					    		var fileList = docObj.files;
							    if(fileList.length>5||fileList.length<1){
							   		alert("Please insert 1 to 5 pictures!");
							    	document.getElementById('doc').value="";
							   }else{
								   var userName=<%=session.getAttribute("adminid")%>;
								   if(userName!=null){
								   var formData = new FormData($('#insertfunds')[0]);  
							        $.ajax({  
							            url:"Funds/inserfunds",  
							            data:formData,  
							            type: "POST",                   //类型，POST或者GET  
							            dataType: 'json',  
							            cache: false,  
							            processData: false,    
							            contentType : false,  
							            async:false,  
							            success: function (result) {      //成功，回调函数  
							                if(result==null){  
							                    alert("添加失败");  
							                }else{
							                    alert("添加成功");  
							                }  
							            }  
							        }); 
								   }else{
										   alert("请您登陆");
										   window.parent.location.href="login.jsp"; 
									}
							   }
						}
						else
						{
							$("#userphone").text("The fundsphone Only input numbers!");
							return false;
						} 
					}
					else
					{
						alert("The fundsuser Only input numbers!");
						return false;
					}
				}
				else
				{
					$("#price").text("The fundsprice Only input numbers!");
					return false;
				}
			}
			else
			{
				alert("The fundsdesc Only inputting English letters!");
				return false;
			}
		}
		else
		{
			alert("The name Only inputting English letters!");
			return false;
		}
	});
});

</script>
</html>