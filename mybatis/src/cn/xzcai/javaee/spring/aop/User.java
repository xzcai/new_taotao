package cn.xzcai.javaee.spring.aop;

public class User {
	private Integer id;//±àºÅ
	private String name;//ÐÕÃû
	private Double sal;//Ð½Ë®
	public User(){}
	public User(Integer id, String name, Double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public User(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		System.out.println("getId()");
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		System.out.println("getName()");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSal() {
		System.out.println("getSal()");
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
}
