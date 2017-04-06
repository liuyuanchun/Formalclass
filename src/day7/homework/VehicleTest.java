package day7.homework;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setSpeed(60);
		vehicle.setSize(300);
		vehicle.move();
		vehicle.speedup();
		System.out.println("加速后的速度:" + vehicle.getSpeed());
		vehicle.speeddown();
		System.out.println("减速后的速度:" + vehicle.getSpeed());
	}
}
