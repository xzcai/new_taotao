package cn.itcast.jdbc;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	ApplicationContext ac = 
			new ClassPathXmlApplicationContext("cn/itcast/jdbc/bean.xml");

		@Test
		public void testApp() {
			
		}
}