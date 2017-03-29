package day3;

import java.util.Scanner;

public class StudentTest {
	private Scanner scanner = new Scanner(System.in);
	private Student[] student;
	public void initStudent(){
		System.out.println("请输入学生个数 ：");
		int num = scanner.nextInt();
		student = new Student[num];
		for(int i = 0; i < student.length; i++){
			Student stu = new Student();
			System.out.println("请输入第" + (i+1) + "个同学的姓名:");
			stu.name = scanner.next();
			System.out.println("请输入第" + (i+1)+ "个同学的性别:");
			stu.sex = scanner.next().charAt(0);
			System.out.println("请输入第" + (i+1)+ "个同学的年龄:");
			stu.age = scanner.nextInt();
			System.out.println("请输入第" +(i+1) + "个同学的学号:");
			stu.no = scanner.next();
			student[i] = stu;
		}
	} 
	public void outPut(){
		for(int i = 0; i < student.length; i++){
			System.out.print("姓名:" + student[i].name + " ");
			System.out.print("性别:" + student[i].sex + " ");
			System.out.print("年龄:" + student[i].age + " ");
			System.out.println("学号:" + student[i].no);
		}
	}
	public static void main(String[] args) {
	    StudentTest test = new StudentTest();
	    test.initStudent();
	    test.outPut();
	}
}
