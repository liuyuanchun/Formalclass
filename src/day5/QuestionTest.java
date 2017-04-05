package day5;

import java.util.Scanner;

public class QuestionTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SingleChoice single = new SingleChoice();
		String text = "驾驶机动车下陡坡时，以下说法正确的是？";
		single.setText(text);
		System.out.println(single.getText());
		String answer = "不准空挡或熄火";
		single.setAnswerId(answer);
		String[] options = new String[]{"A.可以熄火","B.可以空挡但不准熄火","C.可以空挡","D.不准空挡或熄火"};
		for(int i = 0; i < options.length; i++){
			System.out.println(options[i]);
		}
		System.out.println("请输入你要选择的选项:");
		char type = scanner.next().charAt(0);
		switch(type){
		case 'A':
			if(single.getAnswerId().equals("可以熄火")){
				System.out.println("正确答案!");
			}else{
				System.out.println("错误答案!");
			}
			break;
		case 'B':
			if(single.getAnswerId().equals("可以空挡但不准熄火")){
				System.out.println("正确答案!");
			}else{
				System.out.println("错误答案!");
			}
			break;
		case 'C':
			if(single.getAnswerId().equals("可以空挡")){
				System.out.println("正确答案!");
			}else{
				System.out.println("错误答案!");
			}
			break;
		case 'D':
			if(single.getAnswerId().equals("不准空挡或熄火")){
				System.out.println("正确答案!");
			}else{
				System.out.println("错误答案!");
			}
			break;
			default:
				System.out.println("输入无效的选项！");
		}
	}
}
