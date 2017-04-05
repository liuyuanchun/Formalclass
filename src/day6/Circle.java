package day6;

public class Circle extends Graphics{
	private static double PI = 3.14;
	private int radius;
	public Circle(){
		super();
	}
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public static double getPI() {
		return PI;
	}
	public static void setPI(double pI) {
		PI = pI;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void draw(){
		System.out.println("正在画圆形 , 半径是:" + radius);
	}
}
