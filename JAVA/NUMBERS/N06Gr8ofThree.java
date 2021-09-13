import java.util.*;
public class N06Gr8ofThree
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("enter first number");
		n1=sc.nextInt();
		System.out.println("enter second number");
		n2=sc.nextInt();
		System.out.println("enter third number");
		n3=sc.nextInt();

		if((n1>n2)&&(n1>n3))
			System.out.println(n1+" is greater");
		else if((n2>n1)&&(n2>n3))
			System.out.println(n2+" is greater");
		else if((n3>n1)&&(n3>n2))
			System.out.println(n3+" is greater");
		else
			System.out.println("all numbers are equal");

		int temp=n1>n2?n1:n2;
		int result=n3>temp?n3:temp;

		System.out.println("greater number using ternary operator is "+result);
	}
}
		