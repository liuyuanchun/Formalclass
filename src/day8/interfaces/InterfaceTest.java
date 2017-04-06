package day8.interfaces;

public class InterfaceTest {
	public static void main(String[] args) {
		AbstractBird bird = new Pigeon();
		bird.egg();
		System.out.println("-------------");
		IFly fly = new Pigeon();
		fly.fly();
		fly2(fly);
		fly = new Geese();
		fly2(fly);
		System.out.println("-------------");
		Pigeon pigeon = new Pigeon();
		fly2(pigeon);
	}
	public static void fly2(IFly fly1){
		fly1.fly();
	}
}
