import java.util.*;
public class N03NSum
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter last number ");
		n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}

		System.out.println("sum of first "+n+" natural numbers is "+sum);
	}
}