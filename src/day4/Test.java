package day4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		Circle circle = new Circle();
		System.out.println("������Բ�İ뾶:");
		int radius = scanner.nextInt();
		circle.setRadius(radius);
		circle.perimeter();
		circle.area();
		Rectangle rec = new Rectangle();
		System.out.println("��������εĳ���");
		int length = scanner.nextInt();
		rec.setLength(length);
		System.out.println("��������εĿ�ȣ�");
		int width = scanner.nextInt();
		rec.setWidth(width);
		rec.perimeter();
		rec.area();
	}
}
