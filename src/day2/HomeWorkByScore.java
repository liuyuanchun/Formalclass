package day2;

import java.util.Scanner;

public class HomeWorkByScore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ���ĳɼ�:");
		int score = scanner.nextInt();
		if(score < 0 || score > 100){
			System.out.println("�������Υ���ĳɼ�!");
			return;
		}
		int grade = score / 10;
		switch (grade) {
		case 10:
		case 9:
			System.out.println("�ɼ�����");
			break;
		case 8:
			System.out.println("�ɼ�����");
			break;
		case 7:
			System.out.println("�ɼ�һ��");
			break;
		case 6:
			System.out.println("�ɼ�����");
			break;
		default:
			System.out.println("�ɼ�������");
			break;
		}
	}
}
