package day5;

public class Teacher extends Person{
	private double price;
	public Teacher(){
		
	}
	public Teacher(String name, int age, char sex, double price) {
		super(name, age, sex);
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void teach(){
		System.out.println("我会教学!");
	}
}
