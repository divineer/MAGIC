package Chapter9Examples;
import java.util.Scanner;
import javafx.geometry.Point2D; //引入Point2D类
public class TestPoint2D
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter point1's x-, y-coordinates: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter point2's x-, y-coordinates: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		Point2D p1 = new Point2D(x1, y1); //用给定的x和y坐标来创建一个Point2D对象
		Point2D p2 = new Point2D(x2, y2);
		System.out.println("p1 is " + p1.toString()); //返回该点的字符串表示
		System.out.println("p2 is " + p2.toString());
		System.out.println("The distance between p1 and p2 is " + p1.distance(p2));//返回两个点的距离
		System.out.println("The midpoint between p1 and p2 is " + p1.midpoint(p2).toString());//返回两个点的中点
	}
}
//java的类包中有一个便于使用的Point2D类，用于表示二维平面上的点，该类中还包含许多方法，我们用这个来实现
//还有getX()和getY()函数等等
//因为这里我们不能导入这个类，可以去把老师发群里的文件弄一下