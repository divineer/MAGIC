package Chapter2;

import java.util.Scanner;  //Scanner类位于java.util包中，在这里引用关键词导入，之后再创建一个Scanner对象

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
//此为程序清单2-2的例题，理解怎么输入就好了，当用户按下回车键的时候输入的那个便赋值给radius了，关于对象之后会详细学习