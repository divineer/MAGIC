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
		circle2.radius = 100;  /*�����˽�б�����ֻ����set������ȥ�ı�ֵ��һ�㶼������˽�б������ڲ�����ȥ�ı�*/
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
/*������ǰ���һ��������ϲ�Ϊһ���ֱ࣬�Ӿ��ǲ�Ҫ�������Ǹ�û���õĴ��ֱ࣬�ӽ�main���������������õ���������*/