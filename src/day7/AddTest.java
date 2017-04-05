package day7;

public class AddTest {
	public static void main(String[] args) {
		Add ad = new Add();
		System.out.println("int 型" + ad.add(10,5));
		System.out.println("double 型" + ad.add(10,5));
		System.out.println("long 型" + ad.add(10,5));
		System.out.println("float 型" + ad.add(10,5));
	}
}
