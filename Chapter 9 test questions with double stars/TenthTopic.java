package Chapter9TestQuestions;
import java.util.*;
public class TenthTopic 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		System.out.print("请依次输入 a、b、c 三个整数的值： ");
		Scanner input = new Scanner(System.in);
		int A, B, C;
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		QuadraticEquation test = new QuadraticEquation(A,B,C);
		System.out.print("判别式的结果是 " + test.getDiscriminant());
		System.out.println();
		if (test.getDiscriminant() > 0)
		{
			System.out.println("该方程的两个根分别是 " + test.getRoot1() + " 和 " + test.getRoot2());
		}
		if (test.getDiscriminant() == 0)
		{
			System.out.println("该方程的根是 " + test.getRoot1());
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
	
	public QuadraticEquation(int A, int B, int C) //依题意必须设置含三个参数的构造方法
	{
		a = A;
		b = B;
		c = C;
	}
	public int getA(int A)                       //依题意必须有能从外类中获取三个参数的方法
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