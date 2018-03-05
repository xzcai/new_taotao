package cn.itcast.myaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	public static Object CreateProxy(Object target,Aop aop) {
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						aop.Begin();
						Object returnValue = method.invoke(target, args);
						aop.end();
						return returnValue;
					}
				});
	}
}
