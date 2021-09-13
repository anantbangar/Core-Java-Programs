import java.util.*;
class N27ReplaceAll0to1InNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		long num1=sc.nextLong(),num2=0;
		System.out.println("entered number is "+num1);
		
		if(num1==0)
		{
			num2=1;
			System.out.println("after replace 0 to 1 in number "+num1+" is "+num2);
		}
		else if(num1==1)
		{
			System.out.println("after replace 0 to 1 in number "+num1+" is "+num1);
		}

		else
		{
			while(num1>0)
			{
				long rem=num1%10;
				if(rem==0)
					rem=1;
				num1=num1/10;
				num2=num2*10+rem;
			}
			System.out.println(num2);
			long rev=0;
			
			while(num2!=0)
			{
				long rem=num2%10;
				rev=rev*10+rem;
				num2=num2/10;
			}

			System.out.println("after replace 0 to 1 in number "+num1+" is "+rev);
				
		}
		

		
	}
}