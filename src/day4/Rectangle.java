package day4;

import java.text.DecimalFormat;
/**
 * ����һ��������  ���ܳ������
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
		System.out.println("���ε��ܳ���:" + df.format((length + width) * 2)); 
	}
	public void area(){
		System.out.println("���ε������:" +df.format(length * width));
	}
}
