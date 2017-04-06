package day8.homework;

public class Student extends AbstractPerson{

	@Override
	public void showInfo() {
		System.out.println("Student: name = " + name + ",age = " + age);
	}
    public void study(){
    	System.out.println(name + "ÕıÔÚÑ§Ï°!");
    } 
}
