package Chapter3TestQuestions;
import java.util.Scanner;
public class NineteenthTopic 
{
	public static void main(String[] args) 
	{
		System.out.print("Input 3 digits: ");
		Scanner input = new Scanner(System.in);
		String[] D = input.next().split(",");
		int c = 0;
		if ((Integer.valueOf(D[0]) + Integer.valueOf(D[1]) > Integer.valueOf(D[2])) && (Integer.valueOf(D[0]) + Integer.valueOf(D[2]) > Integer.valueOf(D[1])) && (Integer.valueOf(D[2]) + Integer.valueOf(D[1]) > Integer.valueOf(D[0])))
		{
			c = Integer.valueOf(D[0]) + Integer.valueOf(D[1]) + Integer.valueOf(D[2]);
		    System.out.println(c);
		}
		else
		    System.out.println("Your input is wrong!");
	}
}
//�������ж�������������ܷ���������β������ܳ����о�����һ��������Ѿ�ϰ�����ַ�������
//��������Կո�����������Ϊ�ո�Ҳ���ַ�����ʲô���Ժ���