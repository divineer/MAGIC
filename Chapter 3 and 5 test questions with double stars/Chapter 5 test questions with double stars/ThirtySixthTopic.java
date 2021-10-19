package Chapter5TestQuestions;

import java.util.Scanner;

public class ThirtySixthTopic
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		Scanner input = new Scanner(System.in);
		String[] D = input.next().split("");       //定义字符数组并直接输入
		int sum = 0;
		int a = 0;
		System.out.print("The ISBN-10 number is ");
		for (int i = 0;i < 9;i++)
		{
			sum += (Integer.valueOf(D[i])) * (i + 1);
			System.out.print(D[i]);
		}
		a = sum % 11;
		if(a == 10)
		{
			System.out.print("X");
		}
		else
		{
			System.out.print(a);
		}
	}
}
//输入一行没有空格的数字，这里涉及了字符数组的定义，以及如何实行这样的输入(没有空格或什么！)
//输入之后想进行运算必须通过函数将其转化成int类型，不然一直是char类型不可以进行运算
//此题其实就是3.9，利用循环简化程序，但我也不知道不用循环和字符数组怎么做，唉