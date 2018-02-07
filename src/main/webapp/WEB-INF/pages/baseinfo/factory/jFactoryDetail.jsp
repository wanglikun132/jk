<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title></title>

</head>
<body>
	<form method="post">


		<input type="hidden" name="id" value="${obj.factoryId}" />

		<div id="menubar">
			<div id="middleMenubar"></div>
		</div>

		<div class="textbox" id="centerTextbox">

			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">工厂信息详情</div>
				</div>
			</div>
			<div>

				<div>
					<table class="commonTable" cellspacing="1">
						<tr>
							<td class="columnTitle_mustbe">工厂简称：</td>
							<td class="tableContent"><input  UNSELECTABLE="on"  type="text"
								name="contractor" value="${obj.factoryName}" readonly="readonly" /></td>
						</tr>
						<tr>
							<td class="columnTitle_mustbe">工厂全称：</td>
							<td class="tableContent"><input  UNSELECTABLE="on" type="text"
								name="contractor" value="${obj.fullName}" readonly="readonly"  /></td>
						</tr>
								<tr>
							<td class="columnTitle_mustbe">验货员：</td>
							<td class="tableContent"><input UNSELECTABLE="on"  type="text"
								name="contractor" value="${obj.inspector}" readonly="readonly" /></td>
						</tr>
						<tr>
							<td class="columnTitle_mustbe">联系方式：</td>
							<td class="tableContent"><input  UNSELECTABLE="on" type="text"
								name="contractor" value="${obj.phone}"  readonly="readonly" /></td>
						</tr>

						<tr>
							<td class="columnTitle_mustbe">传真：</td>
							<td class="tableContent"><input type="text" UNSELECTABLE="on"
								name="contractor" value="${obj.fax}" readonly="readonly"  /></td>
						</tr>
					
						<tr>
							<td class="columnTitle_mustbe">说明：</td>
							<td class="tableContent"><textarea UNSELECTABLE="on" 
								name="contractor" id="t1"  style="width: 385px; height: 100px;" readonly="readonly" >
								${obj.cnote}
								</textarea>
								</td>
						</tr>
					</table>
				</div>
			</div>
			</div>
			<div id="innerMenubar">
				<div id="navMenubar">
					<ul>
						<li id="save"><a href="#"
							onclick="formSubmit('list','_self');">确定</a></li>
						<li id="back"><a href="list.action">返回</a></li>
					</ul>
				</div>
			</div>
	</form>
</body>
</html>

