package Chapter9Examples;

public class TV
{
	int channel = 1;  // Ƶ�� Default channel is 1
	int volumeLevel = 1; // ���� Default volumeLevel is 1
	boolean on = false;  // TV is off
	public TV() {}    //ÿ���������ȶ�Ҫ��ʼ��һ��������֮���������������൱�ڵ���������࣬���������Ǹ�Circle����Ҳ��ʼ���˲��ҽ����е�radius��ʼ��Ϊ1
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
//��������ֻѧϰ�˴���һ��TV���󣬹���Ƶ�������Ӽ������ӿ��صȲ���������һ�������л��������ȥʵ����ز������������ﶼҪ����Ϊpublic