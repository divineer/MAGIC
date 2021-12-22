package Chapter9Examples;

public class ChangeCircle {

	public static void main(String[] args) 
	{
		ChangeCircle circle1 = new ChangeCircle();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
		ChangeCircle circle2 = new ChangeCircle(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
		ChangeCircle circle3 = new ChangeCircle(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
		circle2.radius = 100;  /*如果是私有变量就只能用set函数再去改变值，一般都是设置私有变量用内部函数去改变*/
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
	}
double radius;
ChangeCircle()
{
	radius = 1;
}
ChangeCircle(double newRadius)
{
	radius = newRadius;
}
double getArea()
{
	return radius * radius * Math.PI;
}
}
/*这个就是把例一的两个类合并为一个类，直接就是不要最外面那个没有用的大类，直接将main方法包含在我们用到的类里面*/