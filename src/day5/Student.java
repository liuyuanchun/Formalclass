package day5;

public class Student extends Person{
	private String grade;
	
	public Student(){
		
	}
	public Student(String name,int age,char sex,String grade){
		super(name,age,sex);
		this.grade = grade;
	}
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void study(){
		System.out.println("�һ�ѧϰ!");
	}
}
