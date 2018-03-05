package cn.itcast.myaop_anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	ApplicationContext ac = 
			new ClassPathXmlApplicationContext("cn/itcast/myaop_anno/bean.xml");

		@Test
		public void testApp() {
			IUserDao userDao = (IUserDao) ac.getBean("userDao");
			System.out.println(userDao.getClass());
			userDao.save();
		}
}
