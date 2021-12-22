package Chapter11TestQuestions;
import java.util.*;

class Transaction           //�´���һ�������������彻����Ϣ��ÿһ�ʽ�����Ϣ��
{
	private Date date;       //��������
	private char type;       //�������ͣ�W����ȡ�D������
	private double amount;   //������
	private double balance;  //���׺�������
	private String description;     //���׵�����
	
	public Transaction(Date date,char type,double balance,String description) 
	{
		this.date = date;
		this.type = type;
		this.balance = balance;
		this.description = description;
	}
	
	public Date get_date()          //������������ķ��������޸���
	{
		return date;
	}
	public char get_type()
	{
		return type;
	}
	public double get_amount()
	{
		return amount;
	}
	public double get_balance()
	{
		return balance;
	}
	public String get_description()
	{
		return description;
	}
	
	public void set_type(char type)
	{
		this.type = type;
	}
	public void set_amount(double amount)
	{
		this.amount = amount;
	}
	public void set_balance(double balance)
	{
		this.balance = balance;
	}
	public void set_description(String description)
	{
		this.description = description;
	}
}

class Account
{
	
	private int id = 0;
	private double balance = 0;     //��ʾ���
	private double annualInterestRate = 0;  //��ʾ��ǰ����
	private Date dateCreated;   //��ʾ��������
	String name;
	
	//����һ��ArrayList���͵������������洢�û���ÿ�ʽ���
	//д�������ĸ�ʽ��ÿ�ʽ��׶���Transaction��һ��ʵ�����ټ����˽�ArrayList�������洢������б�
	ArrayList<Transaction> transaction = new ArrayList<Transaction>();   //��һ���ô����ǲ��޶��ռ�
	
	public Account(){}          //һ�¶��ǹ��췽���������췽���ͷ�������д��
	
	public Account(int id, double balance, double annualInterestRate, String name)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.name = name;
		dateCreated = new Date();        //��������
	}
	
	public int get_id()                          //���ݵķ���
	{
		return id;
	}
	public double get_balance()
	{
		return balance;
	}
	public double get_annualInterestRate()
	{
		return annualInterestRate;
	}
	public Date get_dateCreated()
	{
		return dateCreated;
	}
	
	public void set_id(int id)                   //���ݵ��޸�
	{
		this.id = id;
	}
	public void set_balance(double balance)
	{
		this.balance = balance;
	}
	public void set_annualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterestRate()                     //���������ʣ��԰ٷֱȵ���ʽ���أ�
	{
		return annualInterestRate / 12;
	}
	public double getMonthlyInterest()
	{
		return balance * (annualInterestRate / 1200);          //��������Ϣ�����������԰ٷֱȵ���ʽ������
	}
	
	public void withDraw(double money)          //ȡ��ָ�����
	{
		Date date = new Date();        //ע�����￪�����ںͽ������ڵ�����
		Transaction test = new Transaction(date,'W',balance,"ȡ�����");  //����֮��Ҫ���ÿ�ʽ�����Ϣ����Щ��Ҫ���ú�
		test.set_amount(money);
		test.set_balance(balance-money);
		balance = balance - money;
		transaction.add(test);
	}
	public void deposit(double money)           //����ָ�����
	{
		Date date = new Date();
		Transaction test = new Transaction(date,'D',balance,"������");  
		test.set_amount(money);
		test.set_balance(balance+money);
		balance = balance + money;
		transaction.add(test);
	}
}

//���в��ԣ������˻�������˻���Ϣ�����н��׼�¼
public class EighthTopic
{
	public static void main(String[] args)
	{
		Account a = new Account(1122, 1000, 1.5, "George");  //����һ���û�id���������ʣ��ٷֱȱ�ʾ�����û������������˻�
		a.deposit(30);
		a.deposit(40);
		a.deposit(50);     //�������û��д���30��40��50
		a.withDraw(5);
		a.withDraw(4);
		a.withDraw(2);       //�������û���ȡ��5��4��2
		System.out.println("����ʱ��Ϊ��" + a.get_dateCreated());
		System.out.println("�˻������ߣ�" + a.name + "       �������ǣ�" + a.getMonthlyInterestRate() + "       ��������ǣ�" + a.get_balance());
		System.out.println("�������˻����׼�¼��");
		System.out.println("         ����ʱ��                  ������Ϊ         ��������        ���׽��         �˻����");
		for (int i = 0;i < a.transaction.size();i++)
		{
			System.out.print(a.transaction.get(i).get_date());
			System.out.print("          ");
			System.out.print(a.transaction.get(i).get_type());
			System.out.print("            ");
			System.out.print(a.transaction.get(i).get_description());
			System.out.print("          ");
			System.out.print(a.transaction.get(i).get_amount());
			System.out.print("            ");
			System.out.print(a.transaction.get(i).get_balance());
			System.out.println();
		}
	}
}      
//������������֮���ʹ���Լ�ArrayList��ʹ�ñȽ��������˻��Ǻ����׵ģ�