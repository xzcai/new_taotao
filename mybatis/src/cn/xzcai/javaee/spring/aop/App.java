package cn.xzcai.javaee.spring.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("cn/xzcai/javaee/spring/aop/bean.xml");
	
	@Test
	public void Get() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("cn/xzcai/javaee/spring/aop/bean.xml");
		
		
		User user = (User)ac.getBean("user1");
		System.out.println(user);
		
		User user2 = (User)ac.getBean("user2");
		System.out.println(user2.getName());
	}
}
