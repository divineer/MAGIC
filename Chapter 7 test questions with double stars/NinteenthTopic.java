package Chapter7TestQuestions;
import java.util.Scanner;
public class NinteenthTopic
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int num = input.nextInt();
		System.out.print("Enter the contents of the list: ");
		int[] a = new int[num+10];
		for (int t = 0;t < num;t++)
		{
			a[t] = input.nextInt();
		}
		int b = 0;
		for (int i = 0;i < num-1;i++)   //一定要注意这里最后一个数没法比了，不然越界比那么肯定会让b=1
		{
			if(a[i] > a[i+1])
			{
				b = 1;
				break;
			}
		}
		if (b == 0)
		{
			System.out.print("The list has " + num +" integers ");
			for (int j = 0;j < num;j++)
			{
				System.out.printf("%d ",a[j]);
			}
			System.out.printf("\n");
			System.out.print("The list is already sorted");
		}
		if (b == 1)
		{
			System.out.print("The list has " + num +" integers ");
			for (int j = 0;j < num;j++)
			{
				System.out.printf("%d ",a[j]);
			}
			System.out.printf("\n");
			System.out.print("The list is not sorted");
		}
	}
}
//判断是否有序，出错时一定要判断比较条件，细心点！！！