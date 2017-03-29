package day3;

public class OOPDemo {
	public static void main(String[] args) {
		String name = "zhangsan";
		int age = 20;
		char sex = '男';
		double salary = 1000.0;
		String email = "948549856@qq.com"; 
		Teacher teacher = new Teacher();
		teacher.name = "zhangsan";
		teacher.age = 20;
		teacher.sex = '男';
		teacher.salary = 1000.0;
		teacher.email = "948549856@qq.com"; 
		print(teacher);
	}
	public static void print(Teacher teacher){
		System.out.println("姓名：" + teacher.name);
		System.out.println("年龄：" + teacher.age);
		System.out.println("性别：" + teacher.sex);
		System.out.println("薪资：" + teacher.salary);
		System.out.println("邮箱：" + teacher.email);
	}
}
