import java.util.Scanner;

class S04CountNoOfVowelsInStr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string ");

		String str1;
		int count=0;

		str1=sc.nextLine();

		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u' || str1.charAt(i)=='A' || str1.charAt(i)=='E' || str1.charAt(i)=='I' || str1.charAt(i)=='O' || str1.charAt(i)=='U')
			{
				count++;
			}
		}

		System.out.println("number of vowels in string are "+count);
	}
} 

		