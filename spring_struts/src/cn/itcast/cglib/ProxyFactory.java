package cn.itcast.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor {
	private Object target;
	
	public ProxyFactory(Object target) {
		this.target=target;
	}
	
	public Object getProxyInstance() {
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("开始事物");
		Object returnValue =  method.invoke(target, args);
		System.out.println("结束事物");
		return returnValue; 
	}

}
