package day3;

import java.util.Scanner;

public class StudentTest {
	private Scanner scanner = new Scanner(System.in);
	private Student[] student;
	public void initStudent(){
		System.out.println("������ѧ������ ��");
		int num = scanner.nextInt();
		student = new Student[num];
		for(int i = 0; i < student.length; i++){
			Student stu = new Student();
			System.out.println("�������" + (i+1) + "��ͬѧ������:");
			stu.name = scanner.next();
			System.out.println("�������" + (i+1)+ "��ͬѧ���Ա�:");
			stu.sex = scanner.next().charAt(0);
			System.out.println("�������" + (i+1)+ "��ͬѧ������:");
			stu.age = scanner.nextInt();
			System.out.println("�������" +(i+1) + "��ͬѧ��ѧ��:");
			stu.no = scanner.next();
			student[i] = stu;
		}
	} 
	public void outPut(){
		for(int i = 0; i < student.length; i++){
			System.out.print("����:" + student[i].name + " ");
			System.out.print("�Ա�:" + student[i].sex + " ");
			System.out.print("����:" + student[i].age + " ");
			System.out.println("ѧ��:" + student[i].no);
		}
	}
	public static void main(String[] args) {
	    StudentTest test = new StudentTest();
	    test.initStudent();
	    test.outPut();
	}
}
