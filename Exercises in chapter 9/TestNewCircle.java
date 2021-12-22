package Chapter9Examples;

public class TestNewCircle
{
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		NewCircle myCircle = new NewCircle(5.0);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		System.out.println("The numbers of objects created is " + myCircle.getNumberOfObjects());
	}
}
//通过这个就很能明显地感知到私有变量被访问和使用的不同了，当然在类中没什么差别的
//再回到那个类看看numberOfObjects是怎么使用和变化的，创建新类是才增加，改变时不增加