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
//这个题目就很清楚知道了原来一行输入空格的这种可以单个单个输入，因为Next嘛，像那种连起来的才需要用字符串数组 唉