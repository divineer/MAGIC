package Chapter5TestQuestions;
import java.util.Scanner;
public class TwentyNinthTopic
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
        System.out.println("��������ݣ�1900����2099����");
        int year = input.nextInt();
        int Total = 0;//ͳ��������
        final  String WeekHead="��\tһ\t��\t��\t��\t��\t��";
        if(year>=1900&&year<=2099){
            boolean  isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? true : false;
            int[]aa=new int[isLeapYear?366:365];//��������
            //ͳ������
            for (int i = 1900; i < year; i++) {
                Total += ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) ? 366 : 365;
            }
            Total%=7;
            //�����ڼ����������У�ÿһ�춼��Ӧ�����ڼ�
            for (int i = 0; i <aa.length ; i++,Total++) {
                Total%=7;
                aa[i]=Total;
            }
            // ���ÿ���µ�����
            int count=0;
            for (int i = 1; i <=12 ; i++) {
                System.out.println("\n"+year+"��"+i+"��");
                System.out.println(WeekHead);
                int maxday = 31;
                switch (i){//�ж��·ݵ��������
                    case 2:
                        maxday = isLeapYear?29:28;
                        break;
                    case 4:case 6:case 9:case 11:
                        maxday =30;
                        break;
                }
                for (int j = 0; j <=aa[count] ; j++) {
                    if((aa[count]+1)%7==0)
                        break;
                    else{
                        System.out.print("\t");
                    }
                }
                for (int j = 1; j <=maxday ; j++) {
                        System.out.print(j+"\t");
                    if((aa[count]+1+j)%7==0&&j!=maxday){
                        System.out.println();
                    }
                }
                count+=maxday;
            }
        }else {
            System.out.println("�����������������");
        }
    }
}
//ħ��������������  ������ ֮������ϸ����� Ҫ�жϵ�����̫���� �Ժ���ʱ����Լ��������Լ���˼·
/*
  package Chapter5TestQuestions;
import java.util.Scanner;
public class TwentyNinthTopic
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter the day of the week for the first day of the year: ");
		int q = input.nextInt();
		int F,M3,A4,M5,J6,J7,A8,S,O,N,D;
		int j = year / 100;
		int k = year % 100;
		int s = (year - 1) / 100;
		int b = (year - 1) % 100;
		F = (1 + 26 * 15 / 10 + b + b / 4 + s / 4 + 5 * s) % 7;
		M3 = (1 + 26 * 4 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		A4 = (1 + 26 * 5 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		M5 = (1 + 26 * 6 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		J6 = (1 + 26 * 7 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		J7 = (1 + 26 * 8 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		A8 = (1 + 26 * 9 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		S = (1 + 26 * 10 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		O = (1 + 26 * 11 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		N = (1 + 26 * 12 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		D = (1 + 26 * 13 / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		System.out.println("                   January " + year);
		System.out.println("")
	}
}
*/
