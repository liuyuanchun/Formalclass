package day6;

public class Square extends Graphics{
	private int length;
	
	public Square(){
		super();
	}
	public Square(int length) {
		super();
		this.length = length;
		
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void draw(){
		System.out.println("���ڻ������Σ�����Ϊ:" + length);
	}
}
