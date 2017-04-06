package day8;

public class Dog extends Animal{

	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super(name, age);
	} 
	
	public void showInfo(){
		System.out.println("Dog: name = " + name + ",age = " + age);
	}
}
