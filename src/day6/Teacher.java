package day6;

public class Teacher extends Person{
	double salary;
	public void show(){
		System.out.println(name + "的年龄是:" + age + ",薪资是:" + salary);
	}
	public void teach(){
		System.out.println("我会教学!");
	}
}
