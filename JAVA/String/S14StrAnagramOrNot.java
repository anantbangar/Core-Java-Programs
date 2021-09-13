import java.util.Scanner;
import java.util.Arrays;
class S14StrAnagramOrNot
{
	static boolean anagramStr(String str1,String str2)
	{
		String s1=str1.replaceAll("[\\s]","");
		String s2=str2.replaceAll("[\\s]","");
	
		boolean status=true;		

		if(s1.length() != s2.length())
		{
			status=false;
		}
		else
		{
			char[] ch1=s1.toLowerCase().toCharArray();
			char[] ch2=s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			status=Arrays.equals(ch1,ch2);
		}
		return status;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two strings ");

		String str1=sc.nextLine();
		String str2=sc.nextLine();

		boolean status=anagramStr(str1,str2);

		if(status)
			System.out.println("strings are Anagram ");
		else
			System.out.println("strings are not Anagram ");
	}
}
