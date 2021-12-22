package Chapter9Examples;

public class TestPassObject
{
	public static void main(String[] args) 
	{
		NewCircle myCircle = new NewCircle(1);
		int n = 5;
		printAreas(myCircle,n);
		
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);
	}
	
	public static void printAreas(NewCircle c, int times)
	{
		System.out.println("Radius \t\tArea");
		while (times >= 1)
		{
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}
}
//Javaֻ��һ�����ݷ�ʽ���Ǿ���ֵ���ݣ��������ֵ���ݸ�ĳ�����������ֵ���ǶԸö��������ֵ
//�����ݵ��ǻ����������͵�ֵʱ�����ݵ���ʵ�Σ�����һ�����ڸı�����βΣ�ʵ�ε�ֵ�����ᷢ���仯
//�����ݵ����������͵�ֵʱ��Ҳ���Ƕ���/ָ�룩������Ƕ��������ֵ���ǻᷢ���ı�ģ������������ȵ��ȸ�ֵ����������
//һ��Ҫ�������ֺ�ʱ���ݵ���ʵ�Σ���ʱ���ݵ�������ֵ��ָ��/����
//�����ϵİ�ֵ�������������������Ϊ���������Ρ���Ҳ����˵���ڷ��������õĶ���ʹ��ݵĶ�����һ����