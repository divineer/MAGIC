package Chapter9Examples;

public class TestTV
{

	public static void main(String[] args)
	{
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolumeLevel(3);
		
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeLevelUp();
		
		System.out.println("tv1's channel is " + tv1.channel + " and volume level is "+ tv1.volumeLevel);
		System.out.println("tv2's channel is " + tv2.channel + " and volume level is "+ tv2.volumeLevel);
	}
}
//这里调用了TV类实现我们自己的操作，其实在TV类中很多东西都初始化了，所以我们这里使用起来比较方便，void并不代表不含参数，改变的值就在TV类中改变
//最后输出就输出TV类中的东西，就不需要再返回一个什么东西了，而我们Circle中需要返回那是因为它设置了一个有返回值的函数，我们这里当然也可以设置一个函数返回改变的值
//上个例题不好设置没有返回值的，不然还要在类里面定义一个area