package Chapter3TestQuestions;
import java.util.Scanner;
public class TwentySeventhTopic
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a point's x- and y- coordinates: ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		int a = 0, b = 0, c = 0;
		double l;
		if (x >= 0 && x <= 200)
			a = 1;
        if (y >= 0 && y <= 100)	
        	b = 1;
        
		l = y + 0.5 * x;
		if (l >=0 && l <=100)
			c = 1;
		if (a == 1 && b == 1 && c == 1)
			System.out.print("The point is in the triangle");
		else
			System.out.print("The point is not in the triangle");
	}
}
//�ж�������Ƿ��������������ͬ�ߵ�ֱ���������ڣ�Ҫ֪��ȫ����б�����
//1.x������0~200�� 2.y������0~100�� 
//3.�������200,0���ͣ�0,100����Ϊһ���ߣ���ֱ�ߵĽؾ�Ϊ100����ֱ��ƽ�Ƶ���������ϣ���ֱ�ߵĽؾ�Ӧ����0~100��
//���⣬���кܶ��ж��������ϲ����������������ֵ㣬����Ҫ�õ�ָ�������ȵȣ��Ƚϸ���