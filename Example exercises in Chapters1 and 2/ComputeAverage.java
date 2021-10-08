package Chapter2;

import java.util.Scanner;

public class ComputeAverage 
{
	public static void main(String[] args) 
	{
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter three numbers
		System.out.print("Enteer three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		//Compute average
		double average = (number1 + number2 + number3) / 3;
		
		//Display results
		System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
	}
}
//这是例题2-3，这里提示用户输入三个数值，并且！！这三个数值在人为设置规定的第几到第几行被读取，可以输入一个数值后按回车键再输入
//也可以输一个数字空格再输入