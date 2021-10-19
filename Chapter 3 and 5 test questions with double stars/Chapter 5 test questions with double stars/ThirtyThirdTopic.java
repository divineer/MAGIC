package Chapter5TestQuestions;

public class ThirtyThirdTopic 
{
	public static void main(String[] args)
	{
		for (int i = 2;i <= 10000;i++)
		{
			int sum = 0;
			for (int j = i;j > 0;j--)
			{
				if (i % j == 0 && j != i)
					sum = sum + j;
			}
			if (sum == i)
			{
			     System.out.println(sum);
			}
		}
	}
}
//这是找10000以内的4个完全数，写的时候一定要注意很多很多细节，不然耽误时间的是自己