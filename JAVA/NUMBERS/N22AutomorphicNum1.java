import java.util.*;
class N22AutomorphicNum1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("entered number is "+n);
		int sqr=n*n;
		System.out.println("square of "+n+" is "+sqr);
		int num=n,flag=0;
		while(num!=0)
		{
			if(num%10!=sqr%10)
			{
				flag=1;
				break;
			}
			num=num/10;
			sqr=sqr/10;
		}

		if(flag==0)
			System.out.println(n+" is automorphic number");
		else
			System.out.println(n+" is not automorphic number");		
	}
}