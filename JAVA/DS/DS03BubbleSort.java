import java.util.*;

class DS03BubbleSort
{
	public static int[] bubbleSort(int[] arr,int size)
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

		arr=bubbleSort(arr,size);

		System.out.println("sorted array using bubble sort is ");

		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}