import java.util.*;
class N16Factorial
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to find factorial");
		int n=sc.nextInt();
		int sum=1;
	
		for(int i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		System.out.println("factorial of number "+n+" is "+sum);
	}
}