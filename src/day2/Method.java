package day2;

import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int max1 = getMax1(num1,num2);
		System.out.println("(方法1)最大值为:" + max1);
		int max2 = getMax2(num1,num2);
		System.out.println("(方法2)最大值为:" + max2);
	}
	public static int getMax1(int num1,int num2){
		int max = num1 > num2?num1:num2;
		return max;
	}
	public static int getMax2(int num1,int num2){
		int max;
		if(num1 > num2){
			max = num1;
		}else{
			max = num2;
		}
		return max;
	}
}
