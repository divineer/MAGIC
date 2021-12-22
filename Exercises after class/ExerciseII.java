package exercise;

import java.io.*;
import java.util.*;

//由控制台按照固定格式输入学生信息，包括学号、姓名、年龄信息，当输入的内容为exit退出
//将输入的学生信息分别封装到一个Student对象中，再将每个Student对象加入到一个集合中，要求集合中的元素按照年龄大小正序排序
//最后遍历集合，将集合中学生信息写入到记事本，每个学生数据占单独一行

//由题意可得我们需要用到TreeSet，它依赖于TreeMap,它当中的元素是有序的，而HashSet是无序的
//然后集合一共是有两类接口（Collections 和 Map），我们上个题用的就是Map接口，是双列集合，也就是键值对(也有两种，Hash和Set)
//那么我们该题使用的Collections接口是单列集合，分为List接口（元素可重复，分为ArrayList和LinkedList）和Set接口（元素不可重复，分为TreeSet和HashSet两种）两种
//要注意的是TreeSet和HashSet没有带索引的方法，不能使用普通for等遍历，而set集合可以使用迭代器遍历，这也是本题的核心（TreeSet比较器排序）

//TreeSet(){}  按照自然排序
//TreeSet(Comparator compartor){}  自定义比较器进行排序，很常用！了解自然排序的原理基础上进行重写！
//而自定义比较器的时候因为参数是一个接口！我们要使用接口的具体实现类！当然也可以使用匿名内部类，具体情况下会容易分析一些，经常使用的是匿名内部类！
//当然非匿名类的也不难，直接在那个具体实现类中重写

class Student
{
	private String number;   //学号
	private String name;    //姓名
	private int age;       //年龄
	
	//构造方法
	public Student() {}
	
	public Student(String number, String name, int age)
	{
		this.number = number;
		this.name = name;
		this.age = age;
	}
	
	//成员变量的访问器方法
	String get_number()
	{
		return this.number;
	}
	
	String get_name()
	{
		return this.name;
	}
	
	int get_age()
	{
		return this.age;
	}
	
	//成员变量的修改器方法
	void set_number(String number)
	{
		this.number = number;
	}
	
	void set_nam(String name)
	{
		this.name = name;
	}
	void set_age(int age)
	{
		this.age = age;
	}
}

public class ExerciseII
{

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException  //我们这里添加抛出声明，是因为下面文件的读取输入不写try结构
	{
		//匿名内部重写方式
		Set<Student> students = new TreeSet<Student>(new Comparator<Student>() {   
 
			@Override
			public int compare(Student o1, Student o2)
			{
				return o1.get_age() - o2.get_age();
			}
			
		});
		//对于原始排序，如果return的是-1则倒序录入集合，如果是1则正序录入集合，这里也正是利用了这一点
		//当然如果年龄相同按照姓名首字母大小排序的话那就要注意字母比较大小需要使用compareTo函数
		
		Scanner input = new Scanner(System.in);
		
/*		System.out.println("你想录入几个同学的信息？");
		int num = input.nextInt();
		
		for (int i = 0;i < num;i++)
		{
			System.out.println("请输入第" + (i + 1) +"个同学的信息：");
			System.out.print("姓名： ");
			String name = input.next();
			System.out.print("学号： ");
			String number = input.next();
			System.out.print("年龄： ");
			int age = input.nextInt();
			
			Student student = new Student(number, name, age);  //将输入的信息存放进一个Student对象中
			students.add(student);                            //将其添加到集合
		} 
*/
		//我们使用题目要求输入格式：
		System.out.println("请按照姓名、学号、年龄的顺序输入你要录入的学生信息，输入exit时结束");
		while (true)
		{
			String name = input.next();
			if (name.equals("exit") == true)              //字符串比较函数！
				break;
			String number = input.next();
			int age = input.nextInt();
			
			Student student = new Student(number, name, age);  //将输入的信息存放进一个Student对象中
			students.add(student);                             //将其添加到集合
		}
		
		//创建字符输入流
		FileWriter fw = new FileWriter("D:\\outputt.txt");
		//字符输出缓冲流
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(" 姓名       学号         年龄");
		bw.newLine();
		
		//将排序好的信息输入到指定文件中
		for (Student student : students)
		{
			bw.write(student.get_name() + "   " + student.get_number() + "   " + student.get_age()); //当然如果要写好看点还可以使用格式化字符输出
			
			bw.newLine();  //换行
		}
		bw.close(); //存储结束，释放资源
	}
}