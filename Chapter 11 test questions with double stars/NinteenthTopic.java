package Chapter11TestQuestions;
import java.util.*;
public class NinteenthTopic 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of objects: ");
		int num = input.nextInt();
		System.out.println();
		System.out.print("Enter the weights of the objects: ");
		int[] data = new int[100];
		int[] record = new int[100];
		for (int i = 0;i < num;i++)
		{
			data[i] = input.nextInt();   //��������˳�����η���
			record[i] = data[i];         //��һ����¼�����飬�����ʱ��ʹ��
		}
		
		//�Լ�д�������������䷨��û���õ�����ʲô�ģ����Ǹ��Ƚ����׺ܻ�����װ�����⣡
		for (int j = 0;j < num;j++)
		{
			for (int k = 0;k < j;k++) //�ҵ�data[j]������ӵ�������δ�������塱���������Ƿ�����������
			{
				if (data[k]+data[j] <= 10 && data[k] != 0)  //��Ҫ�����Ѿ����������
				{
					data[k] = data[j] + data[k]; //��ʱ�����Ѿ����£�����Ҫ������Ƿֿ������֣����Ծ�Ҫ����record
					data[j] = 0;
					break;                       //�ҵ���������ķ��������ģ��ҵ��˾�break
				}
			}
		}
		
		//����������׶���
		System.out.println();
		int g = 1;                 //��¼���Ӹ���
		for (int h = 0;h < num;h++)
		{
			if (data[h] != 0)
			{
				if (data[h] - record[h] != 0)    //���������Ҳ���������Щû���ҵ�������
				{
					System.out.print("Container " + g + " contains objects with weight "+ record[h] + " " + (data[h] - record[h]));
					System.out.println();
					g++;
				}
				else
				{
					System.out.print("Container " + g + " contains objects with weight "+ data[h]);
					System.out.println();
					g++;
				}
			}
		}
	}
}
//����һ����װ�����⣬������Ʒ��������Ʒ����������ÿ�����ӿ�װʮ���������������䷨�õ������Ӹ�����ÿ������װ����Ʒ����
//������������Ʒ������Ϊ����������7  5  2  3  5  8   //��ôӦ��װ�ĸ����ӣ�����Ϊ /7 2/3 5/5/8
//����Ҫ�˽�����������䷨�����ϵ�Ȼ�кིܶ�⻹�и��Ӹ��ӵ�ʲô��̬���䣬�����������ڵ��������ǾͰ�����������
//�������䷨��first fit,FF������Ʒ��1,2,3,��n��˳��װ�����ӡ��������Ӵ��������С�ÿ����Ʒi�����װ�����������������
//�������Ļ�Ҳ�ܽ���Ϊʲô�����Ǹ�����Ľ���������ģ��Ժ����������������䣡�������棬���������棬��⣡