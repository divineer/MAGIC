package Chapter11Examples;

public class PolymorphismDemo
{
	public static void main(String[] args) 
	{
		displayObject(new Circle(1, "red", false));
		displayObject(new Rectangle(1, 1, "black", true));
	}
	
	//它具有 GeometricObject 类型的参数，可以通过传递任意一个这个类型的实例(如程序里的那两个new)来调用display
	public static void displayObject(GeometricObject object)  //关键是这个参数的类型！！为什么可以直接用类名定义！还是说是函数！
	{
		System.out.println("Created on " + object.getDateCreated() + " color is " + object.getColor());
	}
	//这样就做到了父类型的变量（color等）可以引用子类型的对象（如这里创建的两个对象）
}
//面向对象程序设计的三大支柱是封装、继承和多态，继承关系使一个子类能继承父类的特征且附加一些新特征
//子类是它的父类的特殊化，每个子类的实例都是其父类的实例，但是反过来不成立
//可以使用多态将子类的实例传给需要父类型的参数，多态意味着 !! 父类型的变量可以引用子类型的对象 !!