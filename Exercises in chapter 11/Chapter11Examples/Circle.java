package Chapter11Examples;

public class Circle extends GeometricObject   //�����Circle�࣬Ҫ��סʹ�ø��﷨�̳�������Ҫ����
{
	private double radius;                    //Ȼ��Ϳ����ڸ����ﶨ��ʹ�ö���ĺ͸������еĶ���
	
	public Circle() {}       //����ֻ�������Ǹ��﷨��ʵ�����⻹��Circle�࣬һ��Ҫд����Ȼ�޷�����
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	//������ʹ��Circle��ʱҲ��ȫ���Խ���ɫ���ȵ���Ϊ�������룬��Ϊ�������࣬�м̳й�ϵ
	public Circle(double radius, String color, boolean filled)
	{
		this.radius = radius;
		setColor(color);      //��Ȼ����ֱ��д this.color = color �����ģ���Ϊ������˽�б���
		setFilled(filled);    //��������ʹ�ø�����﷨
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