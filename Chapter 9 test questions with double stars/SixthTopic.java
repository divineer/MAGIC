package Chapter9TestQuestions;
import java.util.*;
public class SixthTopic 
{
	public static void main(String[] args)   //�������������������࣡��ס���ʹ�ã������ȴ���������ʹ���෽����
	{
		StopWatch action = new StopWatch();  //ʹ����ǰ���붨�������
		Random ran = new Random();           //û˵Ҫ���ӣ�ʹ����ǰ���붨�������
		int[] a = new int[100000];
		for (int i = 0;i < 100000;i++)
		{
			a[i] = ran.nextInt(100000);
		}
		action.start();
		Arrays.sort(a);//���������Լ�дѡ�������㷨���������о��У�Java�ܷ��㣬�������ݽṹ��һ��ʵ�飬�Ժ�д֮ǰ������û���������෽����
		action.stop();
		System.out.println("��ʮ������ֽ���ѡ������ִ�е�ʱ��Ϊ " + action.getElapesdTime() + " ����");
	}
}
class StopWatch      //���в��ܰ����࣬һ��Ҫд�����棡��
{
	private long startTime, endTime;
	
	public StopWatch()
	{
		startTime = System.currentTimeMillis();  //�������⣬Ūһ���޲ι��췽����ʹ�õ�ǰʱ���ʼ��startTime
	}
	//�����Ǵ���һ����������������Ǿ��Ѿ���ʼ��ʱ����
	public void start()
	{
		startTime = System.currentTimeMillis();  //��ʵ��ȫ���Զ���ʱ�������������ã���Ҫ������Ҫ����
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