package Chapter2;

import java.util.Scanner;  //Scanner��λ��java.util���У����������ùؼ��ʵ��룬֮���ٴ���һ��Scanner����

public class ComputeAreaWithConsoleInput 
{
	public static void main(String[] args)
	{
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		//Compute area
		double area = radius * radius * 3.14159;
		
		//Display results
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}
//��Ϊ�����嵥2-2�����⣬�����ô����ͺ��ˣ����û����»س�����ʱ��������Ǹ��㸳ֵ��radius�ˣ����ڶ���֮�����ϸѧϰ