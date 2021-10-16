package Chapter3TestQuestions;
import java.util.Scanner;
public class TwentyFirstTopic 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month: 1-12: ");
		int m = input.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		int q = input.nextInt();
		if (m != 1 && m != 2)
		{
			int j, k, h;
			j = year / 100;
			k = year % 100;
			h = (q + 26 * (m+ 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
			switch (h)
			{
			case 0:System.out.println("Day of the week is Saturday");break;
			case 1:System.out.println("Day of the week is Sunday");break;
			case 2:System.out.println("Day of the week is Monday");break;
			case 3:System.out.println("Day of the week is Tuesday");break;
			case 4:System.out.println("Day of the week is Wednesday");break;
			case 5:System.out.println("Day of the week is Thursday");break;
			case 6:System.out.println("Day of the week is Friday");break;
			}
		}
		else
		{
			m = m + 12;
			year = year - 1;
			int j, k, h;
			j = year / 100;
			k = year % 100;
			h = (q + 26 * (m+ 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
			switch (h)
			{
			case 0:System.out.println("Day of the week is Saturday");break;
			case 1:System.out.println("Day of the week is Sunday");break;
			case 2:System.out.println("Day of the week is Monday");break;
			case 3:System.out.println("Day of the week is Tuesday");break;
			case 4:System.out.println("Day of the week is Wednesday");break;
			case 5:System.out.println("Day of the week is Thursday");break;
			case 6:System.out.println("Day of the week is Friday");break;
			}
		}
	}
}
//这个题总体来说还是挺简单的，就是只要判断一个m的条件就好了，一定要记住switch搭配break使用，不然给自己带来很多麻烦