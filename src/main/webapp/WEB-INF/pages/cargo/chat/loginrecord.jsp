
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

	    var xData = function() {
	        var data = [];
	        for (var i = 1; i < 13; i++) {
	            data.push(i + "月份");
	        }
	        return data;
	    }();

	    option = {
	        backgroundColor: "#344b58",
	        "title": {
	            "text": "本年商场顾客男女人数统计",
	            "subtext": "BY Wang Dingding",
	            x: "4%",

	            textStyle: {
	                color: '#fff',
	                fontSize: '22'
	            },
	            subtextStyle: {
	                color: '#90979c',
	                fontSize: '16',

	            },
	        },
	        "tooltip": {
	            "trigger": "axis",
	            "axisPointer": {
	                "type": "shadow",
	                textStyle: {
	                    color: "#fff"
	                }

	            },
	        },
	        "grid": {
	            "borderWidth": 0,
	            "top": 110,
	            "bottom": 95,
	            textStyle: {
	                color: "#fff"
	            }
	        },
	        "legend": {
	            x: '4%',
	            top: '11%',
	            textStyle: {
	                color: '#90979c',
	            },
	            "data": ['女', '男', '平均']
	        },
	         

	        "calculable": true,
	        "xAxis": [{
	            "type": "category",
	            "axisLine": {
	                lineStyle: {
	                    color: '#90979c'
	                }
	            },
	            "splitLine": {
	                "show": false
	            },
	            "axisTick": {
	                "show": false
	            },
	            "splitArea": {
	                "show": false
	            },
	            "axisLabel": {
	                "interval": 0,

	            },
	            "data": xData,
	        }],
	        "yAxis": [{
	            "type": "value",
	            "splitLine": {
	                "show": false
	            },
	            "axisLine": {
	                lineStyle: {
	                    color: '#90979c'
	                }
	            },
	            "axisTick": {
	                "show": false
	            },
	            "axisLabel": {
	                "interval": 0,

	            },
	            "splitArea": {
	                "show": false
	            },

	        }],
	        "dataZoom": [{
	            "show": true,
	            "height": 30,
	            "xAxisIndex": [
	                0
	            ],
	            bottom: 30,
	            "start": 10,
	            "end": 80,
	            handleIcon: 'path://M306.1,413c0,2.2-1.8,4-4,4h-59.8c-2.2,0-4-1.8-4-4V200.8c0-2.2,1.8-4,4-4h59.8c2.2,0,4,1.8,4,4V413z',
	            handleSize: '110%',
	            handleStyle:{
	                color:"#d3dee5",
	                
	            },
	               textStyle:{
	                color:"#fff"},
	               borderColor:"#90979c"
	            
	            
	        }, {
	            "type": "inside",
	            "show": true,
	            "height": 15,
	            "start": 1,
	            "end": 35
	        }],
	        "series": [{
	                "name": "女",
	                "type": "bar",
	                "stack": "总量",
	                "barMaxWidth": 35,
	                "barGap": "10%",
	                "itemStyle": {
	                    "normal": {
	                        "color": "rgba(255,144,128,1)",
	                        "label": {
	                            "show": true,
	                            "textStyle": {
	                                "color": "#fff"
	                            },
	                            "position": "insideTop",
	                            formatter: function(p) {
	                                return p.value > 0 ? (p.value) : '';
	                            }
	                        }
	                    }
	                },
	                "data": [
	                    709,
	                    1917,
	                    2455,
	                    2610,
	                    1719,
	                    1433,
	                    1544,
	                    3285,
	                    5208,
	                    3372,
	                    2484,
	                    4078
	                ],
	            },

	            {
	                "name": "男",
	                "type": "bar",
	                "stack": "总量",
	                "itemStyle": {
	                    "normal": {
	                        "color": "rgba(0,191,183,1)",
	                        "barBorderRadius": 0,
	                        "label": {
	                            "show": true,
	                            "position": "top",
	                            formatter: function(p) {
	                                return p.value > 0 ? (p.value) : '';
	                            }
	                        }
	                    }
	                },
	                "data": [
	                    327,
	                    1776,
	                    507,
	                    1200,
	                    800,
	                    482,
	                    204,
	                    1390,
	                    1001,
	                    951,
	                    381,
	                    220
	                ]
	            }, {
	                "name": "总数",
	                "type": "line",
	                "stack": "总量",
	                symbolSize:10,
	                symbol:'circle',
	                "itemStyle": {
	                    "normal": {
	                        "color": "rgba(252,230,48,1)",
	                        "barBorderRadius": 0,
	                        "label": {
	                            "show": true,
	                            "position": "top",
	                            formatter: function(p) {
	                                return p.value > 0 ? (p.value) : '';
	                            }
	                        }
	                    }
	                },
	                "data": [
	                    1036,
	                    3693,
	                    2962,
	                    3810,
	                    2519,
	                    1915,
	                    1748,
	                    4675,
	                    6209,
	                    4323,
	                    2865,
	                    4298
	                ]
	            },
	        ]
	    }

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