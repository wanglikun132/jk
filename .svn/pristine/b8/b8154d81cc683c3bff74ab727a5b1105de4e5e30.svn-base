
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
	function createpie(name,value) {
		var obj =  new Object();
		obj.name = name;
		obj.value = value;
		return obj;	
	}
	
	$.get("${ctx}/cargo/chat/gettenproduct",function(data){
		
		 // 基于准备好的dom，初始化echarts实例
	    var myChart = echarts.init(document.getElementById('main'));
		 //定义参数,用来替换图表所需要的参数
		 //数组
	    var titles = new Array();
		var numbers= new Array();
		var pies= new Array();
		//对data进行便历,获取参数
		for (var i = 0; i < data.length; i++) {
			titles[i]=data[i].factory_name;
			numbers[i]=data[i].countnum;
		var	pie=createpie(data[i].factory_name,data[i].countnum);
			pies[i]=pie;
		}
		
		option = {
			    title: {
			        text: '货物销售量统计',
			        subtext: '虚构数据',
			        left: 'center'
			    },
			    tooltip : {
			        trigger: 'item',
			        formatter: "{a} <br/>{b} : {c} ({d}%)"
			    },
			    legend: {
			        // orient: 'vertical',
			        // top: 'middle',
			        bottom: 10,
			        left: 'center',
			        data: titles
			    },
			    series : [
			        {
			            type: 'pie',
			            radius : '65%',
			            center: ['50%', '50%'],
			            selectedMode: 'single',
			            data:pies,
			            itemStyle: {
			                emphasis: {
			                    shadowBlur: 10,
			                    shadowOffsetX: 0,
			                    shadowColor: 'rgba(0, 0, 0, 0.5)'
			                }
			            }
			        }
			    ]
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