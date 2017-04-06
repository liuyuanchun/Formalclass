package day8.interfaces;

public class Pigeon extends AbstractBird implements IFly{

	@Override
	public void egg() {
		System.out.println("pigeon egg()");
	}

	@Override
	public void fly() {
		System.out.println("pigeon fly()");
		
	}
	
}
