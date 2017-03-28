package day2;

import java.util.Scanner;

public class HomeWorkOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数组元素个数:");
		int num = scanner.nextInt();
		int[] array = new int[num];
		for(int i = 0; i < array.length; i++){
			System.out.println("请输入第" + ( i + 1) + "个元素:");
			array[i] = scanner.nextInt();
		}
		int max = max(array);
		System.out.println("数组中元素最大值是:" + max);
		int min =min(array);
		System.out.println("数组中元素最小值是:" + min);
		int sum =sum(array);
		System.out.println("数组中元素之和是:" + sum);
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
