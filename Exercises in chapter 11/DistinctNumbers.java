package Chapter11Examples;
import java.util.*;
public class DistinctNumbers
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();  //����һ���洢Integer�����ArrayList
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers (input ends with 0): ");
		int value;
		
		do  //��סdo-while�ṹ�Ǳ���ִ��һ�Σ������������ֵط����ʲ���
		{
			value = input.nextInt();
			
			if (!list.contains(value) && value != 0) //��ס���ѭ�����ִ�з�ʽ������һ��Ҫ�жϲ�����0
			{                                        //����ط�ֱ���ú����ж��Ƿ��������д�������鷽��ö࣬������������ĺô���
				list.add(value);
			}
		}while(value != 0);

		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
	}
}
//�ϸ�������д��ArrayList������Ĳ�ͬ�������ﲻ�ܴ���������ݣ����ܴ�����Ͷ���ʹ���б����򷽱�ö�
//ArrayLise��С�����ģ�������ǰ����������������ʱ���Ĵ�С�������