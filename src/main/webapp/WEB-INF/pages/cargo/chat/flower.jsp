
<%@ page language="java" pageEncoding="UTF-8"%>
    <%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${ctx }/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${ctx }/js/echarts.min.js"></script>

</head>

<body>
<div class="textbox" id="centerTextbox">
			<div class="textbox-header">
				<div class="textbox-inner-header">
					<div class="textbox-title">好看的花</div>
				</div>
			</div>
			</div>
 <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
  <div>
  <img alt="好看的玫瑰花" src="${ctx }/images/flower.png">
  </div>
</body>
</html>