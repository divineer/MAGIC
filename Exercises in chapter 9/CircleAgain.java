package Chapter9Examples;

public class CircleAgain 
{
	double radius;
	
	static int numberOfObjects = 0; //������һ����̬��������̬����������ֵ�洢��һ���������ڴ��ַ
	//��Ϊ�ǹ�����ַ���������ĳһ�������޸��˾�̬������ֵ����ôͬһ��������ж��󶼻��ܵ�ӡ��
	
	CircleAgain()                   //��������ÿ��ʹ��CircleAgain����һ������ʱ��numberOfObjects����������Ϊ0��������ԭ�л����ϼ�
	{                               //��Ϊ���Ǿ�̬���������������µĴ������ı�
		radius = 1;
		numberOfObjects++;
	}
	
	CircleAgain(double newRadius)
	{
		radius = newRadius;
		numberOfObjects++;
	}
	
	static int getNumberOfObjects()  //����һ����̬������Math���е����з������Ǿ�̬�ģ�main����Ҳ�Ǿ�̬����
	{
		return numberOfObjects;      //��������һ�������˶��ٸ�����
	}
	
	double getArea()
	{
		return radius * radius * Math.PI;
	}
}
//��̬���������е����ж�����������̬�������ܷ������е�ʵ����Ա(��ʵ��������ͷ���)
//��֮ǰCircle���������radius��Ϊһ��ʵ��������ʵ���������������ĳ���ض�ʵ���ģ����ܱ�ͬһ����Ĳ�ͬ����������
//Ҫ����һ����̬��������һ����̬��������Ҫ����������򷽷��������м������η�static������̬����Ӧ������Ϊfinal static