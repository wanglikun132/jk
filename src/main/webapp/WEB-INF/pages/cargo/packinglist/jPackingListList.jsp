<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
<script>
function chakan() {
		// 获取所有多选按钮
		var names = document.getElementsByName("id");
		var flag = false;//标记判断是否选中一个                 
		for (var i = 0; i < names.length; i++) {
			if (names[i].checked) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			alert("请最少选择一项！");
			return false;
		}
		//上报合同的个数
		var count = 0;
		for (var i = 0; i < names.length; i++) {
			if (names[i].checked) {
				var ns = names[i].nextElementSibling; //获得s的下一个兄弟节点
				alert(ns.value);
				if (ns.value == '0'||ns.value == '1') {
					names[i].checked = true;
					count++;
				} 
			}
		}
		alert(count);
		if (count == 1) {
			formSubmit('${ctx}/showlist', '_self');
		} else if(count == 0){
			alert("请至少选择一个!");
		}else if(count>1){
			alert("请选择一个进行查看!");
		}
	}
</script>


<script>
function xiugai() {
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
			formSubmit('${ctx}/toupdatepacking', '_self');
		} else {
			alert("请选择未装箱的装箱单！");
		}
	}

	//必须选择一个  
	function selectOne() {
		var names = document.getElementsByName("id");
		var flag = false;//标记判断是否选中一个                 
		for (var i = 0; i < names.length; i++) {
			if (names[i].checked) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			alert("请最少选择一项！");
			return false;
		}
	}
</script>

<script>
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
			formSubmit('${ctx}/boxup', '_self');
		} else {
			alert("请选择未装箱的装箱单！");
		}
	}


</script>

<script>
function quxiao() {
		// 获取所有多选按钮
		var names = document.getElementsByName("id");
		var flag = false;//标记判断是否选中一个                 
		for (var i = 0; i < names.length; i++) {
			if (names[i].checked) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			alert("请最少选择一项！");
			return false;
		}
		//上报合同的个数
		var count = 0;
		for (var i = 0; i < names.length; i++) {
			if (names[i].checked) {
				var ns = names[i].nextElementSibling; //获得s的下一个兄弟节点
				
				alert(ns.value);
				if (ns.value == '1') {
					names[i].checked = true;
					count++;
				} else {
					names[i].checked = false;
				}
			}
		}
		if (count > 0) {
			formSubmit('${ctx}/cancel', '_self');
		} else {
			alert("请选择已装箱的装箱单！");
		}
	}
</script>


<script>
function shanchu() {
		// 获取所有多选按钮
		var names = document.getElementsByName("id");
		var flag = false;//标记判断是否选中一个                 
		for (var i = 0; i < names.length; i++) {
			if (names[i].checked) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			alert("请最少选择一项！");
			return false;
		}
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
			formSubmit('${ctx}/deletePakings', '_self');
		} else {
			alert("请选择未装箱的装箱单！");
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
							<li id="view"><a href="#" onclick="chakan();this.blur();">查看</a></li>
							<li id="update"><a href="#" onclick="xiugai();this.blur();">修改</a></li>
							<li id="delete"><a href="#" onclick="shanchu();this.blur();">删除</a></li>
							<li id="new"><a href="#" onclick="quxiao();this.blur();">取消</a></li>
							<li id="new"><a href="#" onclick="zhaungxiang();this.blur();">装箱</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<div class="textbox" id="centerTextbox">
			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">装箱列表</div>
				</div>
			</div>

			<div>

				<div class="eXtremeTable">
					<table id="ec_table" class="tableRegion" width="98%">
						<thead>
							<tr>
								<td class="tableHeader"><input type="checkbox" name="selid"
									onclick="checkAll('id',this)"></td>
								<td class="tableHeader">序号</td>
								<td class="tableHeader">卖家</td>
								<td class="tableHeader">买家</td>
								<td class="tableHeader">发票号</td>
								<td class="tableHeader">发票日期</td>
								<td class="tableHeader">状态</td>
							</tr>
						</thead>
						<tbody class="tableBody">

							<c:forEach items="${dataList}" var="o" varStatus="status">
								<tr class="odd" onmouseover="this.className='highlight'"
									onmouseout="this.className='odd'">
									<td><input type="checkbox" name="id"
										value="${o.packingListId}" /> <input type="hidden"
									value="${o.state}" name="status" /></td>
									<td>${status.index+1}</td>
									<td>${o.seller}</td>
									<td>${o.buyer}</td>
									<td>${o.invoiceNo}</td>
									<td><fmt:formatDate value="${o.invoiceDate}"
											pattern="yyyy-MM-dd" /></td>
									<td><c:if test="${o.state==1}">
											<font color="green">已装箱</font>
										</c:if> <c:if test="${o.state==0}">草稿</c:if></td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
				</div>

			</div>
	</form>
</body>
</html>

