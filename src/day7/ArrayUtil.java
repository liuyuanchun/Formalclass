package day7;

public class ArrayUtil {
	public static int max(int[] array){
		int max = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] > max){
				max = array[i];
			}
		}
		return max;
	}
	public static int min(int[] array){
		int min = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] < min){
				min = array[i];
			}
		}
		return min;
	}
	public static void bubbleSort(int[] array){
		for(int i = 0; i < array.length - 1; i++){
			for(int j = 0; j <array.length - i - 1; j++){
				if(array[j] > array[j + 1]){
					/*int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;*/	
					swap(array,j,j + 1);//Ìí¼Óswap()º¯Êı
				}
			}
		}
	}
	public static void swap(int[] array,int x,int y){
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
	public static void print(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
