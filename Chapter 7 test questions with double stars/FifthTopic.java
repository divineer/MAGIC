package Chapter7TestQuestions;
import java.util.Scanner;
public class FifthTopic 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int[] num = new int[10];
		int[] newnum = new int[10];
		int t = 0, b = 0;
		while(t < 10)
		{
			int a = input.nextInt();
			num[t] = a;
			t++;
		}
		for (int i = 0;i < 10;i++)
		{
			int s = 0;
			for (int j = 0;j < 10;j++)
			{
				if (num[i] == newnum[j])
				{
					s = 1;
				}
			}
			if (s == 0)
			{
				newnum[b] = num[i];
				b++;
			}
		}
		System.out.printf("The number of distinct numbers is %d\n",b);  //��Ϊ���������ɺ�b++�ˣ����
		System.out.print("The distinct numbers are ");
		for (int k = 0;k < b;k++)
		{
			System.out.printf("%d ",newnum[k]);
		}
	}
}
//����ʮ�����֣��ж���ʮ������������������м������ٰ�˳��������������
//����ľ��������뵽�ٽ�һ���µ����飬������������֮ǰû��������֣�����ȥ������Ѿ����������
//��������������ʡȥ���ж����Ƿ���ԭ���Ǹ��������ظ����ظ���Ҫ��ô��¼��ôɾ�����ظ����ٴ������ģ�ֱ�Ӱ������Ž�����ѧ�ᣡ��