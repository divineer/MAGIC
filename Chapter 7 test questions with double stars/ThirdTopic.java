package Chapter7TestQuestions;
import java.util.Scanner;
public class ThirdTopic 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int[] Digits = new int[10000];
		int t = 0;
		while (true)
		{
			int a= input.nextInt();
			if(a==0)
				break;
			Digits[t] =a;
			t++;
		}
		for (int j = 0;j < t;j++)
		{
			int sum = 0;
			for (int k = 0;k < t;k++)
			{
				if (Digits[j] == Digits[k])
				{
					sum = sum + 1;
					if (j != k)
					    Digits[k] = 0;
				}
			}
			if (sum > 1 && Digits[j] != 0)
				System.out.printf("%d occurs %d times\n",Digits[j],sum);
			if (sum == 1 && Digits[j] != 0)
				System.out.printf("%d occurs %d time\n",Digits[j],sum);
		}
	}
}
//����һ��������0���������ж��⴮������ÿ�����ֳ����˼���
//�������������⣬��ȫ���������ַ�����������һ���Ե�ֻ����for,���������жϣ�whileҲ�ܲ�����
//�������Ҫ��취��ô���ظ���������ֲ��ٶ�������ע��ܶ�ϸ�ڵĵط�����֪���ַ������Լ�Ҫ�뵽��