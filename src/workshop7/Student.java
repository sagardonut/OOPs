package workshop7;

public class Student {
	int stid;
	private String name;
	private int age;
	String course;
	
	public Student(int stid, String name,int age, String course) {
		this.stid = stid;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	public void SetAge(int age) {
		this.age = age;
	}
}
