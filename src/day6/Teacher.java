package day6;

public class Teacher extends Person{
	double salary;
	public void show(){
		System.out.println(name + "��������:" + age + ",н����:" + salary);
	}
	public void teach(){
		System.out.println("�һ��ѧ!");
	}
}
