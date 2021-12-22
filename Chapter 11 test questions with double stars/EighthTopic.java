package Chapter11TestQuestions;
import java.util.*;

class Transaction           //新创建一个类来辅佐具体交易信息（每一笔交易信息）
{
	private Date date;       //交易日期
	private char type;       //交易类型：W代表取款，D代表存款
	private double amount;   //交易量
	private double balance;  //交易后的新余额
	private String description;     //交易的描述
	
	public Transaction(Date date,char type,double balance,String description) 
	{
		this.date = date;
		this.type = type;
		this.balance = balance;
		this.description = description;
	}
	
	public Date get_date()          //以下是数据域的访问器和修改器
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
	private double balance = 0;     //表示余额
	private double annualInterestRate = 0;  //表示当前利率
	private Date dateCreated;   //表示开户日期
	String name;
	
	//创建一个ArrayList类型的数据域用来存储用户的每笔交易
	//写成这样的格式！每笔交易都是Transaction的一个实例，再继续了解ArrayList是用来存储对象的列表！
	ArrayList<Transaction> transaction = new ArrayList<Transaction>();   //有一个好处就是不限定空间
	
	public Account(){}          //一下都是构造方法，区别构造方法和方法的书写！
	
	public Account(int id, double balance, double annualInterestRate, String name)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.name = name;
		dateCreated = new Date();        //开户日期
	}
	
	public int get_id()                          //数据的访问
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
	
	public void set_id(int id)                   //数据的修改
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
	
	public double getMonthlyInterestRate()                     //返回月利率（以百分比的形式返回）
	{
		return annualInterestRate / 12;
	}
	public double getMonthlyInterest()
	{
		return balance * (annualInterestRate / 1200);          //返回月利息（年利率是以百分比的形式给出）
	}
	
	public void withDraw(double money)          //取出指定金额
	{
		Date date = new Date();        //注意这里开户日期和交易日期的区别
		Transaction test = new Transaction(date,'W',balance,"取出金额");  //我们之后要输出每笔交易信息，这些都要设置好
		test.set_amount(money);
		test.set_balance(balance-money);
		balance = balance - money;
		transaction.add(test);
	}
	public void deposit(double money)           //存入指定金额
	{
		Date date = new Date();
		Transaction test = new Transaction(date,'D',balance,"存入金额");  
		test.set_amount(money);
		test.set_balance(balance+money);
		balance = balance + money;
		transaction.add(test);
	}
}

//进行测试，建立账户并输出账户信息及所有交易记录
public class EighthTopic
{
	public static void main(String[] args)
	{
		Account a = new Account(1122, 1000, 1.5, "George");  //创建一个用户id、余额、年利率（百分比表示）和用户名称这样的账户
		a.deposit(30);
		a.deposit(40);
		a.deposit(50);     //依次向用户中存入30、40、50
		a.withDraw(5);
		a.withDraw(4);
		a.withDraw(2);       //依次向用户中取出5、4、2
		System.out.println("开户时间为：" + a.get_dateCreated());
		System.out.println("账户持有者：" + a.name + "       月利率是：" + a.getMonthlyInterestRate() + "       现有余额是：" + a.get_balance());
		System.out.println("以下是账户交易记录：");
		System.out.println("         交易时间                  交易行为         交易描述        交易金额         账户余额");
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
//这个题对类与类之间的使用以及ArrayList的使用比较灵活，掌握了还是很容易的！