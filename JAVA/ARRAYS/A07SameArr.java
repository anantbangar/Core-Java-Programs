import java.util.*;
class A07SameArr
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of first array");
		int size1=sc.nextInt();	
		System.out.println("enter the size of second array");
		int size2=sc.nextInt();
		
		System.out.println("enter the elements of first array");
		int arr1[]=new int[size1];
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();	
		}

		System.out.println("enter the elements of second array");
		int arr2[]=new int[size2];
		for(int i=0;i<size2;i++)
		{
			arr2[i]=sc.nextInt();	
		}


		System.out.println("entered first array is ");
		for(int i=0;i<size1;i++)
		{
			System.out.print(arr1[i]+" ");	
		}

		System.out.println();

		System.out.println("entered second array is ");
		for(int i=0;i<size2;i++)
		{
			System.out.print(arr2[i]+" ");	
		}
		
		System.out.println();
		
		if(equal(arr1,arr2))
			System.out.println("both arrays are same");
		else
			System.out.println("both arrays are not same");
	}

	static boolean equal(int[] arr1,int arr2[])
	{
		int len1=arr1.length;
		int len2=arr2.length;

		if(len1!=len2)
			return false;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for(int i=0;i<len1;i++)
		{
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
	}
}							
		