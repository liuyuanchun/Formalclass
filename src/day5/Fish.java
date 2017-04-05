package day5;

public class Fish extends Animal{
	public Fish(){
		
	}
	public Fish(String name,String color){
		super(name,color);
	}
	public void paopao(){
		System.out.println(super.getColor() + "颜色的" + super.getName() + "正在吹泡泡。");
	}
}
