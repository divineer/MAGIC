package Chapter11TestQuestions;
import java.util.*;

//这一题的要求是输入一个整数m，然后找到最小的整数n，使得m * n是一个完全平方数
//所以我们根据提示首先要掌握的信息是：m的所有最小因子中，将出现次数为奇数的数字相乘所得积即为n
//那么我们首先要找的就是全部的最小因子，也就是所有素因子，比如它能被3、30整除，即能被3、3、2、5整除，理解！
//然后我们既然用的不是数组列表，就要根据一系列条件以及调试得到n，注意各个方面！
//以上是我们在该题要学习到的知识！

public class SeventeenthTopic 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		int m = input.nextInt();
		int num = m;
		
		//以下这个代码是找到所有素数因子的，关键在于 m /= i,如果不能理解就记住!
		int i = 2, j = 0;
		int[] data = new int[1000];
		while (true)
		{
			if (m % i == 0)
			{
				data[j] = i;   //将符合条件的这个数存入数组
				j++;
				m /= i;
			}
			else
			{
				i += 1;
			}
			if (m == 1)
				break;
		}
		
		//以下是我们求得n的方法，有许多重要的条件，比如置零、判断等等
		int number = 1;
		for (int k = 0;k < j;k++)
		{
			int flag = 0;
			for (int h = 0;h < j;h++)
			{
				if (data[h] == data[k] && data[h] != 0)  //调试可知不能漏这个条件！
				{
					if (h != k)
					{
						data[h] = 0;   //不要把判断元素也置零了，否则恒为零
					}
					flag++;
				}
			}
			if (flag % 2 != 0)
			{
				number = number * data[k];
			}
		}
		
		System.out.println("The smallest number n for m * n to be a perfect square is " + number);
		System.out.print("m * n is " + num * number);
	}
}