import java.util.*;

class DS07MergeSort
{
	public static int[] mergeSort(int arr[],int lb,int ub)
	{
		int mid;

		if(lb < ub)
		{
			mid=(lb+ub)/2;

			mergeSort(arr,lb,mid);
			mergeSort(arr,mid+1,ub);

			arr=merge(arr,lb,mid,ub);		
		}
		return arr;
	}

	public static int[] merge(int arr[],int lb,int mid, int ub)
	{
		int i=lb;
		int j=mid+1;
		int k=lb;

		int brr[]=new int[ub+1];

		while(i<=mid && j<=ub)
		{
			if(arr[i]<=arr[j])
			{
				brr[k]=arr[i];
				i++;
				k++;
			}

			else if(arr[j]<=arr[i])
			{
				brr[k]=arr[j];
				j++;
				k++;
			}
		}

		if(i>mid)
		{
			while(j<=ub)
			{
				brr[k]=arr[j];
				j++;
				k++;
			}
		}

		else if(j>ub)
		{
			while(i<=mid)
			{
				brr[k]=arr[i];
				i++;
				k++;
			}
		} 

		for(int m=lb;m<ub+1;m++)
		{
			arr[m]=brr[m];
		}

		return arr;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of array ");
		int size=sc.nextInt();
		
		System.out.println("enter the elements of array ");

		int i;
		int arr[]=new int[size];
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

		arr=mergeSort(arr,lb,ub);

		System.out.println();

		System.out.println("Array after Merge Sort  ");
				
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}		
	}
}