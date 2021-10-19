package Chapter5TestQuestions;
import java.util.Scanner;
public class SeventeenthTopic 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number of lines: ");
		int lines = input.nextInt();
		for (int i = 1;i <= lines;i++)
		{
			if (i != lines)
			{
			     for (int j = 1;j <= lines - i;j++)
			     {
				     System.out.print("  ");
			     }
			}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
			for (int b = i;b > 0;b--)
			{
				System.out.printf("%d ",b);
			}
			
			if(i >= 2)
			{
			    for (int c = 2;c <= i;c++)
			    {
			    	
				     System.out.printf("%d ",c);
			    }
			}
			
			System.out.println();
		}
	}
}
//这个题目的关键点在于理清思路，一行一行输出，输出几个空格（掌握规律）
//输出空格后是输入这行的数字到1，在顺式输出，掌握好数字与数字之间的空格再根据运行结果思考修改
//遇到这种不用慌，一定要理清思路，在学习JAVA中printf的使用