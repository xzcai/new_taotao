package cn.itcast.tx;

import org.springframework.stereotype.Component;

@Component
public class DeptService {
	private DeptDao deptDao;
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao=deptDao;
	}
	
	public void save(Dept dept) {
		deptDao.save(dept);
		int n=10/0;
		deptDao.save(dept);
	}
}
