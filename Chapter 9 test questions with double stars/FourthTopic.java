package Chapter9TestQuestions;
import java.util.Random;
public class FourthTopic
{
	public static void main(String[] args) 
	{
		Random ran = new Random(1000);                //设置random种子为1000
		for (int i = 0;i < 50;i++)
		{
			System.out.print(ran.nextInt(100) + " "); //随机生成0~100之间的数，没有规定就从零开始，括号里写终止的数字
		}
	}
}
//利用random类的nextInt生成50个随机数，知道怎么使用随机类对象！