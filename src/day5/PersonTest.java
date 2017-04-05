package day5;

public class PersonTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("小明");
		student.setAge(23);
		student.setSex('女');
		student.setGrade("1301");
		System.out.println("输出学生信息:");
		System.out.println(student.getName() +" "+ student.getAge() + " " + student.getSex() + " " + student.getGrade());
		student.eat();
		student.study();
		Teacher tea = new Teacher();
		tea.setName("王明");
		tea.setAge(42);
		tea.setSex('男');
		tea.setPrice(5000);
		System.out.println(tea.getName() + " " + tea.getAge() + " " + tea.getSex() + " " + tea.getPrice());

		tea.eat();
		tea.teach();
	}
}
