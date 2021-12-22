package Chapter11Examples;

import java.util.ArrayList;  //ʹ��ǰһ��Ҫ�ȵ��� ArrayList��һ�ַ����Ͷ��󣬿������ڴ洢���޶������Ķ��󣬹涨���ͣ��ܰ���

public class TestArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> cityList = new ArrayList<String>();  //����һ���ַ������͵��б����洢����
		
		cityList.add("London"); //�����python�������ˣ��漸����ȥ
		cityList.add("Paris");
		cityList.add("Denver");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		
		System.out.println("List size? " + cityList.size());  //�ܷ���ĺ����⣬һ��Ҫ��ʹ�ã�
		System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
		System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
		System.out.println("Is the list empty? " + cityList.isEmpty());
		
		cityList.add(2, "Xian");
		cityList.remove("Miami");
		cityList.remove(1);       //��python���÷�����࣬��Ҫ�ǻ��ã�
		System.out.println(cityList.toString());
		
		for (int i = cityList.size() - 1; i >= 0; i--)
		{
			System.out.print(cityList.get(i) + " ");
		}
		System.out.println();
	                             //�����д��ʽҲҪ�������Ҫ�������ţ�
		ArrayList<Circle> list = new ArrayList<>();  //����һ��Circle��Ķ����б���ʵ�ⶼ�ǿ��Եģ������������Լ����ģ�
		
		list.add(new Circle(2));   //���ȥ�����;������Ƕ�������ͣ�û�д������� new һ��Ҳû�����⣡
		list.add(new Circle(3));
		
		System.out.println("The area of the circle? " + list.get(0).getArea()); //ע��������������ȡ�����Ԫ������ô�������ȼ���ͬ������
	}
}
//ע���鱾��ArrayList������Ĳ�ͬ��������һ�����ǣ��봴��һ���б������һ�����֣�����ʹ�� ArrayList<int> a = new ArrayList<>()
//��Ϊ�洢��ArrayList�е�Ԫ�ر�����һ�ֶ��󣬲���ʹ�����ֻ������ͣ���������������ArrayList��������