import java.util.*;
class N14ArmstrongInRange
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start of range");
		int start=sc.nextInt();
		System.out.println("enter the end of range");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			int num=i,num1=i;
			int n=i,count=0,rem,sum=0;
			while(num1>0)
			{
				num1=num1/10;
				count++;
			}

			//System.out.println("count = "+count);
			
			while(n!=0)
			{
				int mul=1;
				rem=n%10;
				for(int j=1;j<=count;j++)
				{
					mul=mul*rem;
				}
				sum=sum+mul;
				n=n/10;
			
			}
			if(num==sum)
				System.out.println(num+" is armstrong number");
			/*else
				System.out.println(num+" is not armstrong number");*/
		}
	}
}