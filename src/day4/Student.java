package day4;

public class Student {
	private String name;
	private int age;
	private char sex;
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
		}else{
			this.age = 20;
		}
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		if(sex == 'ÄĞ' || sex == 'Å®'){
			this.sex = sex;
		}else{
			this.sex = 'ÄĞ';
		}
	}
	
}
