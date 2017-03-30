package day4;

public class AnimalTest {
	public static void main(String[] args) {
		Fish fish = new Fish();
		fish.setName("尼莫");
		fish.setColor("黄绿色");
		System.out.println("我叫" + fish.getName() + "  我是" + fish.getColor() + "的");
		fish.move();
		fish.paopao();
		Dog dog = new Dog();
		dog.setName("莫尼");
		dog.setColor("红色");
		System.out.println("我叫" + dog.getName() + "  我是" + dog.getColor() + "的");
		dog.move();
		dog.bite();
	}
}
