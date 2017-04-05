package day5;

public class Person {
	private String name;
	private int age;
	private char sex;
	public Person(){
		
	}
	public Person(String name,int age,char sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 15 && age < 45){
			this.age = age;
		}
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public void eat(){
		System.out.println("ÎÒ»á³Ô·¹!");
	}
}
