package Chapter11TestQuestions;
import java.util.*;

//��Ŀ��Ҫ������д5-1��������������������������ĺͣ�����ظ�����Ҫ����ظ���Ϣ
//��Ŀ������ʾ�ǿ��Խ��Ѹ����Ĵ𰸷���һ�����������жϣ������������ס�ˣ�
public class SixteenthTopic
{
	public static void main(String[] args)
	{
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		
		int[] data = new int[100];
		int i = 0, flag = 0;
		int answer = input.nextInt();
		data[i] = answer;
		i++;
		
		while (number1 + number2 != answer)    //ʹ��ѭ���ķ��������������жϣ�����ܶ࣡Ҫ��ס������˼�룡
		{
			flag = 0;
			//�������Ҳ���Թ���Ҫһ�����������������ܷ���������ж��У�֪��while�Ĺ����Լ����ԣ�
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();  //��Ϊ����������Ҫ��������
			for (int j = 0;j < i;j++)
			{
				if (data[j] == answer)
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				data[i] = answer;
				i++;
			}
			if (flag == 1)
			{
				System.out.println("You already entered " + answer);
			}
		}
		
		System.out.println("You got it!");  //����һ��˵��������ȷ��ֱ���������
	}
}