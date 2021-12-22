package Chapter9TestQuestions;
import java.util.Date;
public class ThirdTopic
{
	public static void main(String[] args)
	{
		Date d1 = new Date(10000);
		System.out.println(d1.toString());
		
		Date d2 = new Date(100000);
		System.out.println(d2.toString());
		
		Date d3 = new Date(1000000);
		System.out.println(d3.toString());
		
		Date d4 = new Date(10000000);
		System.out.println(d4.toString());
		
		Date d5 = new Date(100000000);
		System.out.println(d5.toString());
		
		Date d6 = new Date(1000000000);
		System.out.println(d6.toString());
		
		Date d7 = new Date(1000000000L);        //超出int型数据范围，加上L表示一个0代表long long
		System.out.println(d7.toString());
		
		Date d8 = new Date(10000000000L);
		System.out.println(d8.toString());
	}
}
//编写程序创建一个Date对象并赋值，以当中的toString函数输出