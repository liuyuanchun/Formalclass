package day7.homework;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Bird("��Ī",1);
		animal.showInfo();
		animal = new Dog("С��",3);
		animal.showInfo();
		
		animal= new Person("С��", 20 ,'��');
		animal.showInfo();
		
		Person person1 = (Person)animal;
		person1.walk();
		
		Person person = new Person("С��",23,'Ů');
		person.showInfo();
		person.walk();
		person = new Student();
		Student s = (Student)person;
		s.name = "С��";
		s.age = 20;
		s.setClassName("java1703");
		s.showInfo();
		s.study();
		s.walk();
	}
}
