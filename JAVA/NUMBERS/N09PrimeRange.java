import java.io.*;
import java.util.*;

class N09PrimeRange
{
	static void prime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}

		if(count==2)	
			System.out.println(n+" is prime number");			
		/*else
			System.out.println(n+" is not prime number");*/
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		int start,end;
		System.out.println("enter the start of range");
		start=sc.nextInt();
		System.out.println("enter the end of range");
		end=sc.nextInt();	

		for(int i=start;i<=end;i++)
		{
			prime(i);
		}
	}
}
		




