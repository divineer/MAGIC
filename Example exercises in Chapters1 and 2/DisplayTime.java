package Chapter2;

import java.util.Scanner;

public class DisplayTime 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to input
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60;           //Find minutes in seconds
		int remainingSeconds = seconds % 60;  //Seconds remaining
	    System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
	}
}
//这是例题2-5，也是一个简单的计算，只是由double换成了int