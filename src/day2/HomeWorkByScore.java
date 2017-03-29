package day2;

import java.util.Scanner;

public class HomeWorkByScore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生的成绩:");
		int score = scanner.nextInt();
		if(score < 0 || score > 100){
			System.out.println("输入的是违法的成绩!");
			return;
		}
		int grade = score / 10;
		switch (grade) {
		case 10:
		case 9:
			System.out.println("成绩优秀");
			break;
		case 8:
			System.out.println("成绩良好");
			break;
		case 7:
			System.out.println("成绩一般");
			break;
		case 6:
			System.out.println("成绩及格");
			break;
		default:
			System.out.println("成绩不及格");
			break;
		}
	}
}
