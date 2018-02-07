<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../base.jsp"%>
<%@ include file="../../baselist.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
<script type="text/javascript" src="${ctx}/js/datepicker/WdatePicker.js"></script>
</head>
<body>
	<form method="post" action="${ctx }/toOutProductByDate">

		<div id="menubar">
			<div id="middleMenubar">
				<div id="innerMenubar">
					<div id="navMenubar">
						<ul>
							<li id="print"><a href="#"
								onclick="formSubmit('outProductPrint.action','_self');">打印</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<div class="textbox" id="centerTextbox">

			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">出货表月统计</div>
				</div>
			</div>
			<div>

				<div>

					<table class="commonTable" cellspacing="1">
						<tr>
							<td class="columnTitle_mustbe">船期：</td>
							<td class="tableContent"><input type="text" name="inputDate"
								style="width: 90px;" value="${inputDate }"
								onclick="WdatePicker({el:this,isShowOthers:true,dateFmt:'yyyy-MM'});"
								readonly /> 
								<input type="submit" value="确定"></td>
						</tr>
					</table>
				</div>
			</div>


			<div class="eXtremeTable">
				<table id="ec_table" class="tableRegion" width="98%" border="1">
					<thead>
						<tr>
							<td class="tableHeader">合同货物编号</td>
							<td class="tableHeader">客户名称</td>
							<td class="tableHeader">合同编号</td>
							<td class="tableHeader">交期</td>
							<td class="tableHeader">船期</td>
							<td class="tableHeader">贸易条款</td>
							<td class="tableHeader">工厂名字</td>
							<td class="tableHeader">货号</td>
							<td class="tableHeader">数量</td>
						</tr>
					</thead>
					<tbody class="tableBody">

						<c:forEach items="${dataList}" var="o" varStatus="status">
						
							<c:if test="${status.index%2==0 }">
								<tr class="odd" onmouseover="this.className='highlight'"
								onmouseout="this.className='odd'">
							</c:if>
								
							<c:if test="${status.index%2==1 }">
								<tr class="even" onmouseover="this.className='highlight'"
								onmouseout="this.className='even'">
							</c:if>
					
								<td>${o.contractproductid}</td>
								<td>${o.customname}</td>
								<td>${o.contractno}</td>
								<td> ${o.deliveryperiod}</td>
								<td> ${o.shiptime}</td>
								<td>${o.tradeterms}</td>
								<td>${o.factoryname}</td>
								<td>${o.productno}</td>
								<td>${o.cnumber}</td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>

		</div>

	</form>
</body>
</html>

