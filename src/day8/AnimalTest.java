package day8;

public class AnimalTest {
	public static void main(String[] args) {
		//Cannot instantiate the type Animal
		//Animal animal = new Animal();
		Animal animal = new Student("ÕÅÈý", 23,'ÄÐ',"java1703");
		animal.showInfo();
		System.out.println("------------------");
		Student stu = (Student)animal;
		System.out.println(stu);
		stu.walk();
	}
}
