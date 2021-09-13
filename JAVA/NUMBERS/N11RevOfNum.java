import java.util.*;
class N11RevOfNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int num=n;
		int rem,rev=0;
	
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}

		System.out.println("reverse of "+num+" is "+rev);
	}
}	