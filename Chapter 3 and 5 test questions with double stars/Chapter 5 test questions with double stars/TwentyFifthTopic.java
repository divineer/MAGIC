package Chapter5TestQuestions;

public class TwentyFifthTopic 
{
	public static void main(String[] args) 
	{
		double a = 1, b, c = 1;
		long  i;
		for (i = 2;i <= 100000;i += 2)
		{
			b = Math.pow(-1, c);
			a = a + b * (1.0 / (2 * i - 1));
			c = c + 1;
			if (i == 10000)
				System.out.println(a);
			if (i == 20000)
				System.out.println(a);
		}
			System.out.println(a);
	}
}
//简单的算式方法，可求近似圆周率的值