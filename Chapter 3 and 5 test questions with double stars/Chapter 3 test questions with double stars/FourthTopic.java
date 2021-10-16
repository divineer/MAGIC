package Chapter3TestQuestions;
import java.util.*;
public class FourthTopic
{
	public static void main(String[] args) 
	{
		int num;
		Random r = new Random();
		num = r.nextInt(12) + 1;
		switch (num)
		{
		case 1:System.out.println("January");break;
		case 2:System.out.println("February");break;
		case 3:System.out.println("March");break;
		case 4:System.out.println("April");break;
		case 5:System.out.println("May");break;
		case 6:System.out.println("June");break;
		case 7:System.out.println("July");break;
		case 8:System.out.println("August");break;
		case 9:System.out.println("September");break;
		case 10:System.out.println("October");break;
		case 11:System.out.println("November");break;
		case 12:System.out.println("December");break;
		}
	}
}
//此为3.4测试题，学会随机生成整数的方法并运用switch语句