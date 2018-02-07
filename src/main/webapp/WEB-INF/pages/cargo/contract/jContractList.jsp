<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
<script type="text/javascript">
	function baoyun() {
		// 获取所有多选按钮
		var names = document.getElementsByName("id");
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
			formSubmit('${ctx}/submit', '_self')
		} else {
			alert("请选择已上报的合同！");
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
<script type="text/javascript">
function batch() {
	var names = document.getElementsByName("id");
	var flag = false;//标记判断是否选中一个                 
	for (var i = 0; i < names.length; i++) {
		if (names[i].checked) {
			flag = true;
			break;
		}
	}
	if (flag) {
		formSubmit('${ctx}/shangbao','_self');
	} else{
		alert("操作错误");
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
							 
							<li id="new"><a href="#" 
								onclick="formSubmit('${ctx }/cargo/contractproduct/tocreateproduct','_self');this.blur();">新增</a></li>
							
							<li id="new"><a href="#"
								onclick="batch();this.blur();">上报</a></li>
							<li id="print"><a href="#"
								onclick="formSubmit('${ctx}/cargo/extcproduct/exportExcel.action','_self');this.blur();">打印</a></li>
							<li id="new"><a href="#" onclick="baoyun();this.blur();">报运</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="textbox" id="centerTextbox">
			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">购销合同列表</div>
				</div>
			</div>
			</div>
			<div class="eXtremeTable">
				<table id="ec_table" class="tableRegion" width="98%">
					<thead>
						<tr>
							<td class="tableHeader"><input type="checkbox" name="selid"
								onclick="checkAll('id',this)"></td>
							<td class="tableHeader">序号</td>
							<td class="tableHeader">合同号</td>
							<td class="tableHeader">货物数/附件数</td>
							<td class="tableHeader">客户名称</td>
							<td class="tableHeader">交期</td>
							<td class="tableHeader">船期</td>
							<td class="tableHeader">签单日期</td>
							<td class="tableHeader">总金额</td>
							<td class="tableHeader">状态</td>
							<td class="tableHeader">操作</td>
						</tr>
					</thead>
					<tbody class="tableBody">

						<c:forEach items="${dataList}" var="o" varStatus="status">
							<tr class="odd" onmouseover="this.className='highlight'"
								onmouseout="this.className='odd'">
								<td><input type="checkbox" name="id"
									value="${o.contractId}" /> <input type="hidden"
									value="${o.state}" name="status" /></td>
								<td>${status.index+1}</td>
								<td><a
									href="${ctx}/cargo/contract/contractView.action?id=${o.contractId}">${o.contractNo}</a></td>
								<td>${o.cnumber}/${o.extnum}</td>
								<td>${o.customName}</td>
								<td><fmt:formatDate value="${o.deliveryPeriod}"
										pattern="yyyy-MM-dd" /></td>
								<td><fmt:formatDate value="${o.shipTime}"
										pattern="yyyy-MM-dd" /></td>
								<td><fmt:formatDate value="${o.signingDate}"
										pattern="yyyy-MM-dd" /></td>

								<td>${o.totalAmount}</td>
								<td><c:if test="${o.state==0}">
										<font color="gray">草稿</font>
									</c:if> <c:if test="${o.state==1}">
										<font color="green">已上报</font>
									</c:if></td>
								<td><a
									href="${ctx}/cargo/contractproduct/tocreate?contractId=${o.contractId}">[货物]</a>
									<a
									href="${ctx}/cargo/contract/contractView.action?id=${o.contractId}">查看</a>
									<a
									href="${ctx}/cargo/contract/toupdate.action?id=${o.contractId}">修改</a>
									
										<a href="${ctx}/cargo/contract/del.action?id=${o.contractId}"
											onclick="javascript:if(confirm('确定要删除此信息吗？')){alert('删除成功！');return true;}return false;">删除</a>
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

