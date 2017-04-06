package day7.homework;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Bird("尼莫",1);
		animal.showInfo();
		animal = new Dog("小河",3);
		animal.showInfo();
		
		animal= new Person("小刚", 20 ,'男');
		animal.showInfo();
		
		Person person1 = (Person)animal;
		person1.walk();
		
		Person person = new Person("小明",23,'女');
		person.showInfo();
		person.walk();
		person = new Student();
		Student s = (Student)person;
		s.name = "小刚";
		s.age = 20;
		s.setClassName("java1703");
		s.showInfo();
		s.study();
		s.walk();
	}
}
