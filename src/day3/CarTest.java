package day3;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		car1.brand = "��˹��˹";
		car1.price = 8008000;
		car1.color = "����ɫ";
		car2.brand = "��������";
		car2.price = 6000000;
		car2.color = "��ɫ";
		car1.show();
		car2.show();
		car1.startup();
		car2.startup();
	}
}
