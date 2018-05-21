<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href="/kenya/js/kindeditor-4.1.10/themes/default/default.css"
	type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8"
	src="/kenya/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8"
	src="/kenya/js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<div style="padding: 10px 10px 10px 10px">
	<form id="carouselAddForm" class="itemForm" method="post">
		<table cellpadding="5">

			<tr>
				<td>轮播发布时间:</td>
				<td><input class="easyui-datebox" type="text" name="created"
					data-options="required:true" style="width: 50px;"></input></td>

			</tr>
			<tr>
				<td>轮播图片:</td>
				<td><a href="javascript:void(0)"
					class="easyui-linkbutton picFileUpload">上传图片</a> <input
					type="hidden" name=newsimg0 /></td>
			</tr>
			<tr>
				<td>项目<select id="seleced1" name="category">
						<option value="please" selected="selected">请选择</option>
						<option value="project-1">有资金找项目</option>
						<option value="funds-1">有项目找资金</option>
						<!-- <option value="news">新闻</option> -->
						<option value="url">url</option>
				</select></td>
				<!-- <td hidden ="hidden">    <input class="easyui-textbox" type="text" name="newstitle"
					data-options="required:true" style="width: 280px;"></input> -->

				<td id="show1">
					<p id=show hidden="hidden">
						请输入id <input class="easyui-textbox" type="text" name="categoryId"
							data-options="required:true" style="width: 50px;"></input>
					</p>
				</td>
				<!-- 	hidden="hidden" -->
			</tr>
	
			<p></p>

		</table>
		<input type="hidden" name="itemParams" />
	</form>
	<td>
		<button id="showw" type="button" hidden="hidden">Click Me编辑轮播</button>
	</td>
	<div style="padding: 5px">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			onclick="submitForm()" id="submit">提交</a> 
			
			
			<a href="javascript:void(0)"
			class="easyui-linkbutton" onclick="clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	$("#seleced1").change(function() {
		value = $("#seleced1 option:selected").val();
		text = $("#seleced1 option:selected").text();
		$.messager.alert(value);

		if (value != "url" && value != "please") {
			//	$("#show").show();
			$("#show").attr("style", "display:block;")
			$("#showw").attr("style", "display:none;")
		} else if (value == "please") {
			//	$.messager.alert("ssss")
			$("#showw").hide()
			$("#show").hide()
			$("#submit").hide();
		} else {
			//	$.messager.alert("ss4")
			$("#showw").attr("style", "display:block;")
			$("#show").attr("style", "display:none;")
			$("#submit").hide();
			//$("name="created")
		}

	})

	/* var contentListToolbar = [{
	 text:'新增',
	 iconCls:'icon-add',
	 handler:function(){
	 var node = $("#contentCategoryTree").tree("getSelected");
	 if(!node || !$("#contentCategoryTree").tree("isLeaf",node.target)){
	 $.messager.alert('提示','新增内容必须选择一个内容分类!');
	 return ;
	 }
	 TT.createWindow({
	 url : "/kenya/content-add"
	 }); 
	 }

	 }] ;  */
	$('#showw').click(function() {
		TT.createWindow({
			url : "/kenya/content-add"
		});
	});
	var itemAddEditor;
	//页面初始化完毕后执行此方法 newstext
	$(function() {
		//创建富文本编辑器newstext

		itemAddEditor = TAOTAO.createEditor("#itemAddForm [name=newstext]");
		//	 cssData: 'body {font-family: "微软雅黑"; font-size: 14px}'
		//初始化类目选择和图片上传器
		TAOTAO.init({
			fun : function(node) {
				//根据商品的分类id取商品 的规格模板，生成规格信息。第四天内容。
				TAOTAO.changeItemParam(node, "itemAddForm");
			}
		});
	});
	//提交表单
	function submitForm() {
		value = $("#seleced1 option:selected").val();
		text = $("#seleced1 option:selected").text();
		//$.messager.alert('提示',text+'ss' );
		//有效性验证
		if (!$('#carouselAddForm').form('validate')) {
			$.messager.alert('提示', '表单还未填写完成!');
			return;
		}
		/* 
		 $("#itemAddForm [name=price]").val(
		 eval($("#itemAddForm [name=priceView]").val()) * 100);  */
		//同步文本框中的商品描述
		////////itemAddEditor.sync();
		var s = $("#seleced1 option:selected").text();
		$.post("/kenya/carousel/save", $("#carouselAddForm").serialize(),
				function(date) {
					if (date.status == 200) {
						$.messager.alert('提示', '新增 【' + text + '】 成功!');
					}
				});
	}

	function clearForm() {
		$('#itemAddForm').form('reset');
		itemAddEditor.html('');
	}
</script>
