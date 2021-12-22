package Chapter11TestQuestions;
import java.util.*;
public class NinteenthTopic 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of objects: ");
		int num = input.nextInt();
		System.out.println();
		System.out.print("Enter the weights of the objects: ");
		int[] data = new int[100];
		int[] record = new int[100];
		for (int i = 0;i < num;i++)
		{
			data[i] = input.nextInt();   //按照输入顺序依次放入
			record[i] = data[i];         //做一个记录的数组，输出的时候使用
		}
		
		//自己写出来的最先适配法！没有用到对象什么的，这是个比较容易很基础的装箱问题！
		for (int j = 0;j < num;j++)
		{
			for (int k = 0;k < j;k++) //找第data[j]这个箱子的最左面未被“合体”过的箱子是否满足条件！
			{
				if (data[k]+data[j] <= 10 && data[k] != 0)  //还要过滤已经合体的数据
				{
					data[k] = data[j] + data[k]; //此时数据已经更新，但需要输出的是分开的数字，所以就要设置record
					data[j] = 0;
					break;                       //找的是最左面的符合条件的，找到了就break
				}
			}
		}
		
		//输出操作，易懂！
		System.out.println();
		int g = 1;                 //记录箱子个数
		for (int h = 0;h < num;h++)
		{
			if (data[h] != 0)
			{
				if (data[h] - record[h] != 0)    //这样的输出也分情况，有些没有找到合体箱
				{
					System.out.print("Container " + g + " contains objects with weight "+ record[h] + " " + (data[h] - record[h]));
					System.out.println();
					g++;
				}
				else
				{
					System.out.print("Container " + g + " contains objects with weight "+ data[h]);
					System.out.println();
					g++;
				}
			}
		}
	}
}
//这是一个集装箱问题，给出物品个数与物品重量，假设每个箱子可装十磅，求用最先适配法得到的箱子个数与每个箱子装的物品个数
//比如有六个物品，依次为（磅数）：7  5  2  3  5  8   //那么应该装四个箱子，依次为 /7 2/3 5/5/8
//我们要了解的是最先适配法，网上当然有很多讲解还有更加复杂的什么动态分配，但以我们现在的能力我们就按下面这个理解
//最先适配法（first fit,FF）：物品按1,2,3,…n的顺序装入箱子。假设箱子从左到右排列。每个物品i放入可装载它的最左面的箱子
//这样理解的话也能解释为什么上面那个例题的结果是这样的，以后就这样理解最先适配！是最左面，而不是左面，理解！