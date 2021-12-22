package Chapter9TestQuestions;
import java.util.GregorianCalendar;
public class FifthTopic
{
	public static void main(String[] args)
	{
		GregorianCalendar g = new GregorianCalendar();  //题目里面没有明显给出，但当我们需要使用类时一定要知道创建对象，才有后面的步骤！
		System.out.println("当前的年月日是:");
		System.out.print(g.get(GregorianCalendar.YEAR)+ " " + g.get(GregorianCalendar.MONTH) + " " + g.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println();
		g.setTimeInMillis(1234567898765L);
		System.out.println("更改后的年月日是:");
		System.out.print(g.get(GregorianCalendar.YEAR)+ " " + g.get(GregorianCalendar.MONTH) + " " + g.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
//这是一个无参给出时间的很方便的类！可以多记！一定要知道得先创造对象才能使用类方法！