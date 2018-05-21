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
	<table align="center">
		<tr>
			<td>
			   <div style="margin :0px auto; width:990px;">

<input type="file"  name="file" id="doc" multiple="multiple"  style="width:150px;" onchange="javascript:setImagePreviews();" accept="image/*" />

<div id="dd" style=" width:990px;"></div>



</div>
			</td>
		</tr>
	</table>
</form>
</body>
<script type="text/javascript">
function setImagePreviews(avalue) {

    var docObj = document.getElementById("doc");

    var dd = document.getElementById("dd");

    dd.innerHTML = "";

    var fileList = docObj.files;

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

            //IE下，使用滤镜

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



    return true;

}
</script>
</html>