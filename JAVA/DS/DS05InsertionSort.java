import java.util.*;

class DS05InsertionSort
{
	public static int[] insertionSort(int[] arr,int size)
	{
		int i,j,temp;			

		for(i=1;i<size;i++)
		{
			temp=arr[i];
			j=i-1;

			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=temp;	
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

		arr=insertionSort(arr,size);

		System.out.println("sorted array using insertion sort is ");

		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}