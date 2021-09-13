import java.util.*;
class A08SqrSumOfArr
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		System.out.println("enter the elements of array");
		int arr1[]=new int[size];
		int i;
		for(i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
	
		/*System.out.println("square of each element in array is");
		int arr2[]=new int[size];

		for(i=0;i<size;i++)
		{
			arr2[i]=arr1[i]*arr1[i];
		}

		for(i=0;i<size;i++)
		{
			System.out.print(arr2[i]+" ");
		}*/

		System.out.println();

		System.out.println("sum of square of each element in array is ");
		int sum=0;
		for(i=0;i<size;i++)
		{
			sum=sum+(arr1[i]*arr1[i]);
		}
		
		System.out.print(sum);
		
		
	}
}
		