package Chapter3TestQuestions;
import java.util.Scanner;
public class TwentySecondTopic 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a point with two coordinates: ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		double distance;
		distance = Math.sqrt((x * x) + (y * y));
		if (distance > 10)
			System.out.print("Point (" + x + ", " + y + ") " + "is not in the circle");
		else
			System.out.print("Point (" + x + ", " + y + ") " + "is in the circle");
	}
}
//�����Ŀ�ͺ����֪����ԭ��һ������ո�����ֿ��Ե����������룬��ΪNext��������������Ĳ���Ҫ���ַ������� ��