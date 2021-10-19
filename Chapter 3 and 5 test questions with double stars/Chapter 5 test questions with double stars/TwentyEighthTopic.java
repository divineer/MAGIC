package Chapter5TestQuestions;
import java.util.Scanner;
public class TwentyEighthTopic
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter the day of the week for the first day of the year: ");
		int q = input.nextInt();
		int F,M3,A4,M5,J6,J7,A8,S,O,N,D;
		int j = year / 100;
		int k = year % 100;
		int s = (year - 1) / 100;
		int b = (year - 1) % 100;
		F = (1 + 26 * 15 / 10 + b + b / 4 + s / 4 + 5 * s) % 7;
		M3 = (1 + 26 * 4 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		A4 = (1 + 26 * 5 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		M5 = (1 + 26 * 6 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		J6 = (1 + 26 * 7 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		J7 = (1 + 26 * 8 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		A8 = (1 + 26 * 9 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		S = (1 + 26 * 10 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		O = (1 + 26 * 11 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		N = (1 + 26 * 12 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		D = (1 + 26 * 13 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		switch (q)
		{
		case 6:System.out.println("January 1, " + year + " is " + "Saturday");break;
		case 7:System.out.println("January 1, " + year + " is " + "Sunday");break;
		case 1:System.out.println("January 1, " + year + " is " + "Monday");break;
		case 2:System.out.println("January 1, " + year + " is " + "Tuesday");break;
		case 3:System.out.println("January 1, " + year + " is " + "Wednesday");break;
		case 4:System.out.println("January 1, " + year + " is " + "Thursday");break;
		case 5:System.out.println("January 1, " + year + " is " + "Friday");break;
		}
		switch (F)
		{
		case 0:System.out.println("February 1, " + year + " is " + "Saturday");break;
		case 1:System.out.println("February 1, " + year + " is " + "Sunday");break;
		case 2:System.out.println("February 1, " + year + " is " + "Monday");break;
		case 3:System.out.println("February 1, " + year + " is " + "Tuesday");break;
		case 4:System.out.println("February 1, " + year + " is " + "Wednesday");break;
		case 5:System.out.println("February 1, " + year + " is " + "Thursday");break;
		case 6:System.out.println("February 1, " + year + " is " + "Friday");break;
		}
		switch (M3)
		{
		case 0:System.out.println("March 1, " + year + " is " + "Saturday");break;
		case 1:System.out.println("March 1, " + year + " is " + "Sunday");break;
		case 2:System.out.println("March 1, " + year + " is " + "Monday");break;
		case 3:System.out.println("March 1, " + year + " is " + "Tuesday");break;
		case 4:System.out.println("March 1, " + year + " is " + "Wednesday");break;
		case 5:System.out.println("March 1, " + year + " is " + "Thursday");break;
		case 6:System.out.println("March 1, " + year + " is " + "Friday");break;
		}
		switch (A8)
		{
		case 0:System.out.println("August 1, " + year + " is " + "Saturday");break;
		case 1:System.out.println("August 1, " + year + " is " + "Sunday");break;
		case 2:System.out.println("August 1, " + year + " is " + "Monday");break;
		case 3:System.out.println("August 1, " + year + " is " + "Tuesday");break;
		case 4:System.out.println("August 1, " + year + " is " + "Wednesday");break;
		case 5:System.out.println("August 1, " + year + " is " + "Thursday");break;
		case 6:System.out.println("August 1, " + year + " is " + "Friday");break;
		}
		switch (M5)
		{
		case 0:System.out.println("May 1, " + year + " is " + "Saturday");break;
		case 1:System.out.println("May 1, " + year + " is " + "Sunday");break;
		case 2:System.out.println("May 1, " + year + " is " + "Monday");break;
		case 3:System.out.println("May 1, " + year + " is " + "Tuesday");break;
		case 4:System.out.println("May 1, " + year + " is " + "Wednesday");break;
		case 5:System.out.println("May 1, " + year + " is " + "Thursday");break;
		case 6:System.out.println("May 1, " + year + " is " + "Friday");break;
		}
		switch (J6)
		{
		case 0:System.out.println("June 1, " + year + " is " + "Saturday");break;
		case 1:System.out.println("June 1, " + year + " is " + "Sunday");break;
		case 2:System.out.println("June 1, " + year + " is " + "Monday");break;
		case 3:System.out.println("June 1, " + year + " is " + "Tuesday");break;
		case 4:System.out.println("June 1, " + year + " is " + "Wednesday");break;
		case 5:System.out.println("June 1, " + year + " is " + "Thursday");break;
		case 6:System.out.println("June 1, " + year + " is " + "Friday");break;
		}
		switch (J7)
		{
		case 0:System.out.println("July 1, " + year + " is " + "Saturday");break;
		case 1:System.out.println("July 1, " + year + " is " + "Sunday");break;
		case 2:System.out.println("July 1, " + year + " is " + "Monday");break;
		case 3:System.out.println("July 1, " + year + " is " + "Tuesday");break;
		case 4:System.out.println("July 1, " + year + " is " + "Wednesday");break;
		case 5:System.out.println("July 1, " + year + " is " + "Thursday");break;
		case 6:System.out.println("July 1, " + year + " is " + "Friday");break;
		}
		switch (A4)
		{
		case 0:System.out.println("April 1, " + year + " is " + "Saturday");break;
		case 1:System.out.println("April 1, " + year + " is " + "Sunday");break;
		case 2:System.out.println("April 1, " + year + " is " + "Monday");break;
		case 3:System.out.println("April 1, " + year + " is " + "Tuesday");break;
		case 4:System.out.println("April 1, " + year + " is " + "Wednesday");break;
		case 5:System.out.println("April 1, " + year + " is " + "Thursday");break;
		case 6:System.out.println("April 1, " + year + " is " + "Friday");break;
		}
		switch (S)
		{
		case 0:System.out.println("September 1, " + year + " is " + "Saturday");break;
		case 1:System.out.println("September 1, " + year + " is " + "Sunday");break;
		case 2:System.out.println("September 1, " + year + " is " + "Monday");break;
		case 3:System.out.println("September 1, " + year + " is " + "Tuesday");break;
		case 4:System.out.println("September 1, " + year + " is " + "Wednesday");break;
		case 5:System.out.println("September 1, " + year + " is " + "Thursday");break;
		case 6:System.out.println("September 1, " + year + " is " + "Friday");break;
		}
		switch (O)
		{
		case 0:System.out.println("October 1, " + year + " is " + "Saturday");break;
		case 1:System.out.println("October 1, " + year + " is " + "Sunday");break;
		case 2:System.out.println("October 1, " + year + " is " + "Monday");break;
		case 3:System.out.println("October 1, " + year + " is " + "Tuesday");break;
		case 4:System.out.println("October 1, " + year + " is " + "Wednesday");break;
		case 5:System.out.println("October 1, " + year + " is " + "Thursday");break;
		case 6:System.out.println("October 1, " + year + " is " + "Friday");break;
		}
		switch (N)
		{
		case 0:System.out.println("November 1, " + year + " is " + "Saturday");break;
		case 1:System.out.println("November 1, " + year + " is " + "Sunday");break;
		case 2:System.out.println("November 1, " + year + " is " + "Monday");break;
		case 3:System.out.println("November 1, " + year + " is " + "Tuesday");break;
		case 4:System.out.println("November 1, " + year + " is " + "Wednesday");break;
		case 5:System.out.println("November 1, " + year + " is " + "Thursday");break;
		case 6:System.out.println("November 1, " + year + " is " + "Friday");break;
		}
		switch (D)
		{
		case 0:System.out.println("December 1, " + year + " is " + "Saturday");break;
		case 1:System.out.println("December 1, " + year + " is " + "Sunday");break;
		case 2:System.out.println("December 1, " + year + " is " + "Monday");break;
		case 3:System.out.println("December 1, " + year + " is " + "Tuesday");break;
		case 4:System.out.println("December 1, " + year + " is " + "Wednesday");break;
		case 5:System.out.println("December 1, " + year + " is " + "Thursday");break;
		case 6:System.out.println("December 1, " + year + " is " + "Friday");break;
		}
	}
}
//输入一个年份和该年份第一天（1月1日）是星期几，输出该年每月第一天是星期几，掌握好公式的运用，只能重复这么多，没办法太蠢了
//计算哪天是星期几的完整公式在第三章第二十一小题