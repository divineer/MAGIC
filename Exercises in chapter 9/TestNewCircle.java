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
//ͨ������ͺ������Եظ�֪��˽�б��������ʺ�ʹ�õĲ�ͬ�ˣ���Ȼ������ûʲô����
//�ٻص��Ǹ��࿴��numberOfObjects����ôʹ�úͱ仯�ģ����������ǲ����ӣ��ı�ʱ������