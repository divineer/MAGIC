package Chapter9Examples;

public class NewCircle
{
	private double radius = 1;
	private static int numberOfObjects = 0;
	
	public NewCircle()
	{
		numberOfObjects++;
	}
	
	public NewCircle(double newRadius)
	{
		radius = newRadius;
		numberOfObjects++;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double newRadius)       //Ϊ���������µİ뾶ֵ����Щ�����Ƕ�ȡ���޸İ뾶��Ψһ;��������ȫ��������η���radius����
	{
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	
	public double getArea()
	{
		return radius * radius * Math.PI;
	}

}
//����һ���µ�Բ�࣬�뾶����Ϊ˽�������򣬲�����صķ��������޸���
//�����ͱ����˶����ݵ�ֱ���޸ģ����Ϊ�������װ
//��˽���������ܱ�����Ӷ����˽�����������ʣ���Ҫ����һ�����������޸���������������һ�����������������ֵ