<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<table class="easyui-datagrid" id="carouselUrl" title="商品列表"
	data-options="singleSelect:false,collapsible:true,pagination:true,url:'/kenya/content/pageQueryUrl',method:'get',pageNumbers:1,pageSize:10, 
		rownumbers:true, 
	      pageList: [5,10,15,20],toolbar:toolbar">
	<thead>
		<tr>
			<th data-options="field:'ck',checkbox:true"></th>

			<!-- <th data-options="field:'newstitle',checkbox:true"></th> -->
			<th data-options="field:'id',width:60">ID</th>
			<th data-options="field:'title',width:200">轮播标题</th>
			<th data-options="field:'pic',width:120">图片地址</th>
			<th data-options="field:'content',width:130">轮播地址</th>
			<th data-options="field:'created',width:100">创建时间</th>
		</tr>
	</thead>
</table>
<div id="itemEditWindow" class="easyui-window" title="编辑新闻"
	data-options="modal:true,closed:true,iconCls:'icon-save',href:'/kenya/rest/page/item-edit'"
	style="width: 80%; height: 80%; padding: 10px;"></div>
<script>
	function getSelectionsIds() {
		var itemList = $("#carouselUrl");
		var sels = itemList.datagrid("getSelections");
		var ids = [];
		for ( var i in sels) {
			ids.push(sels[i].id);
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
											var data = $("#carouselUrl").datagrid(
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
															"/kenya/carousel/delete1",
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
																								"#carouselUrl")
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
																								"#carouselUrl")
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
																								"#carouselUrl")
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