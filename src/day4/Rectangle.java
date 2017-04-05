package day4;

import java.text.DecimalFormat;
/**
 * 定义一个矩形类  求周长和面积
 * @author Administrator
 *
 */
public class Rectangle {
	private int length;
	private int width;
	public Rectangle(){
		
	}
	public Rectangle(int length,int width){
		this.length = length;
		this.width = width;
		
	}
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
