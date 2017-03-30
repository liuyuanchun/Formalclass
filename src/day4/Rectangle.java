package day4;

import java.text.DecimalFormat;

public class Rectangle {
	private int length;
	private int width;
	DecimalFormat df = new DecimalFormat("0.00");
	public int getLength(){
		return length;
	} 
	public void setLength(int length){
		this.length = length;
	}
	public int getWidth(){
		return width;
	}
	public void setWidth(int width){
		this.width = width;
	} 
	public void perimeter(){
		System.out.println("矩形的周长是:" + df.format((length + width) * 2)); 
	}
	public void area(){
		System.out.println("矩形的面积是:" +df.format(length * width));
	}
}
