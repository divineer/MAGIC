package Chapter11Examples;

import java.util.ArrayList;  //使用前一定要先导入 ArrayList是一种泛类型对象，可以用于存储不限定个数的对象，规定类型，很棒！

public class TestArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> cityList = new ArrayList<String>();  //创建一个字符串类型的列表来存储城市
		
		cityList.add("London"); //这里跟python就类似了，存几个进去
		cityList.add("Paris");
		cityList.add("Denver");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		
		System.out.println("List size? " + cityList.size());  //很方便的函数库，一定要会使用！
		System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
		System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
		System.out.println("Is the list empty? " + cityList.isEmpty());
		
		cityList.add(2, "Xian");
		cityList.remove("Miami");
		cityList.remove(1);       //跟python的用法都差不多，主要是会用！
		System.out.println(cityList.toString());
		
		for (int i = cityList.size() - 1; i >= 0; i--)
		{
			System.out.print(cityList.get(i) + " ");
		}
		System.out.println();
	                             //这个书写方式也要清楚，不要忘了括号！
		ArrayList<Circle> list = new ArrayList<>();  //创建一个Circle类的对象列表，其实这都是可以的，哪怕是我们自己创的！
		
		list.add(new Circle(2));   //存进去的类型就是我们定义的类型，没有创建现在 new 一个也没有问题！
		list.add(new Circle(3));
		
		System.out.println("The area of the circle? " + list.get(0).getArea()); //注意后面这个表达，首先取出这个元素再怎么样，优先级相同从左到右
	}
}
//注意书本上ArrayList和数组的不同，当中有一个就是，想创建一个列表来存放一串数字，不能使用 ArrayList<int> a = new ArrayList<>()
//因为存储在ArrayList中的元素必须是一种对象，不能使用这种基本整型，所以这就是数组和ArrayList最大的区别