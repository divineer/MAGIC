package exercise;

import java.util.*; //ʹ����Щ����Ҫ����ģ��!����������㣡

//ʹ�������ӳ���Ŷ��ͼ����Ϣ�������������������Ʒ���ԣ���ţ����ƣ����ۣ������磻ʹ����Ʒ�����Ϊӳ���е�key
//�����⣬����ʹ��HashMapʵ�������ӳ��Ĺ���

class Book
{
	//����Ʒ���Զ���Ϊ˽�б���
	private String num;              //���
	private String name;            //����
	private double money;          //����
	private String publication;   //������
	
	//���췽��
	public Book() {}
	
	public Book(String num, String name, double money, String publication)
	{
		this.num = num;
		this.name = name;
		this.money = money;
		this.publication = publication;
	}
	
	//��Ա�����ķ���������
	String get_num()
	{
		return num;
	}
	String get_name()
	{
		return name;
	}
	double get_money()
	{
		return money;
	}
	String get_publication()
	{
		return publication;
	}
	
	//��Ա�������޸�������
	void set_num(String num)
	{
		this.num = num;
	}
	void set_name(String name)
	{
		this.name = name;
	}
	void set_money(double money)
	{
		this.money = money;
	}
	void set_publication(String publication)
	{
		this.publication = publication;
	}
}

public class ExerciseI 
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		 //HashMap�̳���AbstractMap�࣬ʵ����Map�ӿ�,ʹ��ǰ�ǵõ���
		//����ʹ������ʵ�֣�����Ҳ���Իع�ArrayList��֪ʶ��������Ŷ���
		Map<String,Book> books = new HashMap<String,Book>();
		
		//�Զ���һЩͼ����Ϣ��Ž�ȥ����ȻҲ���Դ����µĿն��������û������ȥ��������Ŀ����Ҫ��
		//ʹ����Ʒ�����Ϊ��ֵ��ע��HashMap��������ļ�ֵ�ԣ����浱Ȼ�����Ǵ�ŵĶ���ͬʱ����������ԣ���⣡
		books.put("0001", new Book("0001","Forever Love!",99.99,"Beijing Publication"));
		books.put("0010", new Book("0010","Amazing Stories!",30.8,"HZNU Publication"));
		books.put("0100", new Book("0100","Come On Baby!",66,"ChangSha Publication"));
		books.put("1000", new Book("1000","Be Happines!",7.6,"JiaoZuo Publication"));
		books.put("0011", new Book("0011","Victory",134.7,"ShangHai Publication"));
		
		System.out.println("  ͼ����           ͼ������           ͼ�鵥��           ͼ�������");
		
		//ͨ��Iterator�������Key-value
		Iterator iter = books.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry entry = (Map.Entry)iter.next();
			System.out.printf("   %-18s%-19s%-15.2f%-15s",((Book)entry.getValue()).get_num() ,((Book)entry.getValue()).get_name(),((Book)entry.getValue()).get_money(),((Book)entry.getValue()).get_publication());
			System.out.println();
		}
	}
}

//�����������һ��Map(ӳ��ӿ�)��Map�д洢�������Ǽ�ֵ�ԣ�Mapӳ���в��ܰ����ظ��ļ���ÿ�������ֻ��ӳ�䵽һ��ֵ�������������ʵ��HashMap�ģ�