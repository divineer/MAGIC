package Chapter11Examples;
import java.util.*;
public class DistinctNumbers
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();  //创建一个存储Integer对象的ArrayList
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers (input ends with 0): ");
		int value;
		
		do  //记住do-while结构是必须执行一次，所以用在这种地方合适不过
		{
			value = input.nextInt();
			
			if (!list.contains(value) && value != 0) //记住这个循环体的执行方式，这里一定要判断不等于0
			{                                        //这个地方直接用函数判断是否包含，比写两个数组方便得多，创建对象数组的好处！
				list.add(value);
			}
		}while(value != 0);

		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
	}
}
//上个代码中写道ArrayList和数组的不同，像这里不能存放整型数据，但能存放整型对象，使用列表函数则方便得多
//ArrayLise大小是灵活的，无需提前给定，但创建数组时它的大小必须给定