package Chapter11Examples;

public class TestMulti
{
	public static void main(String[] args) 
	{
			// 创建多态对象测试
			Fu f= new Zi() ;      //仍然是父类引用（Fu） 指向 子类对象（这里的 new Zi()）
			                     //编译看左边，只要想用的功能，必须是父类提供的。
			                    //运行看右边，多指发生了方法重写后，使用右边的也就是子类的方法体
			
			//下面这个类方法的使用，一定是使用父类的(方法声明)，但是！方法体由于可以重写，所以用子类的方法体！
			f.study();         //结果会输出"我爱java"，理解！
			
			//成员变量的使用，一定是使用父类的，由于不存在重写，所以执行的也是父类的。
			System.out.println( f.name );    // 结果输出jack，
			
			//静态方法，可以存在重写吗？ – 不可以！！！
		   //由于静态资源根本不存在重写，所以直接执行父类的方法声明和方法体。即使子类有一个和父类一模一样的方法也不是重写！！！
			f.play();          //结果输出“儿子正在玩”
	}
}

class Fu
{
	String name = "Jack" ;
    public void study() 
    {
		System.out.println("爸爸正在学习");
	}
	static public void play()   //注意区分，这是一个静态方法，有“static”关键词
	{
		System.out.println("爸爸正在玩儿");
	}
}

class Zi extends Fu          //多态前提一：包含继承关系（或者用接口实现也行）
{
	String name = "xiongda"; //成员变量无法重写！

	public void study()     //多态前提二：必须包含方法重写
	{
		System.out.println("我爱java");
	}
	static public void play() //这个是子类特有的，不是重写！因为父类中定义的是静态方法
	{
	    System.out.println("儿子正在玩儿");
	}
}