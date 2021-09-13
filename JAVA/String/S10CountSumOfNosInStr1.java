import java.util.Scanner;

class S10CountSumOfNosInStr1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string ");

		String str1=sc.nextLine();
		
		int sum=0;
		
		for(int i=0;i<str1.length();i++)
		{
			if(Character.isDigit(str1.charAt(i)))
			{											
				sum=sum+(Character.getNumericValue(str1.charAt(i)));
			}
		}

		System.out.println("sum of numbers in string is "+sum);
	}
}