package Chapter9Examples;

public class TV
{
	int channel = 1;  // 频道 Default channel is 1
	int volumeLevel = 1; // 音量 Default volumeLevel is 1
	boolean on = false;  // TV is off
	public TV() {}    //每个对象首先都要初始化一个函数，之后调用这个函数就相当于调用了这个类，比如上面那个Circle里面也初始化了并且将所有的radius初始化为1
	public void turnOn()
	{
		on = true;
	}
	public void turnOff()
	{
		on = false;
	}
	public void setChannel(int newChannel)
	{
		if (on && newChannel >= 1 && newChannel <= 120)
			channel = newChannel;
	}
	public void setVolumeLevel(int newVolumeLevel)
	{
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
			volumeLevel = newVolumeLevel;
	}
	public void channelUp()
	{
		if (on && channel < 120)
			channel++;
	}
	public void channelDown()
	{
		if (on && channel > 1)
			channel--;
	}
	public void volumeLevelUp()
	{
		if (on && volumeLevel < 7)
			volumeLevel++;
	}
	public void volumeLevelDown()
	{
		if (on && volumeLevel > 1)
			volumeLevel--;
	}
}
//我们这里只学习了创建一个TV对象，关于频道音量加减，电视开关等操作，在下一个例题中会引用这个去实现相关操作，所以这里都要定义为public