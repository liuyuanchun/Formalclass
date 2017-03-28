package day1;

import java.util.Scanner;

public class Digit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数字:");
		int num = scanner.nextInt();
		int hundred = num /100;
		int decade = num % 100 / 10; 
		//int decade = (num - hundred * 100) / 10;
		int unit = num % 10;
		System.out.println("百位是:" + hundred);
		System.out.println("十位是" + decade);
		System.out.println("个位是" + unit);
	}
}
