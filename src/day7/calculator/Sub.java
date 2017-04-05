package day7.calculator;

public class Sub extends Cal{
	public Sub(){
		super();
	}
	public Sub(int num1,int num2){
		super(num1,num2);
	}
	public int getResult(){
		return getNum1() - getNum2();
	}
}
