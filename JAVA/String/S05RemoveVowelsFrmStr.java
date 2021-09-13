import java.util.Scanner;

class S05RemoveVowelsFrmStr
{
	public static int checkVowels(char ch)
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			return 1;
		}
		else 
			return 0;
	}	

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string ");

		String str1,str2="";

		str1=sc.nextLine();

		for(int i=0;i<str1.length();i++)
		{
			if(checkVowels(str1.charAt(i))==0)
			{
				str2=str2+(str1.charAt(i));
			}
		}

		System.out.println("string after remove all vowels is "+str2);
	}
}
