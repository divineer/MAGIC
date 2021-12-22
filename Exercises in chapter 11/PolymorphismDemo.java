package Chapter11Examples;

public class PolymorphismDemo
{
	public static void main(String[] args) 
	{
		displayObject(new Circle(1, "red", false));
		displayObject(new Rectangle(1, 1, "black", true));
	}
	
	//������ GeometricObject ���͵Ĳ���������ͨ����������һ��������͵�ʵ��(��������������new)������display
	public static void displayObject(GeometricObject object)  //�ؼ���������������ͣ���Ϊʲô����ֱ�����������壡����˵�Ǻ�����
	{
		System.out.println("Created on " + object.getDateCreated() + " color is " + object.getColor());
	}
	//�����������˸����͵ı�����color�ȣ��������������͵Ķ��������ﴴ������������
}
//������������Ƶ�����֧���Ƿ�װ���̳кͶ�̬���̳й�ϵʹһ�������ܼ̳и���������Ҹ���һЩ������
//���������ĸ�������⻯��ÿ�������ʵ�������丸���ʵ�������Ƿ�����������
//����ʹ�ö�̬�������ʵ��������Ҫ�����͵Ĳ�������̬��ζ�� !! �����͵ı����������������͵Ķ��� !!