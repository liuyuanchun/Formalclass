package day1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeWorkOfMarket {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner scanner = new Scanner(System.in);
		//������
		boolean isEnd = false;
		//��Ʒ����
		int count = 0;
		//Ӧ���ܼ�Ǯ
		double sumMoney = 0;
		while(!isEnd ){
			count++;
			System.out.println("�������" + count + "����Ʒ����Ϣ");
			System.out.println("�����뵥�ۣ�");
			double unitPrice = scanner.nextDouble();
			System.out.println("������������");
			double amount = scanner.nextDouble();
			double sum  = unitPrice * amount;
			sumMoney = sumMoney + sum;
			System.out.println("���ǽ��� ����0,���Ǽ���������1");
			int endCount = scanner.nextInt();
			if(endCount == 0){
				isEnd  = true;
			}
		}
		System.out.println("��Ʒһ����" + count + "��");
		if(sumMoney >= 500){
			sumMoney *= 0.8;
		}
		System.out.println("��Ʒ���ܼ�Ǯ��:" + df.format(sumMoney) + "ԪǮ");
		System.out.println("�������տ��");
		//�տ���
		double money = scanner.nextDouble();
		if(money >= sumMoney){
			System.out.println("��Ʒ���ܼ�Ǯ��:" + df.format(sumMoney) + "ԪǮ");
			System.out.println("Ӧ�һع˿�" + df.format(money - sumMoney) + "ԪǮ");
		}else{
			System.out.println("����������Ӧ�ս��");
		}
	}
}
