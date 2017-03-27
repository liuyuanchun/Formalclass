package day1;

import java.util.Scanner;

public class Year {
 
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年数:");
		int year = scanner.nextInt();
		if((year / 4 == 0)&&(year % 100 != 0)
				||(year % 400 == 0)){
			System.out.println(year + "年是闰年");
		}else{
			System.out.println(year + "年不是闰年");
		}
		
	}
}
