package cn.xzcai.javaee.mybaits.app01;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.xzcai.javaee.mybaits.util.MybatisUtil;
import sun.management.counter.Variability;

/**
 * �־ò� 
 * @author AdminTC
 */
public class StudentDao {
	/**
	 * ����ѧ��
	 */
	@Test
	public void add1() throws Exception{
		SqlSession sqlSession = null;
		try{
			sqlSession = MybatisUtil.getSqlSession();
			//����ʼ��Ĭ�ϣ�
			//��ȡStudentMapper.xmlӳ���ļ��е�SQL���
			int i = sqlSession.insert("cn.xzcai.javaee.mybaits.app01.Student.add1");
			System.out.println("���β���Ӱ����"+i+"��");
			//�����ύ
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			//����ع�
			sqlSession.rollback();
			throw e;
		}finally{
			MybatisUtil.closeSqlSession();
		}
	}
	/**
	 * ����ѧ��
	 */
	public void add2(Student student) throws Exception{
		SqlSession sqlSession = null;
		try{
			sqlSession = MybatisUtil.getSqlSession();
			//����ʼ��Ĭ�ϣ�
			//��ȡStudentMapper.xmlӳ���ļ��е�SQL���
			sqlSession.insert(Student.class.getName()+".add2",student);
			//�����ύ
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			//����ع�
			sqlSession.rollback();
			throw e;
		}finally{
			MybatisUtil.closeSqlSession();
		}
	}
	/**
	 * ����ѧ��
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
		dao.add2(new Student(2,"�Ǻ�",8000D));
		dao.add3(new Student(3,"����",9000D));
		dao.add3(new Student(4,"����",9000D));
	}
}