package Chapter5TestQuestions;

public class TwentySeventhTopic 
{
	public static void main(String[] args)
	{
		int a = 0, sum = 0;
		for (int i = 101;i <= 2100;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				System.out.print(i + " ");
				a++;
				sum ++;
			}
			if ((a % 10 == 0) && a != 0)
			{
				System.out.println();
				a = 0;
			}
		}
		System.out.println();
		System.out.print("The numbers of leap years between 101 and 2100 is " + sum);
	}
}
//���ָ�����֮���������ݲ��������
//��ͨ����ָ�ܱ�4���������ܱ�100��������ݣ���������ָ�ܱ�400���������