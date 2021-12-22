package Chapter11Examples;

public class TestCircleRectangle
{
	public static void main(String[] args)
	{
		Circle circle = new Circle(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
		
		Rectangle rectangle = new Rectangle(2, 4);
		System.out.println("\nA rectangle " + circle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());
	}
}
//���ǲ������ǵ��ࣨ��������ࣩ�����Է�������ʵһֱ��main��������ͨ�õģ������ǵļ̳���������֮��Ĺ�ϵ�������һ�㣡
//Ҫ�ص�ȥ�����ڼ̳к͸��ӵļ���ע�������������Ҳ�������е���֮�䶼�ɴ���ĳһ�ָ��ӹ�ϵ�����Ǳ����й�ͬ�ĵط�
//Java���в�������ؼ̳У�һ��Java��ֻ����ֱ�Ӽ̳���һ�����ࣨ��һ�̳У�

//���췽�����ڹ���һ�����ʵ������ͬ�����Ժ���ͨ����������Ĺ��췽�����ᱻ����̳У�ֻ��ʹ�ùؼ��� super ������Ĺ��췽���е���
//���ø���Ĺ��췽���﷨�� super()�޲εĻ��� super(arguments)�вε�
//���Ǳ�����������๹�췽���ĵ�һ�У�������ʾ���ø��๹�췽����Ψһ��ʽ