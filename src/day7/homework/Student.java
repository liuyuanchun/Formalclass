package day7.homework;

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
	//���Բ�����
/*	public void showInfo(){
		System.out.println("Student: name = " + name + ",age = " + age + ",className = " + className );
	}*/
	public void study(){
		System.out.println(name + "����ѧϰ!");
	}
}
