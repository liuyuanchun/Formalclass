package day8.interfaces;

public class Bee extends AbstractInsect implements IFly{
	
	@Override
	public void spawn() {
		System.out.println("Bee spawn()");
	}

	@Override
	public void fly() {
		System.out.println("Bee fly()");		
	}
}
