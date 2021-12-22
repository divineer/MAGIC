package Chapter11Examples;

public class Circle extends GeometricObject   //这就是Circle类，要记住使用该语法继承我们需要的类
{
	private double radius;                    //然后就可以在该类里定义使用额外的和父类所有的东西
	
	public Circle() {}       //我们只是用了那个语法，实际上这还是Circle类，一定要写，不然无法引用
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	//我们在使用Circle类时也完全可以将颜色填充等等作为参数传入，因为它是子类，有继承关系
	public Circle(double radius, String color, boolean filled)
	{
		this.radius = radius;
		setColor(color);      //当然不能直接写 this.color = color 这样的，因为他们是私有变量
		setFilled(filled);    //可以任意使用父类的语法
	}
	
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
	public double getDiameter()
	{
		return 2 * radius;
	}
	public double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}
	public void printCircle()
	{
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}
}