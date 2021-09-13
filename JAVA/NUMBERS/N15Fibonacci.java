import java.util.*;
class N15Fibonacci
{
	public static void main(String[] agrs)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nth number");
		int num=sc.nextInt();
		
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=3;i<=num;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
			
			