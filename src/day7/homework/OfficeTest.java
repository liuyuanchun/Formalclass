package day7.homework;

public class OfficeTest {
	public static void main(String[] args) {
		Office office = new Word("����һ�����ˣ�");
		office.start();
		office = new Excel("�������һ�����ˣ�");
		office.start();
		office = new Ppt("��ȷʵ��һ������!");
		office.start();
	}
}
