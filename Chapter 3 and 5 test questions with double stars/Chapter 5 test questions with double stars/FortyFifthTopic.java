package Chapter5TestQuestions;
import java.util.Scanner;
public class FortyFifthTopic
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		System.out.print("Enter 10 numbers: ");
		Scanner input = new Scanner(System.in);
		double[] data = new double[10];
		for (int i = 0;i < 10;i++)
		{
			data[i] = input.nextDouble();
		}
		double m = 0, a = 0, b, c;
		for (int i = 0;i < 10;i++)
		{
			m = m + data[i];
		}
		b = m * m / 10;
		m = m / 10.0;
		for (int i = 0;i < 10;i++)
		{
			a = a + data[i] * data[i];
		}
		c = Math.sqrt((a - b) / 9.0);
		System.out.println("The mean is " + m);
		System.out.println("The standard deviation is " + c);
	}
}
//求十个数的平均数与标准方差，运行后发现结果不对确实要一个一个找，绝对是很多细节没有注意的问题！