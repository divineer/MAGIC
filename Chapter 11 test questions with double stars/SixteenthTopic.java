package Chapter11TestQuestions;
import java.util.*;

//题目的要求是重写5-1，即计算随机给出的两个整数的和，如果重复了则要输出重复信息
//题目给的提示是可以将已给出的答案放在一个数组中来判断，这样很巧妙，记住了！
public class SixteenthTopic
{
	public static void main(String[] args)
	{
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		
		int[] data = new int[100];
		int i = 0, flag = 0;
		int answer = input.nextInt();
		data[i] = answer;
		i++;
		
		while (number1 + number2 != answer)    //使用循环的方法来不断这样判断，方便很多！要记住这样的思想！
		{
			flag = 0;
			//这个步骤也尝试过，要一进来就输出这个，不能放在下面的判断中，知道while的规则，自己调试！
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();  //因为我们这里又要求输入了
			for (int j = 0;j < i;j++)
			{
				if (data[j] == answer)
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				data[i] = answer;
				i++;
			}
			if (flag == 1)
			{
				System.out.println("You already entered " + answer);
			}
		}
		
		System.out.println("You got it!");  //到这一步说明运行正确，直接输出即可
	}
}