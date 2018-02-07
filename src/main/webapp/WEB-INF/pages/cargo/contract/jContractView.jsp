<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
</head>
<body>
	<form method="post">

		<div id="menubar">
			<div id="middleMenubar">
				<div id="innerMenubar">
					<div id="navMenubar">
						<ul>
							<li id="back"><a href="${ctx }/list">返回</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<div class="textbox" id="centerTextbox">

			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">浏览购销合同</div>
				</div>
			</div>
			<div>

				<div>
					<table class="commonTable" cellspacing="1">
						<tr>
							<td class="columnTitle_mustbe">收购方：</td>
							<td class="tableContent">${obj.c.offeror}</td>

							<td class="columnTitle_mustbe">打印版式：</td>
							<td class="tableContentAuto"><c:if
									test="${obj.c.printStyle=='2'}">两个货物</c:if> <c:if
									test="${obj.c.printStyle=='1'}">一个货物</c:if></td>
						</tr>
						<tr>
							<td class="columnTitle_mustbe">客户名称：</td>
							<td class="tableContent">${obj.c.customName}</td>
							<td class="columnTitle_mustbe">合同号：</td>
							<td class="tableContent">${obj.c.contractNo}</td>
						</tr>
						<tr>

							<td class="columnTitle_mustbe">交货期限：</td>
							<td class="tableContent"><fmt:formatDate
									value="${obj.c.deliveryPeriod}" pattern="yyyy-MM-dd" /></td>
							<td class="columnTitle_mustbe">船期：</td>
							<td class="tableContent"><fmt:formatDate
									value="${obj.c.shipTime}" pattern="yyyy-MM-dd" /></td>
						</tr>
						<tr>
							<td class="columnTitle_mustbe">重要程度：</td>
							<td class="tableContentAuto"><c:if
									test="${obj.c.importNum=='3'}">★★★</c:if> <c:if
									test="${obj.c.importNum=='2'}">★★</c:if> <c:if
									test="${obj.c.importNum=='1'}">★</c:if></td>
							<td class="columnTitle_mustbe">贸易条款：</td>
							<td class="tableContentAuto">${obj.c.tradeTerms}</td>
						</tr>
						<tr>
							<td class="columnTitle_mustbe">签单日期：</td>
							<td class="tableContent"><fmt:formatDate
									value="${obj.c.signingDate}" pattern="yyyy-MM-dd" /></td>
							<td class="columnTitle_mustbe">制单人：</td>
							<td class="tableContent">${obj.c.inputBy}</td>
						</tr>
						<tr>
							<td class="columnTitle_mustbe">审单人：</td>
							<td class="tableContent">${obj.c.checkBy}</td>
							<td class="columnTitle_mustbe">验货员：</td>
							<td class="tableContent">${obj.c.inspector}</td>
						</tr>
						<tr>
							<td class="columnTitle_mustbe">要求：</td>
							<td class="tableContent"><pre>${obj.c.crequest}</pre></td>
							</tr>
							<tr>
							<td class="columnTitle_mustbe">说明：</td>
							<td class="tableContent"><pre>${obj.c.remark}</pre></td>
						</tr>
					</table>
				</div>
			</div>



			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">货物信息列表</div>
				</div>
			</div>


			<div class="eXtremeTable">
				<table id="ec_table" class="tableRegion" width="98%">
					<thead>
						<tr>
							<td class="tableHeader">序号</td>
							<td class="tableHeader">货物图片</td>
							<td class="tableHeader">厂家</td>
							<td class="tableHeader">货号</td>
							<td class="tableHeader" width="200">货物描述</td>
							<td class="tableHeader">数量</td>
							<td class="tableHeader">包装单位</td>
							<td class="tableHeader">单价</td>
							<td class="tableHeader">总金额</td>
						</tr>
					</thead>
					<tbody class="tableBody">

						<c:forEach items="${obj.cpb}"  varStatus="ss">
		<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'" >
			<td>${ss.index+1}</td>
			
			<td><img src="${ctx}/ufiles/jquery/0${ss.index+1}.png" width="195" height="125"/></td>
			<td>${obj.cpb[ss.index].cp.factoryName}</td>
			<td>${obj.cpb[ss.index].cp.productNo}</td>
			<td width="200">${obj.cpb[ss.index].cp.productDesc}</td>
			<td>${obj.cpb[ss.index].cp.cnumber}</td>
			<td>${obj.cpb[ss.index].cp.packingUnit}</td>
			<td>${obj.cpb[ss.index].cp.price}</td>
			<td>${obj.cpb[ss.index].cp.amount}</td>
		</tr>
		<c:forEach items="${obj.cpb[ss.index].list}"  varStatus="status">
			<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'" >
				<td align="right"><font color="blue">附件: ${status.index+1}</font>&nbsp;</td>
				<td>假装有图片.jpg</td>
				<td>${obj.cpb[ss.index].list[status.index].factoryName}</td>
				<td>${obj.cpb[ss.index].list[status.index].productNo}</td>
				<td width="200">${obj.cpb[ss.index].list[status.index].productDesc}</td>
				<td>${obj.cpb[ss.index].list[status.index].cnumber}</td>
				<td>${obj.cpb[ss.index].list[status.index].packingUnit}</td>
				<td>${obj.cpb[ss.index].list[status.index].price}</td>
				<td>${obj.cpb[ss.index].list[status.index].amount}</td>
			</tr>
			</c:forEach>		
		</c:forEach>

					</tbody>
				</table>
			</div>

		</div>

	</form>
</body>
</html>

