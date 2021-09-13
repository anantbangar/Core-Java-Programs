import java.util.*;
class N26FrndlyPairNum
{
	static int factorSum(int n)
	{
		int sum=0;
		System.out.print("factors of "+n+" are ");
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{		
				System.out.print(i+" ");
				sum=sum+i;
			}
			
		}
		System.out.println();
		return sum;
	}		
		
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("entered numbers are "+n1+" "+n2);
		int sum1=factorSum(n1);
		int sum2=factorSum(n2);

		System.out.println(n1+"'s factor sum is "+sum1);
		System.out.println(n2+"'s factor sum is "+sum2);

		if((sum1==n2)&&(sum2==n1))
			System.out.println("both number are friendly pair");
		else
			System.out.println("both number are not friendly pair");
	}
}