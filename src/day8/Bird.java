package day8;

public class Bird extends Animal{
	
	public Bird() {
		super();
	}

	public Bird(String name, int age) {
		super(name, age);
	}
	
	//The type Bird must implement the inherited abstract
	//method Animal.showInfo()
	@Override
	public void showInfo(){
		System.out.println("Bird: name = " + name + ",age = " + age);
	}
}
