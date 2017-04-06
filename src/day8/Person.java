package day8;

public abstract class  Person extends Animal{
	protected char sex;
	
	public Person() {
		super();
	}

	public Person(String name, int age,char sex) {
		super(name, age);
		this.sex = sex;
	}
	
	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

/*	public void showInfo(){
		System.out.println("Person: name = " + name + ",age = " + age + ",sex = " + sex);
	}*/
	public void walk(){
		System.out.println(name + "可以直立行走!");
	}

	
	
}
