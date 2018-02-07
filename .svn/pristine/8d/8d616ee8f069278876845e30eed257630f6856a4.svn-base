<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title></title>
	<script type="text/javascript">
function batch() {
	var names = document.getElementsByName("id");
	var flag = false;//标记判断是否选中一个                 
	for (var i = 0; i < names.length; i++) {
		if (names[i].checked) {
			var ns = names[i].nextElementSibling; //获得s的下一个兄弟节点
			alert(ns.value);
			flag = true;
			break;
		}
	}
	if (flag) {
		formSubmit('${ctx}/toupdate','_self');
	} else{
		alert("操作错误");
	}
}
</script>
	<script type="text/javascript">
function zhaungxiang() {
	var names = document.getElementsByName("id");
	var flag = false;//标记判断是否选中一个                 
	for (var i = 0; i < names.length; i++) {
		if (names[i].checked) {
			
			flag = true;
			break;
		}
	}
	if (flag) {
		formSubmit('${ctx}/cargo/packinglist/tocreate.action','_self');
	} else{
		alert("操作错误");
	}
}
</script>


<script type="text/javascript">
function zhaungxiang() {
	// 获取所有多选按钮
	var names = document.getElementsByName("id");
	//上报合同的个数
	var count = 0;
	for (var i = 0; i < names.length; i++) {
		if (names[i].checked) {
			var ns = names[i].nextElementSibling; //获得s的下一个兄弟节点
			alert(ns.value);
			if (ns.value == '0') {
				names[i].checked = true;
				count++;
			} else {
				names[i].checked = false;
			}
		}
	}
	if (count > 0) {
		formSubmit('${ctx}/cargo/packinglist/tocreate.action','_self');
	} else {
		alert("请选择要装箱的报运单！");
	}
}
</script>
</head>

<body>
<form name="icform" method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
<li id="update"><a href="#" onclick="batch();this.blur();">修改</a></li>
<li id="new"><a href="#" onclick="zhaungxiang();this.blur();">装箱</a></li>
</ul>
  </div>
</div>
</div>
</div>
   
<div class="textbox" id="centerTextbox">
  <div class="textbox-header">
  <div class="textbox-inner-header">
  <div class="textbox-title">
   报运单列表
  </div> 
  </div>
  </div>
  
<div>

<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
	<thead>
	<tr>
		<td class="tableHeader"><input type="checkbox" name="selid" onclick="checkAll('id',this)"></td>
		<td class="tableHeader">序号</td>
		<td class="tableHeader">报运号</td>
		<td class="tableHeader">货物数/附件数</td>
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
	
	<c:forEach items="${dataList}" var="o" varStatus="status">
	<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'" >
		<td><input type="checkbox" name="id" value="${o.exportId}"/><input type="hidden"
									value="${o.state}" name="status" /></td>
		<td>${status.index+1}</td>
		<td>${o.customerContract}</td>
		<td>${o.pnum}/${o.extnum}</td>
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
 
</div>

 
</form>
</body>
</html>


