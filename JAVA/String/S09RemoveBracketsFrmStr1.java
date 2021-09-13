import java.util.Scanner;

class S09RemoveBracketsFrmStr1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string ");

		String str1=sc.nextLine();
				
		String str2=str1.replaceAll("[{}()]","");

		System.out.println("after removing all brackets from string is "+str2);
	}
}
		 