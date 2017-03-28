package day2;

import org.junit.Test;

public class Multiplication {
	@Test
     public void test() {
    	int i = 9;
		while(i != 0){
			System.out.print((9 - i + 1) + "*9 = " + (i * 9) + "  ");
			i--;
		}
	}
	@Test
    public void test2() {
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}
