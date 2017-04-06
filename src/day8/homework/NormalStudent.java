package day8.homework;

public class NormalStudent extends Student{
	public void showInfo(){
		super.showInfo();
		System.out.println(name + "是正常学生!");
	}
}
