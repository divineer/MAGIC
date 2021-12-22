package Chapter9Examples;

public class CircleAgain 
{
	double radius;
	
	static int numberOfObjects = 0; //定义了一个静态变量，静态变量将变量值存储在一个公共的内存地址
	//因为是公共地址，所以如果某一个对象修改了静态变量的值，那么同一个类的所有对象都会受到印象
	
	CircleAgain()                   //这样我们每次使用CircleAgain创建一个对象时，numberOfObjects都不会重置为0，而是在原有基础上加
	{                               //因为它是静态变量，不会随着新的创建而改变
		radius = 1;
		numberOfObjects++;
	}
	
	CircleAgain(double newRadius)
	{
		radius = newRadius;
		numberOfObjects++;
	}
	
	static int getNumberOfObjects()  //这是一个静态方法，Math类中的所有方法都是静态的，main方法也是静态方法
	{
		return numberOfObjects;      //返回我们一共创建了多少个对象
	}
	
	double getArea()
	{
		return radius * radius * Math.PI;
	}
}
//静态变量被类中的所有对象所共享。静态方法不能访问类中的实例成员(即实例数据域和方法)
//如之前Circle类的数据域radius称为一个实例变量，实例变量是属于类的某个特定实例的，不能被同一个类的不同对象所共享
//要声明一个静态变量或定义一个静态方法，就要在这个变量或方法的声明中加上修饰符static，而静态常量应该声明为final static