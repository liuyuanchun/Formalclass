package day1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeWorkOfMarket {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner scanner = new Scanner(System.in);
		//结束符
		boolean isEnd = false;
		//商品数量
		int count = 0;
		//应付总价钱
		double sumMoney = 0;
		while(!isEnd ){
			count++;
			System.out.println("请输入第" + count + "件商品的信息");
			System.out.println("请输入单价：");
			double unitPrice = scanner.nextDouble();
			System.out.println("请输入数量：");
			double amount = scanner.nextDouble();
			double sum  = unitPrice * amount;
			sumMoney = sumMoney + sum;
			System.out.println("若是结束 请输0,若是继续，请输1");
			int endCount = scanner.nextInt();
			if(endCount == 0){
				isEnd  = true;
			}
		}
		System.out.println("商品一共有" + count + "件");
		if(sumMoney >= 500){
			sumMoney *= 0.8;
		}
		System.out.println("物品的总价钱是:" + df.format(sumMoney) + "元钱");
		System.out.println("请输入收款金额：");
		//收款金额
		double money = scanner.nextDouble();
		if(money >= sumMoney){
			System.out.println("物品的总价钱是:" + df.format(sumMoney) + "元钱");
			System.out.println("应找回顾客" + df.format(money - sumMoney) + "元钱");
		}else{
			System.out.println("付款金额少于应收金额");
		}
	}
}
