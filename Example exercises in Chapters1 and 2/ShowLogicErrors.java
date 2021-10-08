package Chapter1;

public class ShowLogicErrors 
{
	public static void main(String[] args)
	{
		System.out.print("Celsius 35 is Fahrenheit degree ");
		System.out.println((9 / 5) * 35 + 32);
	}
}
//此为程序清单1-6，检查语句中的逻辑错误，这里是因为Java中整数相除是返回除法的整数部分
//即小数部分将会截掉，因此9/5的结果是1，要想得到正确的应该是9.0/5