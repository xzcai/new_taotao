package cn.xzcai.javaee.mybaits.app01;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.xzcai.javaee.mybaits.util.MybatisUtil;
import sun.management.counter.Variability;

/**
 * 持久层 
 * @author AdminTC
 */
public class StudentDao {
	/**
	 * 增加学生
	 */
	@Test
	public void add1() throws Exception{
		SqlSession sqlSession = null;
		try{
			sqlSession = MybatisUtil.getSqlSession();
			//事务开始（默认）
			//读取StudentMapper.xml映射文件中的SQL语句
			int i = sqlSession.insert("cn.xzcai.javaee.mybaits.app01.Student.add1");
			System.out.println("本次操作影响了"+i+"行");
			//事务提交
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			//事务回滚
			sqlSession.rollback();
			throw e;
		}finally{
			MybatisUtil.closeSqlSession();
		}
	}
	/**
	 * 增加学生
	 */
	public void add2(Student student) throws Exception{
		SqlSession sqlSession = null;
		try{
			sqlSession = MybatisUtil.getSqlSession();
			//事务开始（默认）
			//读取StudentMapper.xml映射文件中的SQL语句
			sqlSession.insert(Student.class.getName()+".add2",student);
			//事务提交
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			//事务回滚
			sqlSession.rollback();
			throw e;
		}finally{
			MybatisUtil.closeSqlSession();
		}
	}
	/**
	 * 增加学生
	 */
	public void add3(Student student) throws Exception{
		SqlSession sqlSession = null;
		try{
			sqlSession = MybatisUtil.getSqlSession();
			sqlSession.insert(Student.class.getName()+".add3",student);
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			throw e;
		}finally{
			MybatisUtil.closeSqlSession();
		}
	}
	
	public Student selectOne(int id)throws Exception {
		SqlSession sqlSession=null;
		try {
			sqlSession=MybatisUtil.getSqlSession();
			return sqlSession.selectOne(Student.class.getName()+".selectOne",id);
		}catch(Exception e){
			e.printStackTrace();
			sqlSession.rollback();
			throw e;
		}finally{
			MybatisUtil.closeSqlSession();
		}
	}
	
	
	
	@Test
	public void name() {
		System.out.println("123456");
	}
	
	
	
	
	
	public static void main(String[] args) throws Exception{
		System.out.println(System.getProperty("java.classpath"));
		StudentDao dao = new StudentDao();
		//dao.add1();
		Student student = dao.selectOne(1);
		dao.add2(new Student(2,"呵呵",8000D));
		dao.add3(new Student(3,"嘻嘻",9000D));
		dao.add3(new Student(4,"笨笨",9000D));
	}
}