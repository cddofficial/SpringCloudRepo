package com.cdd.demo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class PreZuulFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// 要用这个过滤器吗？用-true;不用-false
		return true;
	}

	// 实现业务逻辑
	@Override
	public Object run() throws ZuulException {
		 System.out.println("这里是PreFilter的run方法");
		return null;  // 一般情况这里都是返回null
	}

	@Override
	public String filterType() {
		// zuul过滤器的类型
		return "pre";
	}

	@Override
	public int filterOrder() {
		// 这个过滤器执行的顺序，数字越大越靠后
		return 2;
	}

}
