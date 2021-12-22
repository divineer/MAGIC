package Chapter11Examples;
import java.util.*;
public class MyStack 
{
	private ArrayList<Object> list = new ArrayList<>();
	
	public boolean isEmpty()   //list为私有变量，就需要设置这种外部访问函数，以后自己注意！
	{
		return list.isEmpty();
	}
	
	public int getSize()
	{
		return list.size();
	}
	
	public Object peek()     //获取栈顶元素而不删除它
	{
		return list.get(getSize() - 1);
	}
	
	public Object pop()     //显而易见我们对象设置的是什么类型，对象数组里存什么类型
	                        //函数设置要成什么类型，返回要是什么类型
	{
		Object o = list.get(getSize() - 1);  //替代top指针，直接获取，方便！
		list.remove(getSize() - 1);
		return o;           //返回被删除元素
	}
	
	public void push(Object o)
	{
		list.add(o);        //用列表直接这样方便得多，且不用记录top指针
	}
	
	@Override
	public String toString()  //设置什么类型返回什么类型
	{
		return "stack: " + list.toString();
	}
}
//我们建造一个存储元素为对象的栈类，可以使用一个ArrayList来实现Stack,为全局使用考虑，设为私有变量
//