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
//判断这个点是否在这个与坐标轴同边的直角三角形内，要知道全面的判别条件
//1.x坐标在0~200内 2.y坐标在0~100内 
//3.如果将（200,0）和（0,100）作为一条线，该直线的截距为100，将直线平移到该坐标点上，此直线的截距应该在0~100内
//另外，还有很多判断坐标轴上不规则三角形内这种点，就需要用到指针向量等等，比较复杂