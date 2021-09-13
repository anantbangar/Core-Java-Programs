import java.util.*;
class N29NumAsSumOfTwoPrime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");		
		int num=sc.nextInt();
		System.out.println("entered number is "+num);
		int count=0;
		for(int i=1;i<=num/2;i++)
		{
			if(primeNo(i)==1)
			{
				if(primeNo(num-i)==1)
				{
					System.out.println(num+" = "+i+" + "+(num-i));
					count=1;
				}
			}
			
		}
		if(count==0)
			System.out.println(num+" can not be expressed as sum of two prime numbers");
	}

	static int primeNo(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		
		if(count==2)
			return 1;
		return 0;
	}
}

		