package day7.homework;

public class Vehicle {
	private int speed;
	private int size;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void move(){
		System.out.println("车正在以" + speed + "速度行驶");
	}
	public void speedup(){
		speed = speed + 10;
	}
	public void speeddown(){
		speed = speed - 20;
	}
	
}
