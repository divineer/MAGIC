package Chapter11Examples;
import java.util.*;
public class MyStack 
{
	private ArrayList<Object> list = new ArrayList<>();
	
	public boolean isEmpty()   //listΪ˽�б���������Ҫ���������ⲿ���ʺ������Ժ��Լ�ע�⣡
	{
		return list.isEmpty();
	}
	
	public int getSize()
	{
		return list.size();
	}
	
	public Object peek()     //��ȡջ��Ԫ�ض���ɾ����
	{
		return list.get(getSize() - 1);
	}
	
	public Object pop()     //�Զ��׼����Ƕ������õ���ʲô���ͣ������������ʲô����
	                        //��������Ҫ��ʲô���ͣ�����Ҫ��ʲô����
	{
		Object o = list.get(getSize() - 1);  //���topָ�룬ֱ�ӻ�ȡ�����㣡
		list.remove(getSize() - 1);
		return o;           //���ر�ɾ��Ԫ��
	}
	
	public void push(Object o)
	{
		list.add(o);        //���б�ֱ����������ö࣬�Ҳ��ü�¼topָ��
	}
	
	@Override
	public String toString()  //����ʲô���ͷ���ʲô����
	{
		return "stack: " + list.toString();
	}
}
//���ǽ���һ���洢Ԫ��Ϊ�����ջ�࣬����ʹ��һ��ArrayList��ʵ��Stack,Ϊȫ��ʹ�ÿ��ǣ���Ϊ˽�б���
//