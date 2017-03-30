package day4;

import java.util.Scanner;
/**
 * 
 * @author yuanfang
 *
 */
public class StudentTest {
	private Scanner scanner = new Scanner(System.in);
	private Student stus[];
	public void initStudent(){
		System.out.println("������ѧ������:");
		int num = scanner.nextInt();
		stus = new Student[num];
		for(int i = 0; i < stus.length; i++){
			Student student = new Student();
			System.out.println("�������" + (i + 1) +"��ͬѧ������:");
			String name = scanner.next();
			student.setName(name);
			System.out.println("�������" + (i + 1) +"��ͬѧ������:");
			int age = scanner.nextInt();
			student.setAge(age);
			System.out.println("�������" + (i + 1) +"��ͬѧ���Ա�:");
			char sex = scanner.next().charAt(0);
			student.setSex(sex);
			stus[i] = student;
		}
	}
	public void outPut(){
		for(int i = 0; i < stus.length; i++){
			System.out.print("����:" + stus[i].getName() + " ");
			System.out.print("����:" + stus[i].getAge() + " ");
			System.out.println("�Ա�:" + stus[i].getSex());
		}
	}
	public void searchStudent(){
		while(true){
			System.out.println("=========����������ѯѧ����Ϣ========");
			System.out.println("����������ѯ��1");
			System.out.println("���������ѯ��2");
			System.out.println("�����Ա��ѯ��3");
			System.out.println("�˳���0");
			int cond = scanner.nextInt();
			if(cond == 0){
				System.out.println("�˳�!");
				return;
			}
			switch(cond){
			case 1:
				SearchedByName();
				break;
			case 2:
				SearchedByAge();
				break;
			case 3:
				SearchedBySex();
				break;
			default:
					System.out.println("�����������Ч!");
					break;
			}
		}
	}
	public void SearchedByName(){
		System.out.println("������Ҫ��ѯ������:");
		String name = scanner.next();
		boolean searchByName = false;
		for(int i = 0; i < stus.length; i++){
			if(name.equals(stus[i].getName())){
				System.out.print(stus[i].getName() + " ");
				System.out.print(stus[i].getAge() + " ");
				System.out.println(stus[i].getSex());
				searchByName = true;
			}
		}
		if(searchByName == false){
			System.out.println("û�д�ͬѧ");
		}
	}
	public void SearchedByAge(){
		System.out.println("������Ҫ��ѯ������:");
		int age = scanner.nextInt();
		boolean searchByAge = false;
		for(int i = 0; i < stus.length; i++){
			if(age == stus[i].getAge()){
				System.out.print(stus[i].getName() + " ");
				System.out.print(stus[i].getAge() + " ");
				System.out.println(stus[i].getSex());
				searchByAge = true;
			}
		}
		if(searchByAge == false){
			System.out.println("û�д�ͬѧ");
		}
	}
	public void SearchedBySex(){
		System.out.println("������Ҫ��ѯ���Ա�:");
		char sex = scanner.next().charAt(0);
		boolean searchBySex = false;
		for(int i = 0; i < stus.length; i++){
			if(sex == stus[i].getSex()){
				System.out.print(stus[i].getName() + " ");
				System.out.print(stus[i].getAge() + " ");
				System.out.println(stus[i].getSex());
				searchBySex = true;
			}
		}
		if(searchBySex == false){
			System.out.println("û�д�ͬѧ");
		}
	}
	public static void main(String[] args) {
		try{
			StudentTest stu = new StudentTest();
			stu.initStudent();
			stu.outPut();
			stu.searchStudent();
		}catch(Exception e){
			System.out.println("��������");
		}finally{
			System.out.println("�������!");
		}	                                                                         
	}
}
