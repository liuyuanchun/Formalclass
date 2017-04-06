package day8;

public class Student extends Person{
	private String className;
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Student() {
		super();
	}

	public Student(String name, int age,char sex,String className) {
		super(name, age,sex);
		this.className = className;
	}
	//可以不覆盖
/*	public void showInfo(){
		System.out.println("Student: name = " + name + ",age = " + age + ",className = " + className );
	}*/
	public void showInfo(){
		System.out.println("Student: name = " + name + ",age = " + age + ",sex = " + sex + ",className = " + className );
	}
	public void study(){
		System.out.println(name + "正在学习!");
	}
	@Override
	public String toString() {
		return "Student [sex=" + sex + ", name=" + name + ", age=" + age + ",className=" + className +"]";
	}
}
