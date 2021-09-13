import java.util.*;
class N23AutomorphicNum2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sqr=n*n;
		System.out.println("entered number is "+n);
		System.out.println("square of "+n+" is "+sqr);

		String stNum=Integer.toString(n);
		String stSqr=Integer.toString(sqr);

		int lenNum=stNum.length();
		System.out.println("length of number is "+lenNum);
		int lenSqr=stSqr.length();
		System.out.println("length of square is "+lenSqr);

		String st=stSqr.substring(lenSqr-lenNum);

		System.out.println("substring is "+st);

		if(st.equals(stNum))
			System.out.println(n+" is automorphic number");
		else
			System.out.println(n+" is not automorphic number");
	}
}