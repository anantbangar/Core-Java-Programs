import java.util.*;

class DS04SelectionSort
{
	public static int[] selectionSort(int[] arr,int size)
	{
		int min,i,j,temp;

		for(i=0;i<size-1;i++)
		{
			min=i;

			for(j=i+1;j<size;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}

			if(min!=i)
			{
				temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}

		return arr;	
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

		arr=selectionSort(arr,size);

		System.out.println("sorted array using selection sort is ");

		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}