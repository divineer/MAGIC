package Chapter3TestQuestions;
import java.util.Scanner;
public class TwentyEighthTopic 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y- coordinates, width, and height: ");
		double x1 = input.nextDouble();	double y1 = input.nextDouble();
		double w1 = input.nextDouble(); double h1 = input.nextDouble();
		System.out.print("Enter r2's center x-, y- coordinates, width, and height: ");
		double x2 = input.nextDouble();	double y2 = input.nextDouble();
		double w2 = input.nextDouble(); double h2 = input.nextDouble();
		double x0 = Math.abs(x1 - x2);
		double y0 = Math.abs(y1 - y2);
		
		if ((x0 + w2 / 2) <= (w1 / 2) && (y0 + h2 / 2) <= (h1 / 2))    //������˵��ںţ������Ǹ�������else if����Ϊ���û���ཻ�ǿ϶��������ص�
			System.out.println("r2 is inside r1");
		else if (((w1 - w2) / 2) < x0 && x0 <((w1 + w2) / 2) && ((h1 - h2) / 2) < y0 && y0 < ((h1 + h2) / 2))
			System.out.println("r2 overlaps r1");
		else
			System.out.println("r2 does not overlap r1");
	}
}
//����ͻ�ƿڣ�1.һ�����ε����ģ����ģ�x2,y2��������һ�������ģ�x1,y1����֮�ڣ��������ľ�����x,y�ϵķ�������Ϊx0,y0
//���ģ�x1,y1���ĸ߶�Ϊh1����Ϊw1����һ������Ҳ��ˣ���Ҫ������������ô (x0 + w2 / 2) < (w1 / 2) �� (y0 + h2 / 2) < (h1 / 2)
//�жϾ����Ƿ��ཻ�кܶ��ַ������������϶��������¶���ȵȣ�������Ϊ�漰�����ģ����뵽��ѧ�ϱȽ��ϸ��һ���жϷ������������Ҳ��ʵ��
//�����������Ƿֱ�Ƚ��������ε�������x���Ϻ�y�᷽���ϵľ������������εĳ�����һ��ĺ͵Ĵ�С����ǰ�߶��Ⱥ���С���ཻ��Ҳ�������ǵ�һ���б���������һ���ж���������  �����Ǳ�ʽ��
//2.�������ص���((w1 - w2) / 2) < x0 <((w1 + w2) / 2) �� ((h1 - h2) / 2) < y0 < ((h1 + h2) / 2)   Ҳ�����ཻ���������һ���Ǳ�ʽ������ȫ����
//3.���������룺x0 > ((w1 + w2) / 2) �� y0 > ((h1 + h2) / 2)
//���Կ���������������ʵ�����������������Χ���Ǹ���ѧ�����չ�����ϸ��ж�  ��ס�ͺ���

//��Ŀ���ˣ�ע���������жϵڶ����������һ������Ĺ�ϵ������ֻ�������б���������������ɺ�Ҫ������Ҳֻ�����֣��ཻ �ص� ����  ����������룡