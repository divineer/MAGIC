package Chapter7TestQuestions;
import java.util.Scanner;
public class ThirdTopic 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int[] Digits = new int[10000];
		int t = 0;
		while (true)
		{
			int a= input.nextInt();
			if(a==0)
				break;
			Digits[t] =a;
			t++;
		}
		for (int j = 0;j < t;j++)
		{
			int sum = 0;
			for (int k = 0;k < t;k++)
			{
				if (Digits[j] == Digits[k])
				{
					sum = sum + 1;
					if (j != k)
					    Digits[k] = 0;
				}
			}
			if (sum > 1 && Digits[j] != 0)
				System.out.printf("%d occurs %d times\n",Digits[j],sum);
			if (sum == 1 && Digits[j] != 0)
				System.out.printf("%d occurs %d time\n",Digits[j],sum);
		}
	}
}
//输入一串数字以0结束，再判断这串数字中每个数字出现了几次
//首先是输入问题，完全可以用这种方法，而不是一股脑地只想着for,这样不好判断，while也很不错！！
//另外就是要想办法怎么让重复输出的数字不再多次输出，注意很多细节的地方并熟知这种方法，自己要想到！