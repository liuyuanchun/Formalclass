package day5;

public class PersonTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("С��");
		student.setAge(23);
		student.setSex('Ů');
		student.setGrade("1301");
		System.out.println("���ѧ����Ϣ:");
		System.out.println(student.getName() +" "+ student.getAge() + " " + student.getSex() + " " + student.getGrade());
		student.eat();
		student.study();
		Teacher tea = new Teacher();
		tea.setName("����");
		tea.setAge(42);
		tea.setSex('��');
		tea.setPrice(5000);
		System.out.println(tea.getName() + " " + tea.getAge() + " " + tea.getSex() + " " + tea.getPrice());

		tea.eat();
		tea.teach();
	}
}
