import java.util.Scanner;

class S10CountSumOfNosInStr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string ");

		String str1=sc.nextLine();

		String str2="";

		int sum=0;

		char[] ch=str1.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				//int num=Integer.parseInt(String.valueOf(ch[i]));
				
				int num=Character.getNumericValue(ch[i]);
							
				sum=sum+num;
			}
		}

		System.out.println("sum of numbers in string is "+sum);
	}
}