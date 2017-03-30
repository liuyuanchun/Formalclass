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
		System.out.println("请输入学生个数:");
		int num = scanner.nextInt();
		stus = new Student[num];
		for(int i = 0; i < stus.length; i++){
			Student student = new Student();
			System.out.println("请输入第" + (i + 1) +"个同学的姓名:");
			String name = scanner.next();
			student.setName(name);
			System.out.println("请输入第" + (i + 1) +"个同学的年龄:");
			int age = scanner.nextInt();
			student.setAge(age);
			System.out.println("请输入第" + (i + 1) +"个同学的性别:");
			char sex = scanner.next().charAt(0);
			student.setSex(sex);
			stus[i] = student;
		}
	}
	public void outPut(){
		for(int i = 0; i < stus.length; i++){
			System.out.print("姓名:" + stus[i].getName() + " ");
			System.out.print("年龄:" + stus[i].getAge() + " ");
			System.out.println("性别:" + stus[i].getSex());
		}
	}
	public void searchStudent(){
		while(true){
			System.out.println("=========根据条件查询学生信息========");
			System.out.println("根据姓名查询：1");
			System.out.println("根据年龄查询：2");
			System.out.println("根据性别查询：3");
			System.out.println("退出：0");
			int cond = scanner.nextInt();
			if(cond == 0){
				System.out.println("退出!");
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
					System.out.println("输入的数字无效!");
					break;
			}
		}
	}
	public void SearchedByName(){
		System.out.println("请输入要查询的姓名:");
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
			System.out.println("没有此同学");
		}
	}
	public void SearchedByAge(){
		System.out.println("请输入要查询的年龄:");
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
			System.out.println("没有此同学");
		}
	}
	public void SearchedBySex(){
		System.out.println("请输入要查询的性别:");
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
			System.out.println("没有此同学");
		}
	}
	public static void main(String[] args) {
		try{
			StudentTest stu = new StudentTest();
			stu.initStudent();
			stu.outPut();
			stu.searchStudent();
		}catch(Exception e){
			System.out.println("输入有误！");
		}finally{
			System.out.println("程序结束!");
		}	                                                                         
	}
}
