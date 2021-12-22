package Chapter11Examples;

public class DynamicBindingDemo  //ִ������
{
	public static void main(String[] args)
	{
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());       //������ɵ�Object�������toString��û�иı䣬ֻ�����������汻��д�ˣ�û������
	}
	
	public static void m(Object x)
	{
		System.out.println(x.toString());
	}
}

//�൱Ȼ��Ҫ�������������
class Person extends Object
{
	@Override                   //��д����ǰ��������һ���������Ͻ����������û�еõ���д��ᱨ���ṩ��д�ı��
	public String toString()
	{
		return "Person";
	}
}

class Student extends Person    //��Ȼ�̳��Ը���Person�����Ǻ���������д�˸���ķ�����������Ĳ�û���ܵ�Ӱ��
{
	@Override
	public String toString()
	{
		return "Student";
	}
}

class GraduateStudent extends Student{}   //�Ǿ���ȫ�̳и����ˣ��õ��Ǹ���ĺ������ʸ�����Student���һ������ס��
//��ʱ�����Ǻܶຯ�����涼û����д�����ˣ����Զ�����ȫ�̳��Ը���ģ�Ĭ��ΪObject������㲻Ҫ���ǣ���Ҫ��������Ӧ����

//����������˵����̬������һ��֪ʶ�㣬ֻ�ܼ̳�һ�����࣬������ͨ����̬��ȥ���������ã���̬������˵������������ʵ�����͵Ĳ�ͬ��