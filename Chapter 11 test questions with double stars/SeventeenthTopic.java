package Chapter11TestQuestions;
import java.util.*;

//��һ���Ҫ��������һ������m��Ȼ���ҵ���С������n��ʹ��m * n��һ����ȫƽ����
//�������Ǹ�����ʾ����Ҫ���յ���Ϣ�ǣ�m��������С�����У������ִ���Ϊ����������������û���Ϊn
//��ô��������Ҫ�ҵľ���ȫ������С���ӣ�Ҳ�������������ӣ��������ܱ�3��30���������ܱ�3��3��2��5��������⣡
//Ȼ�����Ǽ�Ȼ�õĲ��������б���Ҫ����һϵ�������Լ����Եõ�n��ע��������棡
//�����������ڸ���Ҫѧϰ����֪ʶ��

public class SeventeenthTopic 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		int m = input.nextInt();
		int num = m;
		
		//��������������ҵ������������ӵģ��ؼ����� m /= i,����������ͼ�ס!
		int i = 2, j = 0;
		int[] data = new int[1000];
		while (true)
		{
			if (m % i == 0)
			{
				data[j] = i;   //�������������������������
				j++;
				m /= i;
			}
			else
			{
				i += 1;
			}
			if (m == 1)
				break;
		}
		
		//�������������n�ķ������������Ҫ���������������㡢�жϵȵ�
		int number = 1;
		for (int k = 0;k < j;k++)
		{
			int flag = 0;
			for (int h = 0;h < j;h++)
			{
				if (data[h] == data[k] && data[h] != 0)  //���Կ�֪����©���������
				{
					if (h != k)
					{
						data[h] = 0;   //��Ҫ���ж�Ԫ��Ҳ�����ˣ������Ϊ��
					}
					flag++;
				}
			}
			if (flag % 2 != 0)
			{
				number = number * data[k];
			}
		}
		
		System.out.println("The smallest number n for m * n to be a perfect square is " + number);
		System.out.print("m * n is " + num * number);
	}
}