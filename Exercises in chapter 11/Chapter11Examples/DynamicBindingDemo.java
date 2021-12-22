package Chapter11Examples;

public class DynamicBindingDemo  //执行区域
{
	public static void main(String[] args)
	{
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());       //由输出可得Object类里面的toString并没有改变，只是在其他里面被重写了，没有重载
	}
	
	public static void m(Object x)
	{
		System.out.println(x.toString());
	}
}

//类当然是要定义在类外面的
class Person extends Object
{
	@Override                   //重写函数前设置这样一个语句更加严谨，如果函数没有得到重写则会报错，提供重写的标记
	public String toString()
	{
		return "Person";
	}
}

class Student extends Person    //虽然继承自父类Person，但是很明显它重写了父类的方法，而父类的并没有受到影响
{
	@Override
	public String toString()
	{
		return "Student";
	}
}

class GraduateStudent extends Student{}   //那就完全继承父类了，用的是父类的函数，故跟父类Student输出一样，记住！
//有时候我们很多函数后面都没有再写内容了，所以都是完全继承自父类的（默认为Object），这点不要忘记，不要觉得理所应当！

//这个代码就是说明动态绑定这样一个知识点，只能继承一个父类，但是能通过动态绑定去更灵活地运用，动态绑定意在说明声明类型与实际类型的不同！