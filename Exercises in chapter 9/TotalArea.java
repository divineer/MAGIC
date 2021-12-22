package Chapter9Examples;

public class TotalArea
{
	public static void main(String[] args)
	{
		NewCircle[] circleArray;           //Declare circleArray
		circleArray = createCircleArray(); //Create circleArray
		printCircleArray(circleArray);     //Print circleArray and total areas of the circles
	}
	
	public static NewCircle[] createCircleArray()
	{
		NewCircle[] circleArray = new NewCircle[5];
		for (int i = 0;i < circleArray.length;i++)
		{
			circleArray[i] = new NewCircle(Math.random() * 100);
		}
		return circleArray;
	}
	
	public static void printCircleArray(NewCircle[] circleArray)
	{
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for (int i = 0;i < circleArray.length;i++)
		{
			System.out.printf("%-30s%-15f\n", circleArray[i].getRadius(),circleArray[i].getArea());
		}
		System.out.println("____________________________");
		//Compute and display the result
		System.out.printf("%-30s%-15f\n", "The total area of circles is",sum(circleArray));
	}
	
	public static double sum(NewCircle[] circleArray)
	{
		double sum = 0;
		for (int i = 0;i < circleArray.length;i++)
		{
			sum += circleArray[i].getArea();
		}
		return sum;
	}
}
//����ȿ��Դ洢��������ֵ��Ҳ���Դ洢���󣨴����������飩
//���������ʵ���������ñ��������飬��ʹ��new���������������������������е�ÿ��Ԫ�ض���Ĭ��ֵΪnull�����ñ���������
//��������д����������ε��ã����Ǵ����������飬��ôÿ������Ԫ�ض���һ���������Ǵ��ν�ȥ�Ǵ�һ���������飬���Զ��嶼����NewCirce[]
//�������Ǵ����������黹�����˺����Է��㿴������������ԭ����ʵ����ֱ��д�� NewCircle[] circleArray = new NewCircle[5],����forѭ����������