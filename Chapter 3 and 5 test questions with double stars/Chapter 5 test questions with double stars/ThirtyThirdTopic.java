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
//������10000���ڵ�4����ȫ����д��ʱ��һ��Ҫע��ܶ�ܶ�ϸ�ڣ���Ȼ����ʱ������Լ�