package day7.calculator;

public class Div extends Cal{
	public Div(){
		super();
	}
	public Div(int num1, int num2){
		super(num1,num2);
	}
	public int getResult(){
		return getNum1() / getNum2();
	}
}
