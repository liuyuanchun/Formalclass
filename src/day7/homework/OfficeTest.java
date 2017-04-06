package day7.homework;

public class OfficeTest {
	public static void main(String[] args) {
		Office office = new Word("我是一个好人！");
		office.start();
		office = new Excel("我真的是一个好人！");
		office.start();
		office = new Ppt("我确实是一个好人!");
		office.start();
	}
}
