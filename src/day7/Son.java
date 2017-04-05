package day7;

public class Son extends Father{

	public Son() {
		super();
	}

	public Son(int num) {
		super(num);
	}

	public void display(){
		System.out.println(super.getNum());
	}
}
