package Chapter2;

import java.util.Scanner;

public class ComputeChange 
{
	public static void main(String[] args) 
	{
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Receive the amount
		System.out.print("Enter an amount in double,for example 11.56: ");
		double amount = input.nextDouble();
		int remainingAmount = (int)(amount * 100);
		
		//Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		//Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		//Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		//Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		//Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		//Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
	}
}
//这是一个有关整数兑零问题的代码，首先将输入的总钱数兑换为分币数，再将该数除以100的美元数，求余得剩余分币数
//将剩余分币数除以25得2角5分币数目，求余得剩余分币数
//将剩余分币数除以10得1角数目，求余得剩余分币数
//将剩余分币数除以5 得5美分数目，求余得剩余分币数即1美分数目