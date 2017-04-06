package day7.homework;

public  class Animal {
	protected String name;
	protected int age;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void showInfo(){
		System.out.println("name = " + name + " ,age = " + age);
	}
}
