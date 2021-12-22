package Chapter11Examples;

public class GeometricObject  //创建这样一个试用于所有几何的大类，简称父类
{
	private String color = "white";        //一般设置为私有变量
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject()               //创建一个初始的或者是错误的几何对象
	{
		dateCreated = new java.util.Date();//记录创建时间
	}
	
	public GeometricObject(String color,boolean filled) //创建一个初始的对象包含颜色和是否填充
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor()             //用户想得知颜色可以返回
	{
		return color;
    }
	
	public void setColor(String color)   //用户在外部更改颜色
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
	
	public String toString()              //返回这个对象的基础信息
	{
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}