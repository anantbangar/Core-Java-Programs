import java.io.*;
import java.util.*;
public class N01PosNeg
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("entered number is "+n);

		if(n>0)
			System.out.println("number is positive number");
		else if(n<0)
			System.out.println("number is negative number");
		else
			System.out.println("number is zero");
		sc.close();
	}
}