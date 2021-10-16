package Chapter2;

import java.util.Scanner;

public class ComputeLoan
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//Enter annual interest rate  in percentage, e.g., 7.25
		System.out.print("Enter annual interest rate, e.g.,  7.25: "); 
		double annualInterestRate = input.nextDouble();

		//Obtain monthly rate
		double monthlyInterestRate = annualInterestRate / 1200;

		//Enter number of years
		System.out.print("Enter number of years as an enteger, e.g., 5: ");
		int numberOfYears = input.nextInt();
		
		//Enter loan amount
		System.out.print("Enter loan amount, e.g., 120000.95: ");
		double loanAmount = input.nextDouble();
		
		//Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -  1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		//Display results
		System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
	}
}
//这是例题2-9，主要是通过引用Math.pow()来得到所需数值