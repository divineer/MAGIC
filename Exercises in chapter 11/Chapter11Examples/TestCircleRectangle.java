package Chapter11Examples;

public class TestCircleRectangle
{
	public static void main(String[] args)
	{
		Circle circle = new Circle(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
		
		Rectangle rectangle = new Rectangle(2, 4);
		System.out.println("\nA rectangle " + circle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());
	}
}
//这是测试我们的类（父类和子类），可以发现类其实一直在main方法里面通用的，而我们的继承是类与类之间的关系，理解这一点！
//要重点去看关于继承和父子的几点注意事项和误区，也不是所有的类之间都可存在某一种父子关系，他们必须有共同的地方
//Java类中不允许多重继承，一个Java类只可能直接继承自一个父类（单一继承）

//构造方法用于构建一个类的实例，不同于属性和普通方法，父类的构造方法不会被子类继承，只能使用关键字 super 从子类的构造方法中调用
//调用父类的构造方法语法是 super()无参的或者 super(arguments)有参的
//他们必须出现在子类构造方法的第一行，这是显示调用父类构造方法的唯一方式