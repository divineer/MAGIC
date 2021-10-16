package Chapter3TestQuestions;

public class TwentyForthTopic 
{
	public static void main(String[] args)
	{
		//num的值对应牌的大小，通过string转化，color可以通过switch转化
		int num = (int)(Math.random() * 13 + 1);
		int color = (int)(Math.random() * 4);
		
		//将num转换成string类型
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
			str_num = "" + num;      //可能这个更加严谨？感觉不用判断其他的的话也可以用switch
		
		//将color转化成string类型
		String str_color;
		switch (color)
		{
		case 0:str_color = "Clubs";break;
		case 1:str_color = "Diamonds";break;
		case 2:str_color = "Heart";break;
		default:str_color = "Spades";break;   //这里必须有default，因为随机生成的四个数肯定有不合规范的，也就是没有花色的
		}
		
		System.out.print("The card you picked is " + str_num + " of " + str_color);
	}
}
//这个题是模拟自己随机抽取到了一张怎样的卡牌，关键在于知道产生随机数然后将这个随机数转换成我们要的字符串
//最后输出的话前面那个更为严谨的判断确实很好，这样输出很方便，因为num的类型已经定义了，不能再分开输出，这样转换就方便很多，记住！
//深刻理解题意