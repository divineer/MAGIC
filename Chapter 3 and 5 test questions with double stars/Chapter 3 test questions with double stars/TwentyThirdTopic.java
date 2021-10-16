package Chapter3TestQuestions;
import java.util.Scanner;
public class TwentyThirdTopic 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a point with two coordinates: ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		double distance1;
		double distance2;
		distance1 = Math.abs(x);
		distance2 = Math.abs(y);
		if (distance1 < 5 && distance2 < 2.5)
			System.out.print("Point (" + x + ", " + y + ") " + "is in the rectangle");
		else
			System.out.print("Point (" + x + ", " + y + ") " + "is not in the rectangle");
	}
}
//会调用数学函数，熟悉JAVA语法