package Chapter3TestQuestions;

public class TwentyForthTopic 
{
	public static void main(String[] args)
	{
		//num��ֵ��Ӧ�ƵĴ�С��ͨ��stringת����color����ͨ��switchת��
		int num = (int)(Math.random() * 13 + 1);
		int color = (int)(Math.random() * 4);
		
		//��numת����string����
		String str_num;
		if (num == 1)
			str_num = "ACE";
		else if (num == 11)
			str_num = "Jack";
		else if (num == 12)
			str_num = "Queen";
		else if (num == 13)
			str_num = "King";
		else
			str_num = "" + num;      //������������Ͻ����о������ж������ĵĻ�Ҳ������switch
		
		//��colorת����string����
		String str_color;
		switch (color)
		{
		case 0:str_color = "Clubs";break;
		case 1:str_color = "Diamonds";break;
		case 2:str_color = "Heart";break;
		default:str_color = "Spades";break;   //���������default����Ϊ������ɵ��ĸ����϶��в��Ϲ淶�ģ�Ҳ����û�л�ɫ��
		}
		
		System.out.print("The card you picked is " + str_num + " of " + str_color);
	}
}
//�������ģ���Լ������ȡ����һ�������Ŀ��ƣ��ؼ�����֪�����������Ȼ����������ת��������Ҫ���ַ���
//�������Ļ�ǰ���Ǹ���Ϊ�Ͻ����ж�ȷʵ�ܺã���������ܷ��㣬��Ϊnum�������Ѿ������ˣ������ٷֿ����������ת���ͷ���ܶ࣬��ס��
//����������