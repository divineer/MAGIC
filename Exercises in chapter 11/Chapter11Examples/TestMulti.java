package Chapter11Examples;

public class TestMulti
{
	public static void main(String[] args) 
	{
			// ������̬�������
			Fu f= new Zi() ;      //��Ȼ�Ǹ������ã�Fu�� ָ�� ������������ new Zi()��
			                     //���뿴��ߣ�ֻҪ���õĹ��ܣ������Ǹ����ṩ�ġ�
			                    //���п��ұߣ���ָ�����˷�����д��ʹ���ұߵ�Ҳ��������ķ�����
			
			//��������෽����ʹ�ã�һ����ʹ�ø����(��������)�����ǣ����������ڿ�����д������������ķ����壡
			f.study();         //��������"�Ұ�java"����⣡
			
			//��Ա������ʹ�ã�һ����ʹ�ø���ģ����ڲ�������д������ִ�е�Ҳ�Ǹ���ġ�
			System.out.println( f.name );    // ������jack��
			
			//��̬���������Դ�����д�� �C �����ԣ�����
		   //���ھ�̬��Դ������������д������ֱ��ִ�и���ķ��������ͷ����塣��ʹ������һ���͸���һģһ���ķ���Ҳ������д������
			f.play();          //�����������������桱
	}
}

class Fu
{
	String name = "Jack" ;
    public void study() 
    {
		System.out.println("�ְ�����ѧϰ");
	}
	static public void play()   //ע�����֣�����һ����̬�������С�static���ؼ���
	{
		System.out.println("�ְ��������");
	}
}

class Zi extends Fu          //��̬ǰ��һ�������̳й�ϵ�������ýӿ�ʵ��Ҳ�У�
{
	String name = "xiongda"; //��Ա�����޷���д��

	public void study()     //��̬ǰ������������������д
	{
		System.out.println("�Ұ�java");
	}
	static public void play() //������������еģ�������д����Ϊ�����ж�����Ǿ�̬����
	{
	    System.out.println("�����������");
	}
}