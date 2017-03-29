package day3;

public class CountsForDigit {
	/**
	 * 求数组中0-9出现的次数
	 * @param args
	 */
	public static void main(String[] args) {
		int[] score = {0,7,6,7,4,3,7,8,7,4,5,2,1,5,9,0,9};
		int[] count = new int[10];
	/*	for(int i = 0; i < count.length; i++){
			count[i] = 0;
		}*/ 
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score.length; j++)
			if(score[j] == i){
				count[i]++;
			}
		}
		for(int i = 0; i < count.length; i++){
			System.out.println(i + "出现的次数是:" + count[i]);
		}
	}
}
