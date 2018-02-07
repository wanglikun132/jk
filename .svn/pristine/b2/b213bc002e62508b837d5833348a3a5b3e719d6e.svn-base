
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
<script type="text/javascript">
	$(function() {
		$.get("${ctx}/cargo/chat/factoryRecord", function(data) {
			//横坐标,标题明称
			/* var titles = new Array();
			var numbers= new Array();
			for (var i = 0; i < data.length; i++) {
				titles[i]=data[i].factory_name;
				numbers[i]=data[i].countnum;
			} */

			// 基于准备好的dom，初始化echarts实例
			var myChart = echarts.init(document.getElementById('main'));

			data = [ [ "2000-06-05", 116 ], [ "2000-06-06", 129 ],
					[ "2000-06-07", 135 ], [ "2000-06-08", 86 ],
					[ "2000-06-09", 73 ], [ "2000-06-10", 85 ],
					[ "2000-06-11", 73 ], [ "2000-06-12", 68 ],
					[ "2000-06-13", 92 ], [ "2000-06-14", 130 ],
					[ "2000-06-15", 245 ], [ "2000-06-16", 139 ],
					[ "2000-06-17", 115 ], [ "2000-06-18", 111 ],
					[ "2000-06-19", 309 ], [ "2000-06-20", 206 ],
					[ "2000-06-21", 137 ], [ "2000-06-22", 128 ],
					[ "2000-06-23", 85 ], [ "2000-06-24", 94 ],
					[ "2000-06-25", 71 ], [ "2000-06-26", 106 ],
					[ "2000-06-27", 84 ], [ "2000-06-28", 93 ],
					[ "2000-06-29", 85 ], [ "2000-06-30", 73 ],
					[ "2000-07-01", 83 ], [ "2000-07-02", 125 ],
					[ "2000-07-03", 107 ], [ "2000-07-04", 82 ],
					[ "2000-07-05", 44 ], [ "2000-07-06", 72 ],
					[ "2000-07-07", 106 ], [ "2000-07-08", 107 ],
					[ "2000-07-09", 66 ], [ "2000-07-10", 91 ],
					[ "2000-07-11", 92 ], [ "2000-07-12", 113 ],
					[ "2000-07-13", 107 ], [ "2000-07-14", 131 ],
					[ "2000-07-15", 111 ], [ "2000-07-16", 64 ],
					[ "2000-07-17", 69 ], [ "2000-07-18", 88 ],
					[ "2000-07-19", 77 ], [ "2000-07-20", 83 ],
					[ "2000-07-21", 111 ], [ "2000-07-22", 57 ],
					[ "2000-07-23", 55 ], [ "2000-07-24", 60 ] ];

			var dateList = data.map(function(item) {
				return item[0];
			});
			var valueList = data.map(function(item) {
				return item[1];
			});
			// 指定图表的配置项和数据
			option = {

				// Make gradient line here
				visualMap : [ {
					show : false,
					type : 'continuous',
					seriesIndex : 0,
					min : 0,
					max : 400
				}, {
					show : false,
					type : 'continuous',
					seriesIndex : 1,
					dimension : 0,
					min : 0,
					max : dateList.length - 1
				} ],

				title : [ {
					left : 'center',
					text : 'Gradient along the y axis'
				}, {
					top : '55%',
					left : 'center',
					text : 'Gradient along the x axis'
				} ],
				tooltip : {
					trigger : 'axis'
				},
				xAxis : [ {
					data : dateList
				}, {
					data : dateList,
					gridIndex : 1
				} ],
				yAxis : [ {
					splitLine : {
						show : false
					}
				}, {
					splitLine : {
						show : false
					},
					gridIndex : 1
				} ],
				grid : [ {
					bottom : '60%'
				}, {
					top : '60%'
				} ],
				series : [ {
					type : 'line',
					showSymbol : false,
					data : valueList
				}, {
					type : 'line',
					showSymbol : false,
					data : valueList,
					xAxisIndex : 1,
					yAxisIndex : 1
				} ]
			};
			// 使用刚指定的配置项和数据显示图表。
			myChart.setOption(option);
		})
	})
</script>
</head>
<body>
	<div class="textbox" id="centerTextbox">
		<div class="textbox-header">
			<div class="textbox-inner-header">
				<div class="textbox-title">登录峰值统计</div>
			</div>
		</div>
	</div>

	<div>
		<table>
			<tr>
				<td class="columnTitle_mustbe">年份：</td>
				<td class="tableContentAuto"><select name="factoryId">
						<option value="">--请选择--</option>
						<c:forEach items="${yearlist}" var="f">
							<option value="${f}">${f}</option>
						</c:forEach>
				</select></td>
			</tr>
		</table>
	</div>

	<!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
	<div id="main" style="width: 1000px; height: 400px;"></div>


</body>
</html>