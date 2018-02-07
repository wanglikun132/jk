<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
	<script type="text/javascript" src="${ctx}/js/datepicker/WdatePicker.js"></script>
</head>
<body>
<form method="post">
	<input type="text" name="contractProductId" value="${contractProductId}"> 

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
    <div id="navMenubar">
<ul>
<li id="save"><a href="#" onclick="formSubmit('${ctx}/addExtcproduct','_self');">确定</a></li>
<li id="back"><a href="${ctx}/list">返回</a></li>
</ul>
    </div>
</div>
</div>
</div>
     
<div class="textbox" id="centerTextbox">
    
    <div class="textbox-header">
    <div class="textbox-inner-header">
    <div class="textbox-title">
		新增附件信息
    </div> 
    </div>
    </div>
<div>
    <div>
		<table class="commonTable" cellspacing="1">
	        <tr>
	            <td class="columnTitle_mustbe">生产厂家：</td>
	            <td class="tableContentAuto">
	            	<select name="factoryId">
	            		<option value="">--请选择--</option>
	            		<c:forEach items="${factoryList}" var="f">
	            			<option value="${f.factoryId}">${f.factoryName}</option>
	            		</c:forEach>
	            	</select>
	            </td>
	        </tr>
	        <tr>
	            <td class="columnTitle_mustbe">货号：</td>
	            <td class="tableContent"><input type="text" name="productNo"/></td>
	            <td class="columnTitle_mustbe">数量：</td>
	            <td class="tableContent"><input type="text" name="cnumber"/></td>	        
	        </tr>
	        <tr>
	            <td class="columnTitle_mustbe">包装单位：</td>
	            <td class="tableContentAuto">
	            	<input type="radio" name="packingUnit" value="PCS" class="input" checked>只
	            	<input type="radio" name="packingUnit" value="SETS" class="input">套
	            </td>	            
	            <td class="columnTitle_mustbe">单价：</td>
	            <td class="tableContent"><input type="text" name="price"/></td>
	        </tr>
	        <tr>
	            <td class="columnTitle_mustbe">货物描述：</td>
	            <td class="tableContent"><textarea name="productDesc" style="height:120px;"></textarea></td>
	        </tr>
		</table>
	</div>
	
    <div class="textbox-header">
    <div class="textbox-inner-header">
    <div class="textbox-title">
		附件信息列表
    </div> 
    </div>
    </div>
    
    
	<div class="eXtremeTable" >
	<table id="ec_table" class="tableRegion" width="98%" >
		<thead>
		<tr>
			<td class="tableHeader"><input type="checkbox" name="selid" onclick="checkAll('id',this)"></td>
			<td class="tableHeader">序号</td>
			<td class="tableHeader">厂家</td>
			<td class="tableHeader">货号</td>
			<td class="tableHeader" width="200">货物描述</td>
			<td class="tableHeader">数量</td>
			<td class="tableHeader">包装单位</td>
			<td class="tableHeader">单价</td>
			<td class="tableHeader">总金额</td>
			<td class="tableHeader">操作</td>
		</tr>
		</thead>
		<tbody class="tableBody" >
		
		<c:forEach items="${dataList}" var="o" varStatus="status">
		<tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'" >
			<td><input type="checkbox" name="extCproductId" value="${o.extCproductId}"/></td>
			<td>${status.index+1}</td>
			<td>${o.factoryName}</td>
			<td>${o.productNo}</td>
			<td width="200">${o.productDesc}</td>
			<td>${o.cnumber}</td>
			<td>${o.packingUnit}</td>
			<td>${o.price}</td>
			<td>${o.amount}</td>
			<td>
				<a href="${ctx}/cargo/contract/toupdatepe.action?id=${o.extCproductId}">[修改]</a>
				<a href="javascript:if(confirm('确实要删除吗?')) location='deleteProduct.action?id=${o.extCproductId}&contractProductId=${contractProductId}'">[删除]</a>
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

