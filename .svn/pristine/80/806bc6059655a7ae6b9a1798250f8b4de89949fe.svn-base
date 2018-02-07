<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
	<script type="text/javascript" src="${ctx}/js/datepicker/WdatePicker.js"></script>
</head>
<body>
<form method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
    <div id="navMenubar">
<ul>
<li id="back"><a href="${ctx}/toMyPackingList">返回</a></li>
</ul>
    </div>
</div>
</div>
</div>
     
<div class="textbox" id="centerTextbox">
    
    <div class="textbox-header">
    <div class="textbox-inner-header">
    <div class="textbox-title">
		浏览装箱单
    </div> 
    </div>
    </div>
<div>
    <div>
		<table class="commonTable" cellspacing="1">
	        <tr>
	            <td class="columnTitle_mustbe">发票号 ：</td>
	            <td class="tableContent">${obj.invoiceNo}</td>
	            <td class="columnTitle_mustbe">发票时间：</td>
	            <td class="tableContent"><fmt:formatDate value="${obj.invoiceDate}" pattern="yyyy-MM-dd"/></td>
	        </tr>
	        <tr>
	            <td class="columnTitle_mustbe">卖家：</td>
	            <td class="tableContent"><pre>${obj.seller}</pre></td>
	            <td class="columnTitle_mustbe">买家：</td>
	            <td class="tableContent"><pre>${obj.buyer}</pre></td>
	        </tr>
	        <tr>
	            <td class="columnTitle_mustbe">唛头：</td>
	            <td class="tableContent"><pre>${obj.marks}</pre></td>
	            <td class="columnTitle_mustbe">说明：</td>
	            <td class="tableContent"><pre>${obj.descriptions}</pre></td>
	        </tr>
		</table>
	</div>
</div>
 
    
    <div class="textbox-header">
    <div class="textbox-inner-header">
    <div class="textbox-title">
		相关报运单
    </div> 
    </div>
    </div>
    
<div class="listTablew">
	<table id="ec_table" class="tableRegion" width="98%" >
	<thead>
	<tr>
		<td class="tableHeader"><input type="checkbox" name="selid" onclick="checkAll('id',this)"></td>
		<td class="tableHeader">序号</td>
		<td class="tableHeader">报运号</td>
		
		<td class="tableHeader">L/C</td>
		<td class="tableHeader">装运港</td>
		<td class="tableHeader">收货人及地址</td>
		<td class="tableHeader">运输方式</td>
		<td class="tableHeader">价格条件</td>
		<td class="tableHeader">录入日期</td>
		<td class="tableHeader">状态</td>
	</tr>
	</thead>
	<tbody class="tableBody" >
	
	<c:forEach items="${exportList}" var="o" varStatus="status">
	<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'" >
		<td><input type="checkbox" name="id" value="${o.exportId}"/></td>
		<td>${status.index+1}</td>
		<td>${o.customerContract}</td>
		
		<td>${o.lcno}</td>
		<td>${o.shipmentPort}</td>
		<td>${o.consignee}</td>
		<td>${o.transportMode}</td>
		<td>${o.priceCondition}</td>
		<td><fmt:formatDate value="${o.inputDate}" pattern="yyyy-MM-dd"/></td>
		<!-- 0-草稿 1-已上报 2-装箱 3-委托 4-发票 5-财务 -->
		<td>
			<c:if test="${o.state==0}">草稿</c:if>
			<c:if test="${o.state==1}"><font color="green">已上报</font></c:if>
			<c:if test="${o.state==2}"><font color="green">装箱</font></c:if>
			<c:if test="${o.state==3}"><font color="green">委托</font></c:if>
			<c:if test="${o.state==4}"><font color="green">发票</font></c:if>
			<c:if test="${o.state==5}"><font color="green">财务</font></c:if>
		</td>
	</tr>
	</c:forEach>
	
	</tbody>
</table>
</div>
 

 
</form>
</body>
</html>


