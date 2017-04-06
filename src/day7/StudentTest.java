package day7;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student("zhangsan",23,"Å®");
		System.out.println(student);
		System.out.println(student.getCountry());
		Student student1 = new Student("lisi",25,"ÄĞ");
		System.out.println(student1);
		System.out.println(student1.getCountry());
		System.out.println("-------------------");
		System.out.println(Student.getCountry());
		student1.setCountry("US");
		System.out.println(Student.getCountry());
	}
}
