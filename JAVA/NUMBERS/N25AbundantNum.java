import java.util.*;
class N25AbundantNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int i=1,sum=0;
		System.out.print("divisors of "+n+" are ");
		while(i<n)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				sum=sum+i;
			}
			i++;
		}
		System.out.println();
		System.out.println("sum of divisors of "+n+" is "+sum);

		if(sum>n)
			System.out.println(n+" is abundant number");
		else
			System.out.println(n+" is not abundant number");
	}
}