import java.util.*;
class A02ScndSmllstElmtInArr
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
		
		System.out.println("entered array is");
		for(i=0;i<size;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		//Arrays.sort(arr1);
		int temp,j;
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				if(arr1[i]<arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("sorted array is");
		for(i=0;i<size;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();

		System.out.println("second smallest element in array is "+arr1[1]);

		System.out.println("second largest element in array is "+arr1[size-2]);
	}
}
		
