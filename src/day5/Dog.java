package day5;

public class Dog extends Animal{
	private int legCount;
	public Dog(){
		super();
	}
	public Dog(String name,String color,int legCount){
		super(name,color);
		this.legCount = legCount;
	}
	
	public int getLegCount() {
		return legCount;
	}
	public void setLegCount(int legCount) {
		this.legCount = legCount;
	}
	public void bite(){
		System.out.println(super.getColor() + "µÄ" + super.getName() + "»áÒ§ÈË£¡");
	}
}
