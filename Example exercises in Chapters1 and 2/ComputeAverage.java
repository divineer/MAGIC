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
//��������2-3��������ʾ�û�����������ֵ�����ң�����������ֵ����Ϊ���ù涨�ĵڼ����ڼ��б���ȡ����������һ����ֵ�󰴻س���������
//Ҳ������һ�����ֿո�������