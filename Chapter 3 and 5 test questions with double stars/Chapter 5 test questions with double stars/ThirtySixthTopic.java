package Chapter5TestQuestions;

import java.util.Scanner;

public class ThirtySixthTopic
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		Scanner input = new Scanner(System.in);
		String[] D = input.next().split("");       //�����ַ����鲢ֱ������
		int sum = 0;
		int a = 0;
		System.out.print("The ISBN-10 number is ");
		for (int i = 0;i < 9;i++)
		{
			sum += (Integer.valueOf(D[i])) * (i + 1);
			System.out.print(D[i]);
		}
		a = sum % 11;
		if(a == 10)
		{
			System.out.print("X");
		}
		else
		{
			System.out.print(a);
		}
	}
}
//����һ��û�пո�����֣������漰���ַ�����Ķ��壬�Լ����ʵ������������(û�пո��ʲô��)
//����֮��������������ͨ����������ת����int���ͣ���Ȼһֱ��char���Ͳ����Խ�������
//������ʵ����3.9������ѭ���򻯳��򣬵���Ҳ��֪������ѭ�����ַ�������ô������