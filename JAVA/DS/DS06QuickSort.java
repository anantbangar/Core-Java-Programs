import java.util.*;

class DS06QuickSort
{
	public static int[] quickSort(int arr[],int lb,int ub)
	{
		if(lb < ub)
		{
			int loc=partition(arr,lb,ub);

			quickSort(arr,lb,loc-1);
			
			quickSort(arr,loc+1,ub);
		}

		return arr;
	}

	public static int partition(int arr[],int lb,int ub)
	{
		int pivot=arr[lb];
		int start=lb;
		int end=ub;

		while(start < end)
		{
			while(arr[start] <= pivot)
			{
				start++;
			}

			while(arr[end] > pivot)
			{
				end--;
			}

			if(start < end)
			{
				int temp=arr[start];	//swap(arr[start],arr[end])
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		
		int temp=arr[lb]; 	//swap(arr[lb],arr[end])
		arr[lb]=arr[end];
		arr[end]=temp;
		
		return end;
	} 

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array ");
		int size=sc.nextInt();

		int arr[]=new int[size];
		int i;

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

		int lb=0,ub=size-1;

		arr=quickSort(arr,lb,ub);

		System.out.println();

		System.out.println("sorted array using QuickSort is ");

		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}