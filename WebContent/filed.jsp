<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="css/upload.css" rel="stylesheet">
		<title>上传图片</title>
	</head>

	<body>
		<div id="T_upload"></div>

	</body>
	<script src="http://www.jq22.com/jquery/jquery-1.7.1.js"></script>
	<script src="js/T_upload.js"></script>

	<script type="text/javascript">
		$(function() {
//			var md = "product";
//			var pid = "asdasdasdasdasd";
			$.Tupload.init({
//				url: "product/uploadImage2?md=" + md + "&pid=" + pid,
						title	  : "宝贝图片大小不能超过500kb,为使避免图片上传出现问题，请尽量选择完毕图片后再上传",
				fileNum: 5, // 上传文件数量
				divId: "T_upload", // div  id
				accept: "image/jpeg,image/x-png", // 上传文件的类型
				//fileSize  :51200000,     // 上传文件的大小
				onSuccess: function(data, i) {
						/*var temp =eval('(' + data.currentTarget.response + ')')
	    	if(temp.fileName != undefined){
	    		$("#img_src"+i).attr('value',temp.fileName);
	    		$("#img_src"+i).attr('name',"upload_img");
	    	}*/
				},
				onDelete: function(i) {
					/*var img_val = $("#img_src"+i).attr("value");
					if(img_val != '' && img_val != undefined){
						var md = "product";
						var img= $.page.getImgUrl(img_val);
						$.ajax({
							type:"POST",
							url: "base/delPic" ,
							data : {img:img,id: pid,md:md},
							success: function(rel){}
						});
					}*/
				}
			});
		})
	</script>

</html>