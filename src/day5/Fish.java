package day5;

public class Fish extends Animal{
	public Fish(){
		
	}
	public Fish(String name,String color){
		super(name,color);
	}
	public void paopao(){
		System.out.println(super.getColor() + "��ɫ��" + super.getName() + "���ڴ����ݡ�");
	}
}
