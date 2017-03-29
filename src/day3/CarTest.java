package day3;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		car1.brand = "劳斯莱斯";
		car1.price = 8008000;
		car1.color = "银白色";
		car2.brand = "兰博基尼";
		car2.price = 6000000;
		car2.color = "黄色";
		car1.show();
		car2.show();
		car1.startup();
		car2.startup();
	}
}
