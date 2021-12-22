package Chapter11Examples;

public class GeometricObject  //��������һ�����������м��εĴ��࣬��Ƹ���
{
	private String color = "white";        //һ������Ϊ˽�б���
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject()               //����һ����ʼ�Ļ����Ǵ���ļ��ζ���
	{
		dateCreated = new java.util.Date();//��¼����ʱ��
	}
	
	public GeometricObject(String color,boolean filled) //����һ����ʼ�Ķ��������ɫ���Ƿ����
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor()             //�û����֪��ɫ���Է���
	{
		return color;
    }
	
	public void setColor(String color)   //�û����ⲿ������ɫ
	{
		this.color = color;
	}
	
	public boolean isFilled()
	{
		return filled;
	}
	
	public void setFilled(Boolean filled)
	{
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
	
	public String toString()              //�����������Ļ�����Ϣ
	{
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}