import java.util.*;
class N28ReplaceAll0to1InNum1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		long num=sc.nextLong();
		System.out.println("entered number is "+num);

		String str1=Long.toString(num);
		
		String str2="";
		int len=str1.length();
		
		for(int i=0;i<len;i++)
		{
			if(str1.charAt(i)=='0')
				str2=str2+'1';
			else
				str2=str2+str1.charAt(i);
		}

		System.out.println(str2);

			
	}
}
		