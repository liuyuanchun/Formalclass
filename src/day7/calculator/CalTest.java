package day7.calculator;

public class CalTest {
	public static void main(String[] args) {
		Cal cal1 = new Add(10,4);
		System.out.println("两数之和:" + cal1.getResult());
		Cal cal2 = new Sub(10,4);
		System.out.println("两数之差:" + cal2.getResult());
		Cal cal3 = new Multi(10,4);
		System.out.println("两数之积 :" + cal3.getResult());
		Cal cal4 = new Div(10,4);
		System.out.println("两数之商:" + cal4.getResult());
	}
}
