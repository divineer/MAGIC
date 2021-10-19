package Chapter5TestQuestions;

public class TwentySixthTopic 
{
	public static void main(String[] args)
	{
		double over = 0;
		for (int i = 1;i <= 100000;i++)
		{
			double sum = 1;
			for (int j = i;j > 0;j--)
			{
				sum = sum * j;
			}
			over = over + 1.0 / sum;
			if (i == 10000)
				System.out.println(over);
			if (i == 20000)
				System.out.println(over);
		}
		System.out.println(over);
	}
}
//求近似值e的值，注意细节