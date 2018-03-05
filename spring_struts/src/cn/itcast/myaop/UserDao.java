package cn.itcast.myaop;

import org.springframework.stereotype.Component;

@Component
public class UserDao implements IUserDao {

	@Override
	public void save() {
		System.out.println("±£´æ.....");
	}
	
}
