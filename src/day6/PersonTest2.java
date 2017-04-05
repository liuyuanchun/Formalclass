package day6;

import org.junit.Test;

public class PersonTest2 {
	public static void main(String[] args) {
		
		Student student = new Student();
		student.name = "张三";
		student.age = 18;
		Teacher teacher = new Teacher();
		teacher.name = "李四";
		teacher.age = 20;
		print(student);
		print(teacher);
	}
	public static void print(Person person){
		System.out.println(person.name + "的年龄是:" + person.age);
	}
}
