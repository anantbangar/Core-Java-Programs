import java.util.*;
class N21AutomorphicNum
{
	static int sqrNum(int n)
	{
		int sqr=n*n;
		return sqr;
	}

	static int countNum(int n)
	{
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		return count;
	}

	static int revNum(int n,int count)
	{
		int rem,rev=0;
		while(count!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			count--;
		}
		return rev;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sqr=sqrNum(n);
		System.out.println("entered number is "+n);
		System.out.println("square of "+n+" is "+sqr);
		int count=countNum(n);
		System.out.println("count is "+count);
		int rev=revNum(sqr,count);
		System.out.println("reverse of last digits of square is "+rev);
		int rev1=revNum(rev,count);
		System.out.println("reverser of reverse of square is "+rev1);

		if(rev1==n)
			System.out.println(n+" is automorphic number");
		else
			System.out.println(n+" is not automorphic number");
		
	}
}			