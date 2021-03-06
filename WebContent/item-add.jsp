<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href="/kenya/js/kindeditor-4.1.10/themes/default/default.css"
	type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8"
	src="/kenya/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8"
	src="/kenya/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<%-- <link rel="stylesheet"
	href="${pageContext.request.contextPath}/kindeditor-4.1.10/themes/default/default.css" />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/kindeditor-4.1.10/themes/default/default.css" />

<script type="text/javascript" charset="utf-8"
	src="${pageContext.request.contextPath}/kindeditor-4.1.10/kindeditor-min.js"></script>
<script type="text/javascript" charset="utf-8"
	src="${pageContext.request.contextPath}/kindeditor-4.1.10/lang/zh_CN.js"></script> --%>
<div style="padding: 10px 10px 10px 10px">
	<form id="itemAddForm" class="itemForm" method="post">
		<table cellpadding="5">
			<!-- 	<tr>
				<td>商品类目:</td>
				<td><a href="javascript:void(0)"
					class="easyui-linkbutton selectItemCat">择类目</a> <input
					type="hidden" name="cid" style="width: 280px;"></input></td>
			</tr> -->
			<tr>
				<td>新闻标题:</td>
				<td><input class="easyui-textbox" type="text" name="newstitle"
					data-options="required:true" style="width: 280px;"></input></td>
			</tr>
			<tr>
				<td>作者:</td>
				<td><input class="easyui-textbox" name="newsauthor"
					data-options="multiline:true,validType:'length[0,150]'"
					style="height: 60px; width: 280px;"></input></td>
			</tr>
			<tr>
				<td>新闻发布时间:</td>
				<td><input class="easyui-datebox" type="text"
					name="newscreatetime" data-options="required:true"
					style="width: 100px,formatter:TAOTAO.formatDateTime;"></input></td>
			</tr>
				<!-- <th data-options="field:'newscreatetime',width:130,align:'center',formatter:TAOTAO.formatDateTime">创建时间</th>
					 -->
			<tr>
				<td>新闻图片:</td>
				<td><a href="javascript:void(0)"
					class="easyui-linkbutton picFileUpload">上传图片</a> <input
					type="hidden" name="newsimg0" /></td>
			</tr>
			<tr>
				<td>新闻描述:</td>
				<td><textarea
						style="width: 400px; height: 700px; visibility: hidden;"
						name="newstext"></textarea></td>
			</tr>
			<tr class="params hide">
				<td>商品规格:</td>
				<td></td>
			</tr>
		</table>
		<input type="hidden" name="itemParams" />
	</form>
	<div style="padding: 5px">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			onclick="submitForm()">提交</a> <a href="javascript:void(0)"
			class="easyui-linkbutton" onclick="clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
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
		//有效性验证
		if (!$('#itemAddForm').form('validate')) {
			$.messager.alert('提示', '表单还未填写完成!');
			return;
		}
		/* 
		 $("#itemAddForm [name=price]").val(
		 eval($("#itemAddForm [name=priceView]").val()) * 100);  */
		//同步文本框中的商品描述
		itemAddEditor.sync();
		//取商品的规格
		/*
		var paramJson = [];
		$("#itemAddForm .params li").each(function(i,e){
			var trs = $(e).find("tr");
			var group = trs.eq(0).text();
			var ps = [];
			for(var i = 1;i<trs.length;i++){
				var tr = trs.eq(i);
				ps.push({
					"k" : $.trim(tr.find("td").eq(0).find("span").text()),
					"v" : $.trim(tr.find("input").val())
				});
			}
			.push({
				"group" : group,
				"params": ps
			});
		});*/
		//把json对象转换成字符串
	/* 	paramJson = JSON.stringify(paramJson);
		$("#itemAddForm [name=itemParams]").val(paramJson); */
		 
		//ajax的post方式提交表单
		//$("#itemAddForm").serialize()将表单序列号为key-value形式的字符串
		$.post("/kenya/news/item/save", $("#itemAddForm").serialize(),
				function(news) {
			//$.messager.alert(news);
				//$.messager.alert(date.code);
				
					if (news== 1) {
						$.messager.alert('提示', '新增商品成功!');
					} 
				});
	}

	function clearForm() {
		$('#itemAddForm').form('reset');
		itemAddEditor.html('');
	}
</script>
