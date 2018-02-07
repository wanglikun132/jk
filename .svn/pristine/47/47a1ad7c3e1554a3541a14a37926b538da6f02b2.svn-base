package com.lanou.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014-3-6
 */
public class TimerInterceptor implements HandlerInterceptor {
	private NamedThreadLocal<Long> startTimeThreadLocal = new NamedThreadLocal<Long>("WatchExecuteTime");
	
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		long beginTime = System.currentTimeMillis();			//开始时间
		startTimeThreadLocal.set(beginTime);
		return true;
	}
	
	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object arg2, Exception arg3) throws Exception {
		long endTime = System.currentTimeMillis();
		long executeTime = endTime - startTimeThreadLocal.get();
		System.out.println(String.format("%s execute %d ms." , req.getRequestURI() , executeTime));
	}
	
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
	}
}

