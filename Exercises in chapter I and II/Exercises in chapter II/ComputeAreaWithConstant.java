package Chapter2;

import java.util.Scanner;

public class ComputeAreaWithConstant 
{
	public static void main(String[] args)
	{
		final double PI = 3.14159;  //Declare a constant
		
		//Create a Scanner object
	    Scanner input = new Scanner(System.in);
	    
	    //prompt user to enter a radius
	    System.out.print("Enter a number for radius: ");
	    double radius = input.nextDouble();
	    
	    //Compute area
	    double area = radius * radius * PI;
	    
	    //Display results
	    System.out.println("The area for thr radius " + radius + " is " + area);
	}
}
//这是例题2-4，学习怎么定义常量（用final define）