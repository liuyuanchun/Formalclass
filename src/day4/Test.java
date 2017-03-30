package day4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		Circle circle = new Circle();
		System.out.println("请输入圆的半径:");
		int radius = scanner.nextInt();
		circle.setRadius(radius);
		circle.perimeter();
		circle.area();
		Rectangle rec = new Rectangle();
		System.out.println("请输入矩形的长：");
		int length = scanner.nextInt();
		rec.setLength(length);
		System.out.println("请输入矩形的宽度：");
		int width = scanner.nextInt();
		rec.setWidth(width);
		rec.perimeter();
		rec.area();
	}
}
