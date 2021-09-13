import java.util.*;
class N17PowerOfNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base");
		int base=sc.nextInt();
		
		System.out.println("enter the exponent");
		int exp=sc.nextInt();
		int result=1;

		//while(exp!=0)
		for(int i=exp;i>0;i--)
		{
			result=result*base;
			//exp--;
		}
		
		System.out.println("result "+result);
	}
}
			