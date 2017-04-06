package day8.interfaces;

public class Geese extends AbstractBird implements IFly{

	@Override
	public void egg() {
		// TODO Auto-generated method stub
		System.out.println("Geese egg()");
	}

	@Override
	public void fly() {
		System.out.println("Geese fly()");
		
	}
	
}
