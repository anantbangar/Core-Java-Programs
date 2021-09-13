import java.util.*;
class N13Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int num=n;
		int num1=n;
		int rem,sum=0,count=0;

		while(num1>0)
		{
			num1=num1/10;
			count++;
		}

		System.out.println("count = "+count);
			
		while(n!=0)
		{
			int mul=1;
			rem=n%10;
			for(int i=1;i<=count;i++)
			{
				mul=mul*rem;
			}
			sum=sum+mul;
			n=n/10;
			
		}
		if(num==sum)
			System.out.println(num+" is armstrong number");
		else
			System.out.println(num+" is not armstrong number");
	}
}