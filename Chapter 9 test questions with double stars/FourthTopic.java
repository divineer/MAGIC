package Chapter9TestQuestions;
import java.util.Random;
public class FourthTopic
{
	public static void main(String[] args) 
	{
		Random ran = new Random(1000);                //����random����Ϊ1000
		for (int i = 0;i < 50;i++)
		{
			System.out.print(ran.nextInt(100) + " "); //�������0~100֮�������û�й涨�ʹ��㿪ʼ��������д��ֹ������
		}
	}
}
//����random���nextInt����50���������֪����ôʹ����������