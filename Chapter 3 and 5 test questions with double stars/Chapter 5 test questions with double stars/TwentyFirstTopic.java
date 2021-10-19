package Chapter5TestQuestions;
import java.util.Scanner;
public class TwentyFirstTopic 
{

	public static void main(String[] args) 
	{
		System.out.print("Loan Amount: ");
		Scanner input = new Scanner(System.in);
		double loanAmount = input.nextDouble();
		System.out.print("Number of years: ");
		int numberOfYears = input.nextInt();
		System.out.println("Interst Rate    Monthly Rate    Total Payment");
		double annualInterestRate = 5;
		double monthlyInterestRate;
		double monthlyPayment;
		double totalPayment;
		for (int i = 1;i <= 24;i++)
		{
		    monthlyInterestRate = annualInterestRate / 1200;
		    monthlyPayment = loanAmount * monthlyInterestRate / (1 -  1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			totalPayment = monthlyPayment * numberOfYears * 12;
			annualInterestRate = annualInterestRate + 0.125;
			System.out.printf("%.3f           %.2f          %.2f",annualInterestRate,monthlyPayment,totalPayment);
			System.out.println();
		}
	}
}
//这个题目是金融运用问题，与上一次作业中的2-9类似，掌握公式即年利率与月利率之间的转换即可，多复习金融公式