package day3;

public class OOPDemo {
	public static void main(String[] args) {
		String name = "zhangsan";
		int age = 20;
		char sex = '��';
		double salary = 1000.0;
		String email = "948549856@qq.com"; 
		Teacher teacher = new Teacher();
		teacher.name = "zhangsan";
		teacher.age = 20;
		teacher.sex = '��';
		teacher.salary = 1000.0;
		teacher.email = "948549856@qq.com"; 
		print(teacher);
	}
	public static void print(Teacher teacher){
		System.out.println("������" + teacher.name);
		System.out.println("���䣺" + teacher.age);
		System.out.println("�Ա�" + teacher.sex);
		System.out.println("н�ʣ�" + teacher.salary);
		System.out.println("���䣺" + teacher.email);
	}
}
