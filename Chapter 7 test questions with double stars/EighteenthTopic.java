package Chapter7TestQuestions;
import java.util.Scanner;
public class EighteenthTopic 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		System.out.print("Enter the 10 numbers you want to sort: ");
		Scanner input = new Scanner(System.in);
		double[] a = new double[30];
		int t = 0;
		for (t = 0;t < 10;t++)
		{
			a[t] = input.nextDouble();
		}
		double c;
		for (int i = 0;i < 10;i++)
		{
			for (int j = i;j < 10;j++)
			{
				if (a[j+1] > a[i])
				{
					c = a[i];
					a[i] = a[j+1];
					a[j+1] = c;
				}
			}
		}
		System.out.print("The number after the order is: ");
		for (t = 0;t < 10;t++)
		{
			System.out.printf("%.2f ",a[t]);
		}
	}
}
//����ð�����򷨽�������ע�����鲻ҪԽ�磬��Ŀ����Ҳ���Ͻ���ע��JAVA����lf