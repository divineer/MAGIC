package Chapter11Examples;

public class CastingDemo
{
	public static void main(String[] args)
	{
		Object object1 = new Circle();     //Object 基本是所有的父类，可以这样定义，但反过来却不可以
		Object object2 = new Rectangle();  //使用了隐式转换，因为Circle的实例也是Object实例，就按父子来理解就好
		
		displayObject(object1);   //通过调用displayObject方法来显示这些对象的信息
		displayObject(object2);
	}
	
	public static void displayObject(Object object)  //这是一个通用程序设计的例子，可以通过传入Object的任何实例被调用
	{
		if (object instanceof Circle)  //只有源对象是目标类的实例时才能进行类型转换，在执行转换之前使用instanceof操作符来确保源对象是否是目标类的实例
		{
			System.out.println("The circle area is " + ((Circle)object).getArea());  //对象成员访问操作符‘.’优先于类型转换操作符，所以括号位置要明确，否则报错
			System.out.println("The circle diameter is " + ((Circle)object).getDiameter());  //使用显式转换来转换为Circle对象来引用方法
		}
		else if (object instanceof Rectangle)
		{
			System.out.println("The rectangle area is " + ((Rectangle)object).getArea());
		}
	}
}
//对基本类型值转换不同于对对象引用进行转换，转换一个基本类型值返回一个新的值
//而转换一个对象引用不会再创建一个新的对象，同上，他们都是指向同一个对象