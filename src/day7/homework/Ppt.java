package day7.homework;

public class Ppt extends Office{
	
	public Ppt() {
		super();
	}

	public Ppt(String data) {
		super(data);
	}

	public void start(){
		System.out.println("Ppt正在打开，打开的数据是:" +data);
	}
}
