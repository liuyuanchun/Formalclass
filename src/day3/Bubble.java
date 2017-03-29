package day3;

import java.util.Arrays;

public class Bubble {
	public static void main(String[] args) {
		int[] array = new int[]{45,87,32,12,901,3,4,6,5,9,54,78,21,31,51,41};
		long start = System.currentTimeMillis();
	//	Arrays.sort(array);
		sort(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + "  ");
		}
		System.out.println();
		long end = System.currentTimeMillis();
		long delta = end - start;
		System.out.println("delta = " + delta);
	}
	public static void sort(int[] array){
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length - 1 - i; j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j + 1];
					array[j+1] = temp;
				}
			}
		}
	}
}
