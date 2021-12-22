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
//����ǵ��������ϸ�������CircleAgain����ѧϰʹ�þ�̬�����Լ���̬����
//��̬�����ͷ��������ڲ��������������·��ʣ�����Ϊ0�����Դ��������п���
//c1�е�ʵ������radius�޸�Ϊ9������仯����Ӱ��c2�е�ʵ�����������ֲ��Ǿ�̬�������˴˶���
//��Ȼ����ʹ��CircleAgain.getNumberOfObject()�滻��CircleAgain.numberOfObjects