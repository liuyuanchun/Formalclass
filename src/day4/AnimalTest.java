package day4;

public class AnimalTest {
	public static void main(String[] args) {
		Fish fish = new Fish();
		fish.setName("��Ī");
		fish.setColor("����ɫ");
		System.out.println("�ҽ�" + fish.getName() + "  ����" + fish.getColor() + "��");
		fish.move();
		fish.paopao();
		Dog dog = new Dog();
		dog.setName("Ī��");
		dog.setColor("��ɫ");
		System.out.println("�ҽ�" + dog.getName() + "  ����" + dog.getColor() + "��");
		dog.move();
		dog.bite();
	}
}
