package day7.calculator;

public class CalTest {
	public static void main(String[] args) {
		Cal cal1 = new Add(10,4);
		System.out.println("����֮��:" + cal1.getResult());
		Cal cal2 = new Sub(10,4);
		System.out.println("����֮��:" + cal2.getResult());
		Cal cal3 = new Multi(10,4);
		System.out.println("����֮�� :" + cal3.getResult());
		Cal cal4 = new Div(10,4);
		System.out.println("����֮��:" + cal4.getResult());
	}
}
