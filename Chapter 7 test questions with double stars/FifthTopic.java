package Chapter7TestQuestions;
import java.util.Scanner;
public class FifthTopic 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int[] num = new int[10];
		int[] newnum = new int[10];
		int t = 0, b = 0;
		while(t < 10)
		{
			int a = input.nextInt();
			num[t] = a;
			t++;
		}
		for (int i = 0;i < 10;i++)
		{
			int s = 0;
			for (int j = 0;j < 10;j++)
			{
				if (num[i] == newnum[j])
				{
					s = 1;
				}
			}
			if (s == 0)
			{
				newnum[b] = num[i];
				b++;
			}
		}
		System.out.printf("The number of distinct numbers is %d\n",b);  //因为最后输入完成后b++了，理解
		System.out.print("The distinct numbers are ");
		for (int k = 0;k < b;k++)
		{
			System.out.printf("%d ",newnum[k]);
		}
	}
}
//输入十个数字，判断这十个数字中相异的数字有几个，再按顺序输出相异的数字
//这题的精华就是想到再建一个新的数组，如果这个数组中之前没有这个数字，则存进去，如果已经有了则忽略
//这个方法很巧妙，就省去了判断它是否在原来那个数组中重复，重复又要怎么记录怎么删除，重复多少次这样的，直接把新数放进来，学会！！