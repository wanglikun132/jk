
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
	$.get("${ctx}/cargo/chat/star",function(data){
		
		 // 基于准备好的dom，初始化echarts实例
	    var myChart = echarts.init(document.getElementById('main'));
		 //定义参数,用来替换图表所需要的参数
		 //数组
	    var titles = new Array();
		var numbers= new Array();
		//对data进行便历,获取参数
		for (var i = 0; i < data.length; i++) {
			titles[i]=data[i].factory_name;
			numbers[i]=data[i].countnum;
		}
		
		var data = [];
		var n = 8;
		var r = 150;
		var rAmplitude = 20;
		var cnt = 160;
		for (var i = 0; i <= cnt; ++i) {
		    var r2 = r + rAmplitude * Math.sin(Math.PI / cnt * n * i * 2);
		    data.push([r2, 360 / cnt * i]);
		}

		option = {
		    title: {
		        text: 'Star'
		    },
		    polar: {},
		    tooltip: {
		        trigger: 'item'
		    },
		    angleAxis: {
		        type: 'value',
		        show: false
		    },
		    radiusAxis: {
		        show: false,
		        max: 225
		    },
		    series: [{
		        coordinateSystem: 'polar',
		        name: 'line',
		        type: 'line',
		        data: data,
		        symbolSize: 0,
		        symbol: 'circle',
		        areaStyle: {
		            normal: {
		                color: new echarts.graphic.RadialGradient(0.5, 0.5, 1, [{
		                    offset: 0.1,
		                    color: 'rgba(255, 0, 0, 0.5)'
		                }, {
		                    offset: 1,
		                    color: 'rgba(255, 255, 0, 0)'
		                }], false)
		            }
		        },
		        lineStyle: {
		            normal: {
		                color: '#C25353',
		                width: 1
		            }
		        }
		    }],
		    animation: false
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
					<div class="textbox-title">好看的星</div>
				</div>
			</div>
			</div>
 <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
  <div id="main" style="width: 1000px;height:400px;"></div>
</body>
</html>