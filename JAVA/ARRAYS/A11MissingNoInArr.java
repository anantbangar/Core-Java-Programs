import java.util.*;
class A11MissingNoInArr
{
	private static boolean chkMissingNo(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			return true;	
		}
		return false;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Prog to find missing number in array from 1 to 10 ");
		
		int arr[]={10,5,8,9,6,7,3,1,4};
		
		System.out.println("Array is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		for(int key=1;key<=10;key++)
		{
			boolean isPresent=chkMissingNo(arr,key);
			if(isPresent==false)
			{
				System.out.println("Missing number in array is "+key);
				break;
			}
		}

		
	}

}