package Chapter3TestQuestions;
import java.util.Scanner;
public class TwentyEighthTopic 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y- coordinates, width, and height: ");
		double x1 = input.nextDouble();	double y1 = input.nextDouble();
		double w1 = input.nextDouble(); double h1 = input.nextDouble();
		System.out.print("Enter r2's center x-, y- coordinates, width, and height: ");
		double x2 = input.nextDouble();	double y2 = input.nextDouble();
		double w2 = input.nextDouble(); double h2 = input.nextDouble();
		double x0 = Math.abs(x1 - x2);
		double y0 = Math.abs(y1 - y2);
		
		if ((x0 + w2 / 2) <= (w1 / 2) && (y0 + h2 / 2) <= (h1 / 2))    //这里多了等于号，下面那个可以用else if是因为如果没有相交那肯定不会有重叠
			System.out.println("r2 is inside r1");
		else if (((w1 - w2) / 2) < x0 && x0 <((w1 + w2) / 2) && ((h1 - h2) / 2) < y0 && y0 < ((h1 + h2) / 2))
			System.out.println("r2 overlaps r1");
		else
			System.out.println("r2 does not overlap r1");
	}
}
//解题突破口：1.一个矩形的中心（中心（x2,y2））在另一个（中心（x1,y1））之内：两个中心距离在x,y上的分量假设为x0,y0
//中心（x1,y1）的高度为h1、宽为w1，另一个中心也如此，则要满足条件，那么 (x0 + w2 / 2) < (w1 / 2) 且 (y0 + h2 / 2) < (h1 / 2)
//判断矩阵是否相交有很多种方法，比如左上顶点与右下顶点等等，但是因为涉及到中心，就想到数学上比较严格的一种判断方法，容易理解也易实现
//记下来！就是分别比较两个矩形的重心在x轴上和y轴方向上的距离与两个矩形的长或宽的一半的和的大小，若前者都比后者小则相交，也就是我们第一个判别条件（第一个判断在里面了  所以是变式）
//2.两矩阵重叠：((w1 - w2) / 2) < x0 <((w1 + w2) / 2) 且 ((h1 - h2) / 2) < y0 < ((h1 + h2) / 2)   也就是相交的情况，第一种是变式，是完全包含
//3.两矩阵相离：x0 > ((w1 + w2) / 2) 或 y0 > ((h1 + h2) / 2)
//可以看出这三个条件（实际上五种情况）都是围绕那个数学定理的展开并严格判断  记住就好了

//题目简化了，注意审题是判断第二个矩阵与第一个矩阵的关系，所以只有三种判别条件，且审完题干后要求的输出也只有三种：相交 重叠 相离  简化题意与代码！