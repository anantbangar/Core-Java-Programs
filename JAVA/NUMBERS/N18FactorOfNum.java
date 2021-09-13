import java.util.*;
class N18FactorOfNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println("factors of "+num+" are ");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				System.out.print(" "+i);
		}
	}
}