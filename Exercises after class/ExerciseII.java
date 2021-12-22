package exercise;

import java.io.*;
import java.util.*;

//�ɿ���̨���չ̶���ʽ����ѧ����Ϣ������ѧ�š�������������Ϣ�������������Ϊexit�˳�
//�������ѧ����Ϣ�ֱ��װ��һ��Student�����У��ٽ�ÿ��Student������뵽һ�������У�Ҫ�󼯺��е�Ԫ�ذ��������С��������
//���������ϣ���������ѧ����Ϣд�뵽���±���ÿ��ѧ������ռ����һ��

//������ɵ�������Ҫ�õ�TreeSet����������TreeMap,�����е�Ԫ��������ģ���HashSet�������
//Ȼ�󼯺�һ����������ӿڣ�Collections �� Map���������ϸ����õľ���Map�ӿڣ���˫�м��ϣ�Ҳ���Ǽ�ֵ��(Ҳ�����֣�Hash��Set)
//��ô���Ǹ���ʹ�õ�Collections�ӿ��ǵ��м��ϣ���ΪList�ӿڣ�Ԫ�ؿ��ظ�����ΪArrayList��LinkedList����Set�ӿڣ�Ԫ�ز����ظ�����ΪTreeSet��HashSet���֣�����
//Ҫע�����TreeSet��HashSetû�д������ķ���������ʹ����ͨfor�ȱ�������set���Ͽ���ʹ�õ�������������Ҳ�Ǳ���ĺ��ģ�TreeSet�Ƚ�������

//TreeSet(){}  ������Ȼ����
//TreeSet(Comparator compartor){}  �Զ���Ƚ����������򣬺ܳ��ã��˽���Ȼ�����ԭ������Ͻ�����д��
//���Զ���Ƚ�����ʱ����Ϊ������һ���ӿڣ�����Ҫʹ�ýӿڵľ���ʵ���࣡��ȻҲ����ʹ�������ڲ��࣬��������»����׷���һЩ������ʹ�õ��������ڲ��࣡
//��Ȼ���������Ҳ���ѣ�ֱ�����Ǹ�����ʵ��������д

class Student
{
	private String number;   //ѧ��
	private String name;    //����
	private int age;       //����
	
	//���췽��
	public Student() {}
	
	public Student(String number, String name, int age)
	{
		this.number = number;
		this.name = name;
		this.age = age;
	}
	
	//��Ա�����ķ���������
	String get_number()
	{
		return this.number;
	}
	
	String get_name()
	{
		return this.name;
	}
	
	int get_age()
	{
		return this.age;
	}
	
	//��Ա�������޸�������
	void set_number(String number)
	{
		this.number = number;
	}
	
	void set_nam(String name)
	{
		this.name = name;
	}
	void set_age(int age)
	{
		this.age = age;
	}
}

public class ExerciseII
{

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException  //������������׳�����������Ϊ�����ļ��Ķ�ȡ���벻дtry�ṹ
	{
		//�����ڲ���д��ʽ
		Set<Student> students = new TreeSet<Student>(new Comparator<Student>() {   
 
			@Override
			public int compare(Student o1, Student o2)
			{
				return o1.get_age() - o2.get_age();
			}
			
		});
		//����ԭʼ�������return����-1����¼�뼯�ϣ������1������¼�뼯�ϣ�����Ҳ������������һ��
		//��Ȼ���������ͬ������������ĸ��С����Ļ��Ǿ�Ҫע����ĸ�Ƚϴ�С��Ҫʹ��compareTo����
		
		Scanner input = new Scanner(System.in);
		
/*		System.out.println("����¼�뼸��ͬѧ����Ϣ��");
		int num = input.nextInt();
		
		for (int i = 0;i < num;i++)
		{
			System.out.println("�������" + (i + 1) +"��ͬѧ����Ϣ��");
			System.out.print("������ ");
			String name = input.next();
			System.out.print("ѧ�ţ� ");
			String number = input.next();
			System.out.print("���䣺 ");
			int age = input.nextInt();
			
			Student student = new Student(number, name, age);  //���������Ϣ��Ž�һ��Student������
			students.add(student);                            //������ӵ�����
		} 
*/
		//����ʹ����ĿҪ�������ʽ��
		System.out.println("�밴��������ѧ�š������˳��������Ҫ¼���ѧ����Ϣ������exitʱ����");
		while (true)
		{
			String name = input.next();
			if (name.equals("exit") == true)              //�ַ����ȽϺ�����
				break;
			String number = input.next();
			int age = input.nextInt();
			
			Student student = new Student(number, name, age);  //���������Ϣ��Ž�һ��Student������
			students.add(student);                             //������ӵ�����
		}
		
		//�����ַ�������
		FileWriter fw = new FileWriter("D:\\outputt.txt");
		//�ַ����������
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(" ����       ѧ��         ����");
		bw.newLine();
		
		//������õ���Ϣ���뵽ָ���ļ���
		for (Student student : students)
		{
			bw.write(student.get_name() + "   " + student.get_number() + "   " + student.get_age()); //��Ȼ���Ҫд�ÿ��㻹����ʹ�ø�ʽ���ַ����
			
			bw.newLine();  //����
		}
		bw.close(); //�洢�������ͷ���Դ
	}
}