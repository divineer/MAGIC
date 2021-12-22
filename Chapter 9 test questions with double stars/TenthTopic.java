package Chapter9TestQuestions;
import java.util.*;
public class TenthTopic 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		System.out.print("���������� a��b��c ����������ֵ�� ");
		Scanner input = new Scanner(System.in);
		int A, B, C;
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		QuadraticEquation test = new QuadraticEquation(A,B,C);
		System.out.print("�б�ʽ�Ľ���� " + test.getDiscriminant());
		System.out.println();
		if (test.getDiscriminant() > 0)
		{
			System.out.println("�÷��̵��������ֱ��� " + test.getRoot1() + " �� " + test.getRoot2());
		}
		if (test.getDiscriminant() == 0)
		{
			System.out.println("�÷��̵ĸ��� " + test.getRoot1());
		}
		if (test.getDiscriminant() < 0)
		{
			System.out.println("The equation has no roots");
		}
	}
}

class QuadraticEquation
{
	private int a, b, c;
	
	public QuadraticEquation(int A, int B, int C) //������������ú����������Ĺ��췽��
	{
		a = A;
		b = B;
		c = C;
	}
	public int getA(int A)                       //������������ܴ������л�ȡ���������ķ���
	{
		return a;
	}
	public int getB(int B)
	{
		return b;
	}
	public int getC(int C)
	{
		return c;
	}
	public double getDiscriminant()
	{
		return b * b - 4 * a * c;
	}
	public double getRoot1()
	{
		return ((-1 * b + Math.sqrt(getDiscriminant())) / (2 * a));
	}
	public double getRoot2()
	{
		return ((-1 * b - Math.sqrt(getDiscriminant())) / (2 * a));
	}
}