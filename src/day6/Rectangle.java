package day6;

public class Rectangle extends Graphics{
	private int length;
	private int width;
	public Rectangle(){
		super();
	}
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void draw(){
		System.out.println("正在画长方形,长度为：" + length + ",宽度为:" + width);
	}
}
