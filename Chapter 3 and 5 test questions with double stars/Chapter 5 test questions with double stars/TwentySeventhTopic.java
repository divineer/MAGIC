package Chapter5TestQuestions;

public class TwentySeventhTopic 
{
	public static void main(String[] args)
	{
		int a = 0, sum = 0;
		for (int i = 101;i <= 2100;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				System.out.print(i + " ");
				a++;
				sum ++;
			}
			if ((a % 10 == 0) && a != 0)
			{
				System.out.println();
				a = 0;
			}
		}
		System.out.println();
		System.out.print("The numbers of leap years between 101 and 2100 is " + sum);
	}
}
//输出指点年份之间的闰年年份并输出个数
//普通闰年指能被4整除但不能被100整除的年份，世纪闰年指能被400整除的年份