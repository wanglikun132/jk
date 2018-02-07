
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
 <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts-gl/echarts-gl.min.js"></script>
<script type="text/javascript" src="${ctx }/js/dark.js"></script>
<script type="text/javascript">
	$(function() {
		var date = new Date();
		var year = date.getFullYear();
		yearZhe(year);
	})
	function yearZhe(year) {
			$.get("${ctx}/cargo/chat/getlogyear",{'year':year}, function(data) {
				// 基于准备好的dom，初始化echarts实例
				var myChart = echarts.init(document.getElementById('main'),'dark');
					
				var xValues = new Array();
				var yValues = new Array();
				for (var i = 0; i < data.length; i++) {
					xValues[i] = data[i].yearTime;
					yValues[i] = data[i].loginNumber;
				}
				
				// 指定图表的配置项和数据
				option = {
					title : {
						text : '年度流量统计',
						subtext : '纯属真实'
					},
					tooltip : {
						trigger : 'axis',
						axisPointer : {
							type : 'cross'
						}
					},
					toolbox : {
						show : true,
						feature : {
							saveAsImage : {}
						}
					},
					xAxis : {
						type : 'category',
						boundaryGap : false,
						data : xValues
					},
					yAxis : {
						type : 'value',
						axisLabel : {
							formatter : '{value} 次'
						},
						axisPointer : {
							snap : true
						}
					},
					visualMap : {
						show : false,
						dimension : 0,
						pieces : [ {
							lte : 6,
							color : 'red'
						}, {
							gt : 6,
							lte : 8,
							color : 'red'
						}, {
							gt : 8,
							lte : 14,
							color : 'red'
						}, {
							gt : 14,
							lte : 17,
							color : 'red'
						}, {
							gt : 17,
							color : 'red'
						} ]
					},
					series : [ {
						name : '访问量',
						type : 'line',
						smooth : true,
						data : yValues
						
					} ]
				};
				// 使用刚指定的配置项和数据显示图表。
				myChart.setOption(option);
			})
		}
</script>
</head>
<body>
<div>
<ul>
<c:forEach items="${yearlist }" var="o">
<a href="#" onclick="yearZhe(${o})">${o}</a>
</c:forEach>
</ul>
</div>

	<div class="textbox" id="centerTextbox">
		<div class="textbox-header">
			<div class="textbox-inner-header">
				<div class="textbox-title">登录峰值统计</div>
			</div>
		</div>
	</div>



	<!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
	<div id="main" style="width: 1000px; height: 400px;"></div>


</body>
</html>