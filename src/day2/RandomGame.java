package day2;

import java.util.Scanner;

import org.junit.Test;

public class RandomGame {
	@Test
	public  void randomGame1() {
		int random = (int)(Math.random() * 1000 +1);
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("�°ɣ�");
			int num = scanner.nextInt();
			if(num == 0){
				System.out.println("��ӭ�´�������");
				return;
			}
			if(num > random){
				System.out.println("̫����");
			}else if(num < random ){
				System.out.println("̫С��");
			} else{
				System.out.println("��ϲ�㣬�¶��ˡ�");
				return;
			}
		}
	}
	@Test
	public  void randomGame2() {
		int random = (int)(Math.random() * 1000 +1);
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("�°ɣ�");
			int num = scanner.nextInt();
			if(num == 0){
				System.out.println("��ӭ�´�������");
				return;
			}
			if(num > random){
				System.out.println("̫����");
			}else if(num < random ){
				System.out.println("̫С��");
			} else{
				System.out.println("��ϲ�㣬�¶��ˡ�");
				return;
			}
		}while(true);
	}
}
