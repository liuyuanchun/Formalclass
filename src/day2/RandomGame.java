package day2;

import java.util.Scanner;

import org.junit.Test;

public class RandomGame {
	@Test
	public  void randomGame1() {
		int random = (int)(Math.random() * 1000 +1);
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("猜吧！");
			int num = scanner.nextInt();
			if(num == 0){
				System.out.println("欢迎下次再来！");
				return;
			}
			if(num > random){
				System.out.println("太大了");
			}else if(num < random ){
				System.out.println("太小了");
			} else{
				System.out.println("恭喜你，猜对了。");
				return;
			}
		}
	}
	@Test
	public  void randomGame2() {
		int random = (int)(Math.random() * 1000 +1);
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("猜吧！");
			int num = scanner.nextInt();
			if(num == 0){
				System.out.println("欢迎下次再来！");
				return;
			}
			if(num > random){
				System.out.println("太大了");
			}else if(num < random ){
				System.out.println("太小了");
			} else{
				System.out.println("恭喜你，猜对了。");
				return;
			}
		}while(true);
	}
}
