package day8.homework;

public class SmokingBikingTeacher extends Teacher implements ISmoking,IBiking{

	@Override
	public void bike() {
	    System.out.println(name + "���ﳵ��");
	}

	@Override
	public void smoke() {
		System.out.println(name + "������!");
	}

}
