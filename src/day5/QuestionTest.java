package day5;

import java.util.Scanner;

public class QuestionTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SingleChoice single = new SingleChoice();
		String text = "��ʻ�������¶���ʱ������˵����ȷ���ǣ�";
		single.setText(text);
		System.out.println(single.getText());
		String answer = "��׼�յ���Ϩ��";
		single.setAnswerId(answer);
		String[] options = new String[]{"A.����Ϩ��","B.���Կյ�����׼Ϩ��","C.���Կյ�","D.��׼�յ���Ϩ��"};
		for(int i = 0; i < options.length; i++){
			System.out.println(options[i]);
		}
		System.out.println("��������Ҫѡ���ѡ��:");
		char type = scanner.next().charAt(0);
		switch(type){
		case 'A':
			if(single.getAnswerId().equals("����Ϩ��")){
				System.out.println("��ȷ��!");
			}else{
				System.out.println("�����!");
			}
			break;
		case 'B':
			if(single.getAnswerId().equals("���Կյ�����׼Ϩ��")){
				System.out.println("��ȷ��!");
			}else{
				System.out.println("�����!");
			}
			break;
		case 'C':
			if(single.getAnswerId().equals("���Կյ�")){
				System.out.println("��ȷ��!");
			}else{
				System.out.println("�����!");
			}
			break;
		case 'D':
			if(single.getAnswerId().equals("��׼�յ���Ϩ��")){
				System.out.println("��ȷ��!");
			}else{
				System.out.println("�����!");
			}
			break;
			default:
				System.out.println("������Ч��ѡ�");
		}
	}
}
