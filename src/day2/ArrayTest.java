package day2;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ԫ�ظ���:");
		int num = scanner.nextInt();
		int[] array = new int[num];
		for(int i = 0; i < array.length; i++){
			System.out.println("�������" + (i + 1) + "��Ԫ��");
			array[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < array.length/2; i++){
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]);
		}
	}
}
