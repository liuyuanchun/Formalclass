package day5;

import java.util.Scanner;

public class AnimalTest {
	public static void main(String[] args) {
		Dog dog = new Dog("С��","��ɫ",4);
		dog.move();
		dog.bite();
		Dog dog1 = new Dog();
		Scanner scanner = new Scanner(System.in);
		dog1.setName(scanner.next());
		dog1.setColor(scanner.next());
		dog1.setLegCount(4);
		dog1.move();
		dog1.bite();
		Fish fish = new Fish();
		System.out.println("�����������ɫ:");
		fish.setColor(scanner.next());
		System.out.println("�������������:");
		fish.setName(scanner.next());
		fish.move();
		fish.paopao();
	}
}
