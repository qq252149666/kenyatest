<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" />
<link href="css/haiersoft.css" rel="stylesheet" type="text/css" media="screen,print" />
<link href="css/print.css" rel="stylesheet" type="text/css"  media="print" />
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
<![endif]-->
</head>

<body>

<style>
        .img-container{
            width: 293px;
            height: 150px;
            background:#F2F2F2;
            margin-bottom:35px;
            overflow: hidden;
            border: 1px solid #000;
        }
        .img-container>img{
            width: 293px;
            height: 150px;
        }
        .img{
            width: 293px;
            height: 150px;
        }
</style>
	<table align="center">
		<tr>
			<td>
				<label for="exampleInputName2">项目名称</label>
			</td>
			<td>
    			<input name="fundsname" type="text" class="form-control" id="exampleInputName2" placeholder="项目名称">
			</td>
		</tr>
		<tr>
			<td>
				<label for="exampleInputName2">项目简介</label>
			</td>
			<td>
    			<textarea name="fundsdesc" id="fundsdesc" class="form-control" placeholder="项目简介" rows="3"></textarea>
			</td>
		</tr>
		<tr>
			<td>
				<label for="exampleInputName2">需求金额</label>
			</td>
			<td>
    			<input type="text" name="fundsprice" class="form-control" id="fundsprice" placeholder="需求金额">
			</td>
		</tr>
		<tr>
			<td>
				<label for="exampleInputName2">联系人姓名</label>
			</td>
			<td>
    			<input type="text" name="fundsuser" class="form-control" id="fundsuser" placeholder="联系人">
			</td>
		</tr>
		<tr>
			<td>
				<label for="exampleInputName2">联系人手机号</label>
			</td>
			<td>
    			<input type="text" name="fundsphone" class="form-control" id="fundsphone" placeholder="联系人">
			</td>
		</tr>
		<tr>
			<td>
				<div style="float:left"><input  class="img-btn" type="file" id="files" name="files"></div>
			</td>
			<td>
				<div style="float:left" class="img-container"></div>
			</td>
		</tr>
		<tr>
			<td>
				<div style="float:left"><input  class="img-btn" type="file" id="files" name="files"></div>
			</td>
			<td>
				<div style="float:left" class="img-container"></div>
			</td>
		</tr>
	</table>
<div class="btn_boxB floatR mag_l20"><input name="" type="button" value="取消" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'"></div>
<div class="btn_box floatR"><input id="inserfunds" name="" type="button" value="提交" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'"></div>

<!-- /Popup -->
</body>
 <script>
        /**
         * Created by Administrator on 2016/4/28.
         */
        function previewImg(fileInput,imgDiv){
            if(window.FileReader){//支持FileReader的时候
                var reader=new FileReader();
                reader.readAsDataURL(fileInput.files[0]);
                reader.onload=function(evt){
                    imgDiv.innerHTML="\<img src="+evt.target.result+"\>";
                }
            }else{//兼容ie9-
                imgDiv.innerHTML='<div class="img" style="filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\'' + fileInput.value + '\)\';"></div>';
            }
        }
        function selectImg(fileInputs,imgDivs){
            var checkImg=new RegExp("(.jpg$)|(.png$)|(.bmp$)|(.jpeg$)","i");
            var i=0;
            for(;i<fileInputs.length&&i<imgDivs.length;i++){
                (function(i){//立即执行函数；保存i
                    fileInputs[i].onchange=function(){
                        if(checkImg.test(fileInputs[i].value)){
                            previewImg(this,imgDivs[i]);
                        }else{
                            alert("只支持上传.jpg .png .bmp .jpeg;你的选择有误");
                        }
                    };
                })(i);
            }

        }
        /* 为IE6 IE7 IE8增加document.getElementsByClassName函数 */
        /MSIE\s*(\d+)/i.test(navigator.userAgent);
        var isIE=parseInt(RegExp.$1?RegExp.$1:0);
        if(isIE>0&&isIE<9){
            document.getElementsByClassName=function(cls){
                var els=this.getElementsByTagName('*');
                var ell=els.length;
                var elements=[];
                for(var n=0;n<ell;n++){
                    var oCls=els[n].className||'';
                    if(oCls.indexOf(cls)<0)        continue;
                    oCls=oCls.split(/\s+/);
                    var oCll=oCls.length;
                    for(var j=0;j<oCll;j++){
                        if(cls==oCls[j]){
                            elements.push(els[n]);
                            break;
                        }
                    }
                }
                return elements;
            }
        }
        var fileInputs=document.getElementsByClassName("img-btn");//文件选择按钮
        var imgDivs=document.getElementsByClassName("img-container");//图片容器
        selectImg(fileInputs,imgDivs);
        
$(document).ready(function(){
	$("#inserfunds").click(function(){
		var formData = new FormData();
		var fundsname = $("input[name='fundsname']").val();
		formData.append("fundsname",fundsname);
		var fundsdesc =$("#fundsdesc").val();
		formData.append("fundsdesc",fundsdesc);
		var fundsprice = $("#fundsprice").val();
		formData.append("fundsprice",fundsprice);
		var fundsuser=$("#fundsuser").val();
		formData.append("fundsuser",fundsuser);
		var fundsphone=$("#fundsphone").val();
		formData.append("fundsphone",fundsphone);
		var files=$("#files").get(0).files;
		for(var i=0; i< files.length; i++){
		        formData.append("files" , files[i] );
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
			success: function (result) {      //成功，回调函数
				if(result==null){
				 	alert("用户名或密码错误！");
				}else{
					alert("添加成功");
				}
			}
		})
    });
	});

</script>
</html>