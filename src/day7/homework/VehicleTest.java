package day7.homework;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setSpeed(60);
		vehicle.setSize(300);
		vehicle.move();
		vehicle.speedup();
		System.out.println("���ٺ���ٶ�:" + vehicle.getSpeed());
		vehicle.speeddown();
		System.out.println("���ٺ���ٶ�:" + vehicle.getSpeed());
	}
}
