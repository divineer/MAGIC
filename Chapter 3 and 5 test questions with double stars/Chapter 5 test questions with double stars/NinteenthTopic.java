package Chapter5TestQuestions;

public class NinteenthTopic 
{
	public static void main(String[] args)
	{
		for (int i = 1;i <= 8;i++)
		{
			if (i != 8)
			{
				for (int j = 1;j <= 8 - i;j++)
				{
				    System.out.printf("    ");
				}
			}
			
			int p;
			p = (int) Math.pow(2, i - 1);
			
			for (int a = 1;a <= p;)
			{
				if (a != 1) 
				{
				if (a < 10)
					System.out.printf("   ");
				else if (a > 10 && a < 100)
					System.out.printf("  ");
				else if (a > 100)
					System.out.printf(" ");
				}
				System.out.printf("%d", a);
				a = a * 2;
			}
			
			if(i >= 2)
			{
		        for (int b = p;b > 1;)
		        {
				    b = b / 2;				    
		        	if (b < 10)
						System.out.printf("   ");
					else if (b > 10 && b < 100)
						System.out.printf("  ");
					else if (b > 100)
						System.out.printf(" ");
				    System.out.printf("%d", b);
			    }
			}
			System.out.println();
		}
	}
}
//就是和17题差不多的解法，重要的是空格的分布，重在理解第十七题