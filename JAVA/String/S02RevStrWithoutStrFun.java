import java.util.Scanner;
class S02RevStrWithoutStrFun
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the String ");

		String str1;
		String str2="";
		int length=0;

		str1=sc.nextLine();

		for(char ch : str1.toCharArray())
		{
			length++;

		}

		System.out.println("length of String is "+length);

		for(int i=length-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}

		System.out.println("reverse of string is "+str2);

		
	}
}
		

		