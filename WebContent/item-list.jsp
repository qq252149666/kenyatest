<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="itemList" title="商品列表"
	data-options="singleSelect:false,collapsible:true,pagination:true,url:'/kenya/news/pageQuery',method:'get',pageNumbers:1,pageSize:10, 
		rownumbers:true, 
	      pageList: [5,10,15,20],toolbar:toolbar">
	<thead>
		<tr>
			<th data-options="field:'ck',checkbox:true"></th>

			<!-- <th data-options="field:'newstitle',checkbox:true"></th> -->
			<th data-options="field:'newsid',width:60">新闻ID</th>
			<th data-options="field:'newstitle',width:200">新闻标题</th>
			<th data-options="field:'newsauthor',width:100">作者</th>
			<th
				data-options="field:'newscreatetime',width:130,align:'center',formatter:TAOTAO.formatDateTime">创建时间</th>
			<th data-options="field:'newstext',width:1000 	">文章</th>
			<!--             <th data-options="field:'sellPoint',width:100">卖点</th>
            <th data-options="field:'price',width:70,align:'right',formatter:TAOTAO.formatPrice">价格</th>
            <th data-options="field:'num',width:70,align:'right'">库存数量</th>
            <th data-options="field:'barcode',width:100">条形码</th>
            <th data-options="field:'status',width:60,align:'center',formatter:TAOTAO.formatItemStatus">状态</th>
            <th data-options="field:'created',width:130,align:'center',formatter:TAOTAO.formatDateTime">创建日期</th>
            <th data-options="field:'updated',width:130,align:'center',formatter:TAOTAO.formatDateTime">更新日期</th> -->
		</tr>
	</thead>
</table>
<div id="itemEditWindow" class="easyui-window" title="编辑新闻"
	data-options="modal:true,closed:true,iconCls:'icon-save',href:'/kenya/rest/page/item-edit'"
	style="width: 80%; height: 80%; padding: 10px;"></div>
<script>
	/* 	var p = $('#itemList').datagrid('getSelections');
	 $(p).pagination({
	 pageSize : 10,//每页显示的记录条数，默认为10 
	 pageList : [ 5, 10,  ],//可以设置每页记录条数的列表  
	 beforePageText : '第',//页数文本框前显示的汉字 
	 afterPageText : '页    共 {pages} 页',
	 displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录',
	 onBeforeRefresh:function(){
	 $(this).pagination('loading');
	 alert('before refresh');
	 $(this).pagination('loaded');
	 }
	 });  */
	function getSelectionsIds() {
		var itemList = $("#itemList");
		var sels = itemList.datagrid("getSelections");
		var ids = [];
		for ( var i in sels) {
			ids.push(sels[i].newsid);
		}
		ids = ids.join(",");
		return ids;
	}

	var toolbar = [
			{
				text : '新增',
				iconCls : 'icon-add',
				handler : function() {
					$(".tree-title:contains('新增新闻')").parent().click();
				}
			},
			{
				text : '编辑',
				iconCls : 'icon-edit',
				handler : function() {
					var ids = getSelectionsIds();
					if (ids.length == 0) {
						$.messager.alert('提示', '必须选择一个商品才能编辑!');
						return;
					}
					if (ids.indexOf(',') > 0) {
						$.messager.alert('提示', '只能选择一个商品!');
						return;
					}

					$("#itemEditWindow")
							.window(
									{
										onLoad : function() {
											//回显数据
											var data = $("#itemList").datagrid(
													"getSelections")[0];
											data.priceView = TAOTAO
													.formatPrice(data.price);
											$("#itemeEditForm").form("load",
													data);

											// 加载商品描述
											$
													.getJSON(
															'/rest/item/query/item/desc/'
																	+ data.id,
															function(_data) {
																if (_data.status == 200) {
																	//UM.getEditor('itemeEditDescEditor').setContent(_data.data.itemDesc, false);
																	itemEditEditor
																			.html(_data.data.itemDesc);
																}
															});

											//加载商品规格
											$
													.getJSON(
															'/rest/item/param/item/query/'
																	+ data.id,
															function(_data) {
																if (_data
																		&& _data.status == 200
																		&& _data.data
																		&& _data.data.paramData) {
																	$(
																			"#itemeEditForm .params")
																			.show();
																	$(
																			"#itemeEditForm [name=itemParams]")
																			.val(
																					_data.data.paramData);
																	$(
																			"#itemeEditForm [name=itemParamId]")
																			.val(
																					_data.data.id);

																	//回显商品规格
																	var paramData = JSON
																			.parse(_data.data.paramData);

																	var html = "<ul>";
																	for ( var i in paramData) {
																		var pd = paramData[i];
																		html += "<li><table>";
																		html += "<tr><td colspan=\"2\" class=\"group\">"
																				+ pd.group
																				+ "</td></tr>";

																		for ( var j in pd.params) {
																			var ps = pd.params[j];
																			html += "<tr><td class=\"param\"><span>"
																					+ ps.k
																					+ "</span>: </td><td><input autocomplete=\"off\" type=\"text\" value='"+ps.v+"'/></td></tr>";
																		}

																		html += "</li></table>";
																	}
																	html += "</ul>";
																	$(
																			"#itemeEditForm .params td")
																			.eq(
																					1)
																			.html(
																					html);
																}
															});

											TAOTAO.init({
												"pics" : data.image,
												"cid" : data.cid,
												fun : function(node) {
													TAOTAO.changeItemParam(
															node,
															"itemeEditForm");
												}
											});
										}
									}).window("open");

				}
			},
			{
				text : '删除',
				iconCls : 'icon-cancel',
				handler : function() {
					var ids = getSelectionsIds();
					if (ids.length == 0) {
						$.messager.alert('提示', '未选中商品!');
						return;
					}
					$.messager
							.confirm(
									'确认',
									'确定删除ID为 ' + ids + ' 的商品吗？',
									function(r) {
										if (r) {
											var params = {
												"ids" : ids
											};
											$
													.post(
															"/kenya/news/rest/item/delete",
															params,
															function(data) {
																if (data.status == 200) {
																	$.messager
																			.alert(
																					'提示',
																					'删除商品成功!',
																					undefined,
																					function() {
																						$(
																								"#itemList")
																								.datagrid(
																										"reload");
																					});
																}
															});
										}
									});
				}
			},
			'-',
			{
				text : '下架',
				iconCls : 'icon-remove',
				handler : function() {
					var ids = getSelectionsIds();
					if (ids.length == 0) {
						$.messager.alert('提示', '未选中商品!');
						return;
					}
					$.messager
							.confirm(
									'确认',
									'确定下架ID为 ' + ids + ' 的商品吗？',
									function(r) {
										if (r) {
											var params = {
												"ids" : ids
											};
											$
													.post(
															"/rest/item/instock",
															params,
															function(data) {
																if (data.status == 200) {
																	$.messager
																			.alert(
																					'提示',
																					'下架商品成功!',
																					undefined,
																					function() {
																						$(
																								"#itemList")
																								.datagrid(
																										"reload");
																					});
																}
															});
										}
									});
				}
			},
			{
				text : '上架',
				iconCls : 'icon-remove',
				handler : function() {
					var ids = getSelectionsIds();
					if (ids.length == 0) {
						$.messager.alert('提示', '未选中商品!');
						return;
					}
					$.messager
							.confirm(
									'确认',
									'确定上架ID为 ' + ids + ' 的商品吗？',
									function(r) {
										if (r) {
											var params = {
												"ids" : ids
											};
											$
													.post(
															"/rest/item/reshelf",
															params,
															function(data) {
																if (data.status == 200) {
																	$.messager
																			.alert(
																					'提示',
																					'上架商品成功!',
																					undefined,
																					function() {
																						$(
																								"#itemList")
																								.datagrid(
																										"reload");
																					});
																}
															});
										}
									});
				}
			} ];
</script>