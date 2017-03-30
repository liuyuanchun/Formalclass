package day4;

import java.text.DecimalFormat;

public class Circle {
	static double PI = 3.14;
	private int radius;
	DecimalFormat df = new DecimalFormat("0.00");
	public int getRadius(){
		return radius;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	public void perimeter(){
		System.out.println("Բ�ε��ܳ���:" + df.format(2 * PI * radius));
	}
	public void area(){
		System.out.println("Բ�ε������:" + df.format(PI * radius * radius));
	}
}
