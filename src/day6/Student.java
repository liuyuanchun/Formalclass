package day6;

public class Student extends Person{
	String grade;
	public void show(){
		System.out.println(name + "的年龄是:" + age + "，班级是:" + grade);
	}
	public void study(){
		System.out.println("我会学习!");
	}
}
