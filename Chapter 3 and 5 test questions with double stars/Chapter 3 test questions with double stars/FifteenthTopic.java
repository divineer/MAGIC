package Chapter3TestQuestions;

import java.util.Random;
import java.util.Scanner;

public class FifteenthTopic 
{
	public static void main(String[] args) 
	{
		int num;
		num = (int)(Math.random() * 900) + 100;
		System.out.print("Enter your lottery pick (three digits): ");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		int num1 = num / 100;
		int num2 = (num - num1 * 100) / 10;
		int num3 = num - num1 * 100 - num2 * 10;
		int guess1 = guess / 100;
		int guess2 = (guess - guess1 * 100) / 10;
		int guess3 = (guess - guess1 * 100) % 10;
		if (guess == num)
			System.out.println("Exact match: you win $10,000");
		else if ((num1 == guess2 && num2 == guess3 && num3 == guess1) || (num1 == guess3 && num2 == guess2 && num3 == guess1) || (num1 == guess1 && num2 == guess3 && num3 == guess2) || (num1 == guess2 && num2 == guess1 && num3 == guess3) || (num1 == guess3 && num2 == guess1 && num3 == guess2))
			System.out.println("Match all digits: you win $3,000");
		else if (num1 == guess1 || num1 == guess2 || num1 == guess3 || num2 == guess1 || num2 == guess2 || num3 == guess3 || num3 == guess1 || num3 == guess2 || num3 == guess3)
			System.out.println("Match one digit: you win $1,000");
	}
}
//该题随机生成三位数的整数，也就是彩票类问题