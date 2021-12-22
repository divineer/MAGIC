package Chapter9Examples;

public class TestPassObject
{
	public static void main(String[] args) 
	{
		NewCircle myCircle = new NewCircle(1);
		int n = 5;
		printAreas(myCircle,n);
		
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);
	}
	
	public static void printAreas(NewCircle c, int times)
	{
		System.out.println("Radius \t\tArea");
		while (times >= 1)
		{
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}
}
//Java只有一个传递方式，那就是值传递，将对象的值传递给某个方法，这个值就是对该对象的引用值
//当传递的是基本数据类型的值时，传递的是实参，在另一函数内改变的是形参，实参的值并不会发生变化
//当传递的是引用类型的值时（也就是对象/指针），这就是对象的引用值，是会发生改变的，如果不想变首先得先赋值给其他变量
//一定要加以区分何时传递的是实参，何时传递的是引用值（指针/对象）
//引用上的按值传参在语义上最好描述为“按共享传参”，也就是说，在方法中引用的对象和传递的对象是一样的