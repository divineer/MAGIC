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
//���������TV��ʵ�������Լ��Ĳ�������ʵ��TV���кܶණ������ʼ���ˣ�������������ʹ�������ȽϷ��㣬void�����������������ı��ֵ����TV���иı�
//�����������TV���еĶ������Ͳ���Ҫ�ٷ���һ��ʲô�����ˣ�������Circle����Ҫ����������Ϊ��������һ���з���ֵ�ĺ������������ﵱȻҲ��������һ���������ظı��ֵ
//�ϸ����ⲻ������û�з���ֵ�ģ���Ȼ��Ҫ�������涨��һ��area