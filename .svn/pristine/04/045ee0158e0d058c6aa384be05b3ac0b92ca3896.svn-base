<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<script type="text/javascript">
	function page_nav(frm, num) {
		frm.pageNo.value = num;
		frm.submit();
	}
</script>
</head>

<body>
	<form name="form2" action="${ctx}/basicinfo/factory/list.action">


		<!-- 页面主体部分（列表等） -->
		<div class="textbox" id="centerTextbox">
			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">
						<h2>厂家列表</h2>

					</div>
				</div>
			</div>

<div id="menubar">
			<div id="middleMenubar">
				<div id="innerMenubar">
					<div id="navMenubar">
						<ul>
							<li id="new"><a href="#" 
								onclick="formSubmit('${ctx }/basicinfo/factory/toinsert','_self');this.blur();">新增</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
			

			<span class="noprint">
				<div id="find_div" style="width: 98%;">
					<fieldset>
						<legend>
							<font color="000">查询条件&nbsp;</font>
						</legend>
						<div style="width: 98%; padding-top: 7px; text-align: left;">

							类型： <select name="f_type" style="width: 130px; heigh: 30px;"
								dataType="下拉列表" dispName="查询条件">
								<option
									value='<c:if test="${not empty f_type }">${f_type }</c:if><c:if test="${ empty f_type }">-1</c:if>'
									selected>--请选择--</option>
								<option value='1'>全称</option>
								<option value='2'>简称</option>
								<option value='3'>联系人</option>
								<option value='4'>电话</option>
								<option value='5'>手机</option>
								<option value='6'>传真</option>
								<option value='7'>说明</option>
							</select> 内容： <input type="text" name="f_conditionStr"
								value="${f_conditionStr }" size="30" onFocus="this.select();"
								onKeyDown="javascript:if(event.keyCode==13){ document.getElementById('btnFind').onclick(); }" />

							<input id="btnFind" type="submit" name="查询" value="查询"> <input
								type="button" name="清空" value="清空"
								onclick="findReset();this.blur();">
						</div>
					</fieldset>
				</div>
			</span>



			<div>
				<div>
					<input type="hidden" name="pageNo" value="${pageNo}" />
				</div>
				<div class="eXtremeTable">
					<table id="ec_table" border="0" cellspacing="0" cellpadding="0"
						class="tableRegion" width="98%">
						<thead>
							<tr style="padding: 0px;">
								<td colspan="10">
									<table border="0" cellpadding="0" cellspacing="0" width="100%">
										<tr>
											<td class="statusBar">找到${totalCount} 条记录, 显示
												${(pageNo-1)*pageSize+1} 到 ${pageNo*pageSize}</td>
											<td class="compactToolbar" align="right">
												<table border="0" cellpadding="1" cellspacing="2">
													<tr>
														<td><a
															href="
														javascript:page_nav(document.forms[0],1);">
																<img src="../../images/table/firstPageDisabled.gif"
																style="border: 0" alt="第一页" />
														</a></td>
														<td><c:if test="${pageNo>1 }">
																<a
																	href="
																javascript:page_nav(document.forms[0],${pageNo-1});">
															</c:if> <c:if test="${pageNo<=1 }">
																<a href="#">
															</c:if> <img src="../../images/table/prevPageDisabled.gif"
															style="border: 0" alt="上一页" /> </a></td>
														<td><c:if test="${pageNo<totalPage }">
																<a
																	href="javascript:page_nav(document.forms[0],${pageNo+1});">
															</c:if> <c:if test="${pageNo>=totalPage }">
																<a href="#">
															</c:if> <img src="../../images/table/nextPage.gif"
															style="border: 0" title="下一页" alt="下一页" /></a></td>
														<td><a
															href="javascript:page_nav(document.forms[0],${totalPage});"><img
																src="../../images/table/lastPage.gif" style="border: 0"
																title="最后页" alt="最后页" /></a></td>


														<td><img src="../../images/table/separator.gif"
															style="border: 0" alt="Separator" /></td>
														<td><select name="pageSize">
																<option value="10" selected="selected">10</option>
																<option value="50">50</option>
																<option value="100">100</option>
														</select></td>
														<td><img src="../../images/table/separator.gif"
															style="border: 0" alt="Separator" /></td>
														<td><a
															href="${ctx}/basicinfo/factory/exportExcel?pageSize=${pageNo*pageSize-((pageNo-1)*pageSize)}&pageNo=${pageNo}&f_type=${f_type }"><img
																src="../../images/table/xls.gif" style="border: 0"
																title="Export Excel" alt="Excel" /></a></td>
													</tr>
												</table>
											</td>
										</tr>
									</table>
								</td>
							</tr>

							<tr>
								<td class="tableHeader"><input type="checkbox"
									id="id_selector" name="id_selector" title="(Un)Select All"
									onclick="for(i = 0; i < document.getElementsByName('id').length; i++)document.getElementsByName('id').item(i).checked=document.getElementById('id_selector').checked;"></td>
								<td class="tableHeader" style="text-align: center"></td>
								<td class="tableHeader">厂家全称</td>
								<td class="tableHeader">简称</td>
								<td class="tableHeader">联系人</td>
								<td class="tableHeader">联系电话</td>
								<td class="tableHeader">手机</td>
								<td class="tableHeader">传真</td>
								<td class="tableHeader">验货员</td>
								<td class="tableHeader">操作</td>

							</tr>
						</thead>
						<tbody class="tableBody">
							<c:forEach items="${dataList }" var="f" varStatus="status">
									
								<c:if test="${status.index%2==0 }">
									<tr class="odd" onmouseover="this.className='highlight'"
										onmouseout="this.className='odd'">
								</c:if>

								<c:if test="${status.index%2==1 }">
									<tr class="even" onmouseover="this.className='highlight'"
										onmouseout="this.className='even'">
								</c:if>
								
								<td><input type="checkbox" name="id" dataType="复选框"
									dispName="厂家管理" minSelect="1" value="${f.factoryId }" /></td>
								<td style="text-align: center">&nbsp;</td>
								
								<td><a
									href="${ctx}/basicinfo/factory/detail?id=${f.factoryId}">
										${f.fullName } </a></td>
										
								<td>${f.factoryName }</td>
								<td>${f.contacts }</td>
								<td>${f.phone }</td>
								<td>${f.mobile }</td>
								<td>${f.fax }</td>
								<td>${f.inspector }</td>
								
								<td><a
									href="javascript:if(confirm('确实要删除吗?')) location='${ctx}/basicinfo/factory/delete?id=${f.factoryId}'">删除</a>
									<a
									href="${ctx}/basicinfo/factory/toupdate.action?id=${f.factoryId}">修改</a>
									<a href="${ctx}/basicinfo/factory/detail?id=${f.factoryId}">查看</a>
								</td>
								
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
	</form>
</body>
</html>

