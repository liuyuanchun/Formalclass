package day7;

public class NumberTest {
	public static void main(String[] args) {
		Number num = new Number(10,5);
		System.out.println(num.getNum1() + "+" + num.getNum2() + "=" + num.add());
		System.out.println(num.getNum1() + "-" + num.getNum2() + "=" + num.sub());
		System.out.println(num.getNum1() + "*" + num.getNum2() + "=" + num.multi());
		System.out.println(num.getNum1() + "/" + num.getNum2() + "=" + num.div());
		System.out.println("----------------");
		int max = Math.max(3,5);
		System.out.println(max);
		System.out.println("----------------");
		System.out.println(NumberStatic.add(1, 2));
	}
}
