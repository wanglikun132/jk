
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
$(function () {
	$.get("${ctx}/cargo/chat/factoryRecord",function(data){
		//横坐标,标题明称
		var titles = new Array();
		var numbers= new Array();
		for (var i = 0; i < data.length; i++) {
			titles[i]=data[i].factory_name;
			numbers[i]=data[i].countnum;
		}
		
		 // 基于准备好的dom，初始化echarts实例
	    var myChart = echarts.init(document.getElementById('main'));

	    // 指定图表的配置项和数据
	    var option = {
	        title: {
	            text: '厂家销售记录'
	        },
	        tooltip: {},
	        legend: {
	            data:['厂家名称']
	        },
	        xAxis: {
	            data: titles
	        },
	        yAxis: {},
	        series: [{
	            name: '销量',
	            type: 'bar',
	            data: numbers
	        }]
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
					<div class="textbox-title">厂家销售记录</div>
				</div>
			</div>
			</div>
		
    <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
    <div id="main" style="width: 1000px;height:400px;"></div>

			
</body>
</html>