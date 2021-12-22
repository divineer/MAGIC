package Chapter11Examples;

public class CastingDemo
{
	public static void main(String[] args)
	{
		Object object1 = new Circle();     //Object ���������еĸ��࣬�����������壬��������ȴ������
		Object object2 = new Rectangle();  //ʹ������ʽת������ΪCircle��ʵ��Ҳ��Objectʵ�����Ͱ����������ͺ�
		
		displayObject(object1);   //ͨ������displayObject��������ʾ��Щ�������Ϣ
		displayObject(object2);
	}
	
	public static void displayObject(Object object)  //����һ��ͨ�ó�����Ƶ����ӣ�����ͨ������Object���κ�ʵ��������
	{
		if (object instanceof Circle)  //ֻ��Դ������Ŀ�����ʵ��ʱ���ܽ�������ת������ִ��ת��֮ǰʹ��instanceof��������ȷ��Դ�����Ƿ���Ŀ�����ʵ��
		{
			System.out.println("The circle area is " + ((Circle)object).getArea());  //�����Ա���ʲ�������.������������ת������������������λ��Ҫ��ȷ�����򱨴�
			System.out.println("The circle diameter is " + ((Circle)object).getDiameter());  //ʹ����ʽת����ת��ΪCircle���������÷���
		}
		else if (object instanceof Rectangle)
		{
			System.out.println("The rectangle area is " + ((Rectangle)object).getArea());
		}
	}
}
//�Ի�������ֵת����ͬ�ڶԶ������ý���ת����ת��һ����������ֵ����һ���µ�ֵ
//��ת��һ���������ò����ٴ���һ���µĶ���ͬ�ϣ����Ƕ���ָ��ͬһ������