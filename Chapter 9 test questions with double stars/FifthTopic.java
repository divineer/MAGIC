package Chapter9TestQuestions;
import java.util.GregorianCalendar;
public class FifthTopic
{
	public static void main(String[] args)
	{
		GregorianCalendar g = new GregorianCalendar();  //��Ŀ����û�����Ը���������������Ҫʹ����ʱһ��Ҫ֪���������󣬲��к���Ĳ��裡
		System.out.println("��ǰ����������:");
		System.out.print(g.get(GregorianCalendar.YEAR)+ " " + g.get(GregorianCalendar.MONTH) + " " + g.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println();
		g.setTimeInMillis(1234567898765L);
		System.out.println("���ĺ����������:");
		System.out.print(g.get(GregorianCalendar.YEAR)+ " " + g.get(GregorianCalendar.MONTH) + " " + g.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
//����һ���޲θ���ʱ��ĺܷ�����࣡���Զ�ǣ�һ��Ҫ֪�����ȴ���������ʹ���෽����