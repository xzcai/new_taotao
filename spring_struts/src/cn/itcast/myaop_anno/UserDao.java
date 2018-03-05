package cn.itcast.myaop_anno;

import org.springframework.stereotype.Component;

@Component
public class UserDao implements IUserDao {

	@Override
	public void save() {
		System.out.println("±£´æ.....");
	}
	
}
