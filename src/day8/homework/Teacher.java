package day8.homework;

public class Teacher extends AbstractPerson{

	@Override
	public void showInfo() {
		System.out.println("Teacher: name = " + name +",age = " + age);
	}
	public void teacher(){
		System.out.println(name + "正在教学!");
	}
}
