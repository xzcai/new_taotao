package cn.itcast.tx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	@Test
	public void testApp() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("cn/itcast/tx/bean.xml");
		
		Dept dept =new Dept();
		dept.setDeptName("²âÊÔ£º¿ª·¢²¿");
		
		
		DeptService deptService=(DeptService)ac.getBean("deptService");
		deptService.save(dept);
	}
}
