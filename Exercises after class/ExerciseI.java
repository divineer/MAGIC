package exercise;

import java.util.*; //使用这些都需要导入模块!用正则更方便！

//使用链表和映射存放多个图书信息，遍历并输出。其中商品属性：编号，名称，单价，出版社；使用商品编号作为映射中的key
//由题意，我们使用HashMap实现链表和映射的功能

class Book
{
	//将商品属性定义为私有变量
	private String num;              //编号
	private String name;            //名称
	private double money;          //单价
	private String publication;   //出版社
	
	//构造方法
	public Book() {}
	
	public Book(String num, String name, double money, String publication)
	{
		this.num = num;
		this.name = name;
		this.money = money;
		this.publication = publication;
	}
	
	//成员变量的访问器方法
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
	
	//成员变量的修改器方法
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
		 //HashMap继承于AbstractMap类，实现了Map接口,使用前记得导入
		//我们使用链表实现，这里也可以回顾ArrayList的知识，用来存放对象！
		Map<String,Book> books = new HashMap<String,Book>();
		
		//自定义一些图书信息存放进去，当然也可以创建新的空对象，引导用户输入进去，这里题目不做要求
		//使用商品编号作为键值，注意HashMap就是无序的键值对！后面当然是我们存放的对象，同时输入对象属性，理解！
		books.put("0001", new Book("0001","Forever Love!",99.99,"Beijing Publication"));
		books.put("0010", new Book("0010","Amazing Stories!",30.8,"HZNU Publication"));
		books.put("0100", new Book("0100","Come On Baby!",66,"ChangSha Publication"));
		books.put("1000", new Book("1000","Be Happines!",7.6,"JiaoZuo Publication"));
		books.put("0011", new Book("0011","Victory",134.7,"ShangHai Publication"));
		
		System.out.println("  图书编号           图书名称           图书单价           图书出版社");
		
		//通过Iterator遍历输出Key-value
		Iterator iter = books.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry entry = (Map.Entry)iter.next();
			System.out.printf("   %-18s%-19s%-15.2f%-15s",((Book)entry.getValue()).get_num() ,((Book)entry.getValue()).get_name(),((Book)entry.getValue()).get_money(),((Book)entry.getValue()).get_publication());
			System.out.println();
		}
	}
}

//这里着重理解一下Map(映射接口)，Map中存储的内容是键值对，Map映射中不能包含重复的键，每个键最多只能映射到一个值，本题中是如何实现HashMap的！