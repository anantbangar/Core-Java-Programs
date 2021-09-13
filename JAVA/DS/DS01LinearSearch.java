import java.util.*;

public class DS01LinearSearch 
{
  	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.println("enter the size of array ");
		size=sc.nextInt();

		int arr[]=new int[size];
		System.out.println("enter the elements of array ");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("entered array is ");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}

		int data;
		int flag=0;
		System.out.println();
		System.out.println("enter data to be search ");
		data=sc.nextInt();

		for(i=0;i<size;i++)
		{
			if(arr[i]==data)
			{
				flag=1;
				break;
			}
		}

		if(flag==1)
			System.out.println("data found at location "+(i+1));
		else
			System.out.println("data not found ");
			
	}
}