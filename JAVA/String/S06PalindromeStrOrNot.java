import java.util.Scanner;

class S06PalindromeStrOrNot
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string ");

		String str1,revstr1="";
		
		str1=sc.nextLine();

		for(int i=str1.length()-1;i>=0;i--)
		{
			revstr1=revstr1+(str1.charAt(i));
		}

		System.out.println("reverse string is "+revstr1);

		if(str1.equals(revstr1))
			System.out.println("string is pandrome");

		else
			System.out.println("string is not pandrome");
			
	}
}

		