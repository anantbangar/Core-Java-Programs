import java.util.*;

class DS02BinarySearch
{
	public static int[] sortArr(int[] arr,int size)
	{
		int i,j,temp,flag;

		for(i=0;i<size-1;i++)
		{
			flag=0;

			for(j=0;j<size-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					flag=1;
				}
			}
		
			if(flag==0)
				break;
		}

		System.out.println("sorted array is ");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}

		return arr;
	}

	public static int binarySearch(int[] arr,int size,int data)
	{
		int beg=0,end=size-1,mid;

		while(end>=beg)
		{
			mid=(beg+end)/2;

			if(data==arr[mid])
			{
				return mid+1;
			}

			else if(data>arr[mid])
			{
				beg=mid+1;
			}
			
			else
			{
				end=mid-1;
			}
		}

		return -1;
	}
	
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

		System.out.println();

		arr=sortArr(arr,size);
		
		System.out.println();
		System.out.println("Enter data to be search ");
		int data=sc.nextInt();
		
		int loc=binarySearch(arr,size,data);
		
		if(loc == -1)
		{
			System.out.println("data not found ");
		}

		else
		{
			System.out.println("data found at location "+loc);
		}

	}
}
