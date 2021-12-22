package Chapter9Examples;

public class TestCircleWithStaticMembers
{
	public static void main(String[] args) 
	{
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " + CircleAgain.numberOfObjects);
		CircleAgain c1 = new CircleAgain();
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
		CircleAgain c2 = new CircleAgain(5);
		c1.radius = 9;
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");
	}
}
//这个是调用我们上个创建的CircleAgain类来学习使用静态变量以及静态方法
//静态变量和方法可以在不创建对象的情况下访问，个数为0，可以从输出结果中看出
//c1中的实例变量radius修改为9，这个变化不会影响c2中的实例变量，它又不是静态变量，彼此独立
//当然可以使用CircleAgain.getNumberOfObject()替换掉CircleAgain.numberOfObjects