package Chapter5TestQuestions;
import java.util.Random;
public class ThirtySecondTopic 
{
	public static void main(String[] args) 
	{
		int a = new Random().nextInt(9) + 1;
		int b, c;
		for (int i = 0;i < 10000;i++)
		{
			b = new Random().nextInt(9) + 0;
			if (b != a)
			{
				c = a * 10 + b;
				System.out.println(c);
				break;
			}
		}
	}
}
//随机产生一个两位数随机数且个十位数字不相同，了解这种做法