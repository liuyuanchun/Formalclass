package day7.homework;

public class Bird extends Animal{
	
	public Bird() {
		super();
	}

	public Bird(String name, int age) {
		super(name, age);
	}
	//与父类相同  可以不用写
	/*public void showInfo(){
		System.out.println("Bird: name = " + name + ",age = " + age);
	}*/
}
