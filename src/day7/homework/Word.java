package day7.homework;

public class Word extends Office{
	public Word(){
		super();
	}
	public Word(String data){
		super(data);
	}
	
	public void start(){
		super.start();
		System.out.println("Word���ڴ򿪣��򿪵�������:" + data);
	}
}
