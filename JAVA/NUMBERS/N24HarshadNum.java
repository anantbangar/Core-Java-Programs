import java.util.*;
class N24HarshadNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("entered number is "+n);	
		int num=n;
		int rem,sum=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}

		if(n%sum==0)
			System.out.println(n+" is harshad number");
		else
			System.out.println(n+" is not harshad number");
	}
}
	