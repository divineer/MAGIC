package Chapter9TestQuestions;
import java.util.*;
public class SixthTopic 
{
	public static void main(String[] args)   //巧妙利用了数组和随机类！记住如何使用，必须先创建对象再使用类方法！
	{
		StopWatch action = new StopWatch();  //使用类前必须定义类对象
		Random ran = new Random();           //没说要种子，使用类前必须定义类对象
		int[] a = new int[100000];
		for (int i = 0;i < 100000;i++)
		{
			a[i] = ran.nextInt(100000);
		}
		action.start();
		Arrays.sort(a);//无需我们自己写选择排序算法，数组类中就有，Java很方便，不像数据结构第一个实验，以后写之前先搜有没有这样的类方法！
		action.stop();
		System.out.println("这十万个数字进行选择排序执行的时间为 " + action.getElapesdTime() + " 毫秒");
	}
}
class StopWatch      //类中不能包含类，一定要写在外面！！
{
	private long startTime, endTime;
	
	public StopWatch()
	{
		startTime = System.currentTimeMillis();  //根据题意，弄一个无参构造方法，使用当前时间初始化startTime
	}
	//即我们创建一个这样的类对象我们就已经初始化时间了
	public void start()
	{
		startTime = System.currentTimeMillis();  //其实完全可以定义时就有了无需重置，但要按题意要求来
	}
	public void stop()
	{
		endTime = System.currentTimeMillis();
	}
	public long getElapesdTime()
	{
		return endTime - startTime;
	}
}