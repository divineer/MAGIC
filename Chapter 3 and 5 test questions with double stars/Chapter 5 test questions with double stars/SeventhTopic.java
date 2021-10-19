package Chapter5TestQuestions;

public class SeventhTopic 
{
	public static void main(String[] args) 
	{
		double a = 10000;
		double b = 0;
		for (int i = 1;i <= 10;i++)
		{
			a = a * 1.05; 
		}
		System.out.println("The tuition fee in ten years is: " + a);
		for (int j = 1;j <= 4;j++)
		{
			a = a * 1.05;
			b = b + a;
		}
		System.out.println("The total tuition fee for four years is: " + b);
	}
}
//金融应用问题，计算将来的学费