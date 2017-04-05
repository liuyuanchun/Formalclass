package day7.calculator;

public class Multi extends Cal{
	public Multi(){
		super();
	}
	public Multi(int num1,int num2){
		super(num1,num2);
	}
	public int getResult(){
		return getNum1() * getNum2();
	}
}
