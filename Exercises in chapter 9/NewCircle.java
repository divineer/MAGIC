package Chapter9Examples;

public class NewCircle
{
	private double radius = 1;
	private static int numberOfObjects = 0;
	
	public NewCircle()
	{
		numberOfObjects++;
	}
	
	public NewCircle(double newRadius)
	{
		radius = newRadius;
		numberOfObjects++;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double newRadius)       //为对象设置新的半径值，这些方法是读取和修改半径的唯一途径，就完全控制了如何访问radius属性
	{
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	
	public double getArea()
	{
		return radius * radius * Math.PI;
	}

}
//创建一个新的圆类，半径设置为私有数据域，并有相关的访问器和修改器
//这样就避免了对数据的直接修改，这称为数据域封装
//而私有数据域不能被对象从定义该私有域的类外访问，故要设置一个访问器和修改器，还可以设置一个方法返回数据域的值