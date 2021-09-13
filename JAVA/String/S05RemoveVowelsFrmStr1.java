import java.util.Scanner;

class S05RemoveVowelsFrmStr1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string ");

		String str1,str2="";

		str1=sc.nextLine();

		str2=str1.replaceAll("[aeiou]","");

		System.out.println("string after remove all vowels is "+str2);
	}
}