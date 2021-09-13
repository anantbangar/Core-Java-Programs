import java.util.*;
class A05ReverseOfArr
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		System.out.println("enter the elements of array");
		int []arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("entered array is");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}

		System.out.println();

		System.out.println("reverse of array is");
		int arr1[]=new int[size];
		int j=0;
		for(int i=size-1;i>=0;i--)
		{
			arr1[j]=arr[i];
			j++;

			System.out.println(arr[i]+" ");
		}

		for(int i=0;i<size;i++)
		{
			System.out.print(arr1[i]+" ");
		}

			
	}
}