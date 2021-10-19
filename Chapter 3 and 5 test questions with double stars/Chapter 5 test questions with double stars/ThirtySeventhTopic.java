package Chapter5TestQuestions;
import java.util.Scanner;
public class ThirtySeventhTopic 
{
	public static void main(String[] args)
	{
		System.out.print("Enter a decimal integer: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int[] data = new int[1000];
		int i;
        for (i = 0;a > 0;i++)
	    {
        	data[i] = a % 2;
        	a = a / 2;
		}
        System.out.print("The number is converted to a binary number is ");
        for (int j = i - 1;j >= 0;j--)
        {
        	System.out.print(data[j]);
        }
	}
}
//用循环结构将十进制整数转化成二进制数，由于最后能整数所以数组中最后存进去的是0，故而不用输出
//在JAVA中其实是有对应的转换函数的，但还是要知道原理