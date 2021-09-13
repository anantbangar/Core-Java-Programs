import java.util.Scanner;

class S03ToggleEachCharInStr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the String ");

		String str1;
		String str2="";
		
		str1=sc.nextLine();

		for(int i=0;i<str1.length();i++)
		{
			if(Character.isUpperCase(str1.charAt(i)))
			{
				str2=str2+(Character.toLowerCase(str1.charAt(i)));
			}

			else
			{
				str2=str2+(Character.toUpperCase(str1.charAt(i)));
			}
		}

		System.out.println("toggled String is "+str2);
	}
}

			