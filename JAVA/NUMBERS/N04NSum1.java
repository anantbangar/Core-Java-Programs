import java.util.*;
public class N04NSum1
{
	public static void main(String[] args)
	{
		int f,l;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number ");
		f=sc.nextInt();
		System.out.print("enter last number ");
		l=sc.nextInt();
		
		int sum=0;
		for(int i=f;i<=l;i++)
		{
			sum=sum+i;
		}

		System.out.println("sum of numbers between "+f+" to "+l+" is "+sum);
	}
}