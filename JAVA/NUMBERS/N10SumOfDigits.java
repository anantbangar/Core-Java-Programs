import java.util.*;
class N10SumOfDigits
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n=sc.nextInt();
	
		int num=n;
		int rem,sum=0;
		while(n>0)
		{
			rem=n%10;	
			sum=sum+rem;
			n=n/10;	
		}

		System.out.println("sum of digits of "+num+" is "+sum);
	}
}