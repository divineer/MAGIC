package Chapter9Examples;

public class TotalArea
{
	public static void main(String[] args)
	{
		NewCircle[] circleArray;           //Declare circleArray
		circleArray = createCircleArray(); //Create circleArray
		printCircleArray(circleArray);     //Print circleArray and total areas of the circles
	}
	
	public static NewCircle[] createCircleArray()
	{
		NewCircle[] circleArray = new NewCircle[5];
		for (int i = 0;i < circleArray.length;i++)
		{
			circleArray[i] = new NewCircle(Math.random() * 100);
		}
		return circleArray;
	}
	
	public static void printCircleArray(NewCircle[] circleArray)
	{
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for (int i = 0;i < circleArray.length;i++)
		{
			System.out.printf("%-30s%-15f\n", circleArray[i].getRadius(),circleArray[i].getArea());
		}
		System.out.println("____________________________");
		//Compute and display the result
		System.out.printf("%-30s%-15f\n", "The total area of circles is",sum(circleArray));
	}
	
	public static double sum(NewCircle[] circleArray)
	{
		double sum = 0;
		for (int i = 0;i < circleArray.length;i++)
		{
			sum += circleArray[i].getArea();
		}
		return sum;
	}
}
//数组既可以存储基本类型值，也可以存储对象（创建对象数组）
//对象的数组实际上是引用变量的数组，当使用new操作符创建对象数组后，这个数组中的每个元素都是默认值为null的引用变量（对象）
//在类里面写多个方法依次调用，我们创建对象数组，那么每个数组元素都是一个对象，我们传参进去是传一个对象数组，所以定义都是用NewCirce[]
//这里我们创建对象数组还调用了函数以方便看到底是怎样的原理，其实可以直接写成 NewCircle[] circleArray = new NewCircle[5],再用for循环输入或随机