package cn.itcast.myaop;

import org.springframework.stereotype.Component;

@Component
public class Aop {
	public void Begin() {
		System.out.println("��ʼ....");
	}
	
	public void end() {
		System.out.println("����....");
	}
}
