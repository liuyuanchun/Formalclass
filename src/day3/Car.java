package day3;

/**
 * ����������Car��������
 * ���ԣ�brand(Ʒ��)��price(�۸�)��color(��ɫ)
 * ������show()����������������3������
 *  startup()�������brandƷ�Ƶ���������
 * ����CarTest�࣬��main�У�
 * ����Car���������󣬲������Ը�ֵ���ٵ��÷�����
 */
	public class Car {
		String brand;
		double price;
		String color;
		public void show(){
			System.out.println("������Ʒ��:" + brand);
			System.out.println("�����ļ۸�:" + price);
			System.out.println("��������ɫ:" + color);
		}
		public void startup(){
			System.out.println(brand + "Ʒ�Ƶ���������");
		}
}
