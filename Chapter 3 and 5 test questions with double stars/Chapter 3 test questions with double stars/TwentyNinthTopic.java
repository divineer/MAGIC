package Chapter3TestQuestions;
import java.util.Scanner;
public class TwentyNinthTopic
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1 = input.nextDouble(); double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble(); double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		
		double r = Math.abs(r1 - r2);
		double r0 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		if (r0 <= r)
			System.out.println("circle2 is inside circle 1");
		else if (r0 <= r1 + r2)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlap circle1");
	}
}
//如果两个圆心的距离<=|r1 - r2|,可以判断r2在r1内，如果两个圆心的距离<=r1 + r2,可以判断r2和r1重叠
//以上也是比较经典的数学判断方法，自己画画图也可以出来 记住了！（审题又只是判断r2与第一个圆的关系）