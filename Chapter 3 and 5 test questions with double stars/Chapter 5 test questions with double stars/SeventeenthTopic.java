package Chapter5TestQuestions;
import java.util.Scanner;
public class SeventeenthTopic 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number of lines: ");
		int lines = input.nextInt();
		for (int i = 1;i <= lines;i++)
		{
			if (i != lines)
			{
			     for (int j = 1;j <= lines - i;j++)
			     {
				     System.out.print("  ");
			     }
			}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
			for (int b = i;b > 0;b--)
			{
				System.out.printf("%d ",b);
			}
			
			if(i >= 2)
			{
			    for (int c = 2;c <= i;c++)
			    {
			    	
				     System.out.printf("%d ",c);
			    }
			}
			
			System.out.println();
		}
	}
}
//�����Ŀ�Ĺؼ�����������˼·��һ��һ���������������ո����չ��ɣ�
//����ո�����������е����ֵ�1����˳ʽ��������պ�����������֮��Ŀո��ٸ������н��˼���޸�
//�������ֲ��ûţ�һ��Ҫ����˼·����ѧϰJAVA��printf��ʹ��