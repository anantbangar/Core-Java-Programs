import java.util.Scanner;
class S02RevStrWithoutStrFun1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the String ");

		String str1;

		str1=sc.nextLine();

		StringBuffer sb=new StringBuffer(str1);

		sb.reverse();

		System.out.println("reverse of string using StringBuffer is "+sb);

		StringBuilder sbu=new StringBuilder(str1);

		sbu.reverse();

		System.out.println("reverse of string using StringBuilder is "+sbu);

	}
}