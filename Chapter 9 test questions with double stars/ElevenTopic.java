package Chapter9TestQuestions;
import java.util.*;
public class ElevenTopic
{
	public static void main(String[] args)
	{
		System.out.print("请依次输入线性方程的 a、b、c、d、e、f 值：");
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble(), B = input.nextDouble(), C = input.nextDouble(), D = input.nextDouble(), E = input.nextDouble(), F = input.nextDouble();
		LinearEquation test = new LinearEquation(A,B,C,D,E,F);
		if (test.isSolvable() == 0)
		{
			System.out.println("The equation has no solution");
		}
		else
		{
			System.out.println("X 的值为 " + test.getX() + "\nY 的值为 " + test.getY());
		}
	}
}
class LinearEquation
{
	private double a, b, c, d, e, f;
	public LinearEquation(double a2, double b2, double c2, double d2, double e2, double f2)
	{
		a = a2;
	    b = b2;
	    c = c2;
	    d = d2;
	    e = e2;
	    f = f2;
	}
	public double getA()
	{
		return a;
	}
	public double getB()
	{
		return b;
	}
	public double getC()
	{
		return c;
	}
	public double getD()
	{
		return d;
	}
	public double getE()
	{
		return e;
	}
	public double getF()
	{
		return f;
	}
	public int isSolvable()
	{
		if (a * d - b * c != 0)
		{
			return 1;
		}
		else
			return 0;
	}
	public double getX()
	{
		return ((e * d - b * f) / (a * d - b * c));
	}
	public double getY()
	{
		return ((a * f - e * c) / (a * d - b * c));
	}
}