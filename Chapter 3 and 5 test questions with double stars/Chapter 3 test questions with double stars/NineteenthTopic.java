package Chapter3TestQuestions;
import java.util.Scanner;
public class NineteenthTopic 
{
	public static void main(String[] args) 
	{
		System.out.print("Input 3 digits: ");
		Scanner input = new Scanner(System.in);
		String[] D = input.next().split(",");
		int c = 0;
		if ((Integer.valueOf(D[0]) + Integer.valueOf(D[1]) > Integer.valueOf(D[2])) && (Integer.valueOf(D[0]) + Integer.valueOf(D[2]) > Integer.valueOf(D[1])) && (Integer.valueOf(D[2]) + Integer.valueOf(D[1]) > Integer.valueOf(D[0])))
		{
			c = Integer.valueOf(D[0]) + Integer.valueOf(D[1]) + Integer.valueOf(D[2]);
		    System.out.println(c);
		}
		else
		    System.out.println("Your input is wrong!");
	}
}
//该题是判断输入的三个数能否组成三角形并求其周长，感觉这种一行输入的已经习惯用字符数组了
//如果不能以空格间隔可能是因为空格也算字符还是什么？以后尝试