package day8.homework;

public class Test {
	public static void main(String[] args) {
		AbstractPerson person = new NormalStudent();
		person.name = "С��";
		person.age = 20;
		person.showInfo();
		NormalStudent stu1 = (NormalStudent)person;
		stu1.study();
		System.out.println("-----------------------");
		person = new SmokingStudent();
		person.name = "С��";
		person.age = 23;
		person.showInfo();
		SmokingStudent stu = (SmokingStudent)person;
		stu.smoke();
		stu.study();
		System.out.println("-----------------------");
		person = new SmokingBikingTeacher();
		person.name = "С��";
		person.age = 25;
		person.showInfo();
		SmokingBikingTeacher sbteacher = (SmokingBikingTeacher)person;
		sbteacher.teacher();
		sbteacher.bike();
		sbteacher.smoke();
		System.out.println("-----------------------");
		
	}
}
