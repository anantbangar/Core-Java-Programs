import java.util.*;
class N19StrongNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int num=n,sum=0;
		
		while(n!=0)
		{
			int rem,fact=1;
			rem=n%10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			
			sum=sum+fact;
			n=n/10;
		}
		System.out.println("sum= "+sum);

		if(sum==num)
			System.out.println(num+" is strong number");
		else
			
			System.out.println(num+" is not strong number");
	}
}