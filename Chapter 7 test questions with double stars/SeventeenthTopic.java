package Chapter7TestQuestions;
import java.util.Scanner;
public class SeventeenthTopic
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numbers of students: ");
		int num = input.nextInt();
		int[] grade = new int[num + 10];
		String[] name = new String[num + 10];
		String c;
		int r;
		System.out.print("Enter the names of students: ");
		for (int i = 0;i < num;i++)
		{
			name[i] = input.next();
		}
		System.out.print("Enter the grades of students: ");
		for (int j = 0;j < num;j++)
		{
			grade[j] = input.nextInt();
		}
		for (int i = 0;i < num;i++)
		{
			for (int j = i;j < num;j++)
			{
				if (grade[j+1] > grade[i])
				{
					c = name[i];
					name[i] = name[j+1];
					name[j+1] = c;
					r = grade[i];
					grade[i] = grade[j+1];
					grade[j+1] = r;
				}
			}
		}
		for (int k = 0;k < num;k++)
		{
			System.out.printf("%s ",name[k]);
		}
	}
}
//����ѧ�������������Լ���Ӧ�ɼ�����ʵ��õ�Ӧ�����ýṹ����
//Ӧ��ע����ǱȽϴ�С���Ĳ������������ɼ�һ����Ҫ��Ӧ��������͵�Ÿ�������Ȼ�ɼ�һֱû��һֱ�����Ƚ�
//�ٴθ�ϰð�������Լ�ע�����鲻ҪԽ�磡����