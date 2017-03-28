package day2;

import java.util.Scanner;

public class Days {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������:");
		int year = scanner.nextInt();
		System.out.println("�������·�:");
		int month = scanner.nextInt();
		if(month < 1 || month > 12){
			System.out.println("������·���Ч!");
			return;
		}
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("����Ϊ31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("����Ϊ30��");
			break;
		case 2:
			if(((year % 4 == 0) && (year % 100 != 0))
					||(year % 400 == 0)){
				System.out.println("����Ϊ29��");
			}else{
				System.out.println("����Ϊ28��");
			}
			break;
		default:System.out.println("default");
				break;
		}
	}

}
