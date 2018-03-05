package cn.itcast.myaop_anno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect // ָ����ǰ��Ϊ������
public class Aop {
	
	@Before("execution(* cn.itcast.myaop_anno.UserDao.save(..))")
	public void Begin() {
		System.out.println("��ʼ....");
	}
	
	@After("execution(* cn.itcast.myaop_anno.UserDao.save(..))")
	public void end() {
		System.out.println("����....");
	}
}
                           