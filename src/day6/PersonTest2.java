package day6;

import org.junit.Test;

public class PersonTest2 {
	public static void main(String[] args) {
		
		Student student = new Student();
		student.name = "����";
		student.age = 18;
		Teacher teacher = new Teacher();
		teacher.name = "����";
		teacher.age = 20;
		print(student);
		print(teacher);
	}
	public static void print(Person person){
		System.out.println(person.name + "��������:" + person.age);
	}
}
