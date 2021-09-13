import java.util.*;
class A03LargstElemtInArr
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");		
		int size=sc.nextInt();
		System.out.println("enter the elements of array");	
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("entered array is ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}

		int large=arr[0];
		for(int i=0;i<size;i++)
		{
			if(arr[i]>large)
				large=arr[i];
		}

		System.out.println("largest element in array is "+large);
				
	}
}