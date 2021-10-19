package Chapter5TestQuestions;
import java.util.Scanner;
public class TwentySecondTopic 
{
	public static void main(String[] args) 
	{
		System.out.print("Loan Amount: ");
		Scanner input = new Scanner(System.in);
		double loanAmount = input.nextDouble();
		System.out.print("Number of years: ");
		int numberOfYears = input.nextInt();
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = input.nextInt();
		double monthlyInterestRate;
		double monthlyPayment;
		double totalPayment;
		monthlyInterestRate = annualInterestRate / 1200;
	    monthlyPayment = loanAmount * monthlyInterestRate / (1 -  1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		totalPayment = monthlyPayment * numberOfYears * 12;
		System.out.printf("Monthly Payment: %.2f",monthlyPayment);
		System.out.println();
		System.out.printf("Total Payment: %.2f",totalPayment);
		System.out.println();
		System.out.println("Payment#     Interest     Principal     Balance");
		double interest,principal,balance;
		balance = loanAmount;
		for (int i = 1;i <= numberOfYears * 12;i++)
		{
			System.out.print(i);
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("            %.2f        %.2f        %.2f",interest,principal,balance);
			System.out.println();
		}
	}
}
