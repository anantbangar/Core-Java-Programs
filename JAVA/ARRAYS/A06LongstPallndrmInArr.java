import java.util.*;
import java.io.*;
class A06LongstPallndrmInArr
{
	static int longstPallndrm(int num)
	{
		int rem,rev=0;
		int n=num; 
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
	
		if(rev==num)
		{
			return 1;
		}

		return -1;
	}

	static void sortArr(int arr[],int size)
	{
		int i,j,temp;
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("sorted array is");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}


	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		System.out.println("enter the elements of array");
		int arr[]=new int[size];
		int i;
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("entered array is ");

		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sortArr(arr,size);
		System.out.println();
		int n=0;
		for(i=size-1;i>=0;i--)
		{
			n=longstPallndrm(arr[i]);
			if(n==1)
			{
				System.out.println("Longest Pallindrom in array is "+arr[i]);
				break;
			}

		}

		if(n!=1)
			System.out.println("there is no pallindrom number in array");
	}
}