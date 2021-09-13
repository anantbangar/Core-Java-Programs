import java.util.*;
class N05Gr8ofTwo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("enter first number");
		n1=sc.nextInt();
		System.out.println("enter second number");
		n2=sc.nextInt();

		if(n1>n2)
			System.out.println(n1+" is greater than "+n2);
		else if(n2>n1)
			System.out.println(n2+" is greater than "+n1);
		else
			System.out.println("both numbers are equal");

		int result=n1>n2?n1:n2;

		System.out.println("greater number using ternary operator is "+result);
	}
}
		