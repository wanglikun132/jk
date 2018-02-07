<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
</head>
<body>
	<form method="post">


		<input type="hidden" name="factoryId" value="${obj.factoryId}" />

		<div id="menubar">
			<div id="middleMenubar"></div>
		</div>

		<div class="textbox" id="centerTextbox">

			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">修改工厂信息</div>
				</div>
			</div>
			<div>

				<div>
					<table class="commonTable" cellspacing="1">
						<tr>
							<td class="columnTitle_mustbe">工厂简称：</td>
							<td class="tableContent"><input type="text"
								name="fullName" value="${obj.fullName}" /></td>
						</tr>
						<tr>
							<td class="columnTitle_mustbe">工厂全称：</td>
							<td class="tableContent"><input type="text"
								name="factoryName" value="${obj.factoryName}" /></td>
						</tr>
								<tr>
							<td class="columnTitle_mustbe">验货员：</td>
							<td class="tableContent"><input type="text"
								name="inspector" value="${obj.inspector}" /></td>
						</tr>
						<tr>
							<td class="columnTitle_mustbe">联系方式：</td>
							<td class="tableContent"><input type="text"
								name="phone" value="${obj.phone}" /></td>
						</tr>

						<tr>
							<td class="columnTitle_mustbe">传真：</td>
							<td class="tableContent"><input type="text"
								name="fax" value="${obj.fax}" /></td>
						</tr>
					
						<tr>
							<td class="columnTitle_mustbe">说明：</td>
							<td class="tableContent"><textarea 
								name="cnote"   style="width: 385px; height: 100px;">
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
							onclick="formSubmit('${ctx}/basicinfo/factory/update','_self');">确定</a></li>
						<li id="back"><a href="list.action">返回</a></li>
					</ul>
				</div>
			</div>
	</form>
</body>
</html>

