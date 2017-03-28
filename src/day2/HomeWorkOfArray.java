package day2;

import java.util.Scanner;

public class HomeWorkOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������Ԫ�ظ���:");
		int num = scanner.nextInt();
		int[] array = new int[num];
		for(int i = 0; i < array.length; i++){
			System.out.println("�������" + ( i + 1) + "��Ԫ��:");
			array[i] = scanner.nextInt();
		}
		int max = max(array);
		System.out.println("������Ԫ�����ֵ��:" + max);
		int min =min(array);
		System.out.println("������Ԫ����Сֵ��:" + min);
		int sum =sum(array);
		System.out.println("������Ԫ��֮����:" + sum);
	}
	public static int max(int[] array){
		int max = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i]  > max){
				max = array[i];
			}
		}
		return max;
		
	} 
	public static int min(int[] array){
		int min = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i]  < min){
				min = array[i];
			}
		}
		return min;
	} 
	public static int sum(int[] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		return sum;
	} 
}
