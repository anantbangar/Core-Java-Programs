import java.util.*;
class A09MinSclrProdct
{
	Scanner sc=new Scanner(System.in);
	int arr1[],arr2[];
	int size;
	
	public int[] arrCreation()
	{
		System.out.println("enter the elements of array");

		int arr[]=new int[size];

		int i;
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		return arr;
	}	

	public void arrDisplay(int arr[])
	{
		//System.out.println("entered array is");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	
	public int[] ascSort(int arr[])
	{
		int temp,j,i;
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr;
	}

	public int[] descSort(int arr[])
	{
		int temp,j,i;
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr;
	}

	public int minSclrProdct(int arr1[],int arr2[])
	{
		int sum=0,i;
		for(i=0;i<size;i++)
		{
			sum=sum+(arr1[i]*arr2[i]);
		}
		return sum;
	}

		
		
	public static void main(String[] args)
	{
		A09MinSclrProdct[] msp=new A09MinSclrProdct[2];
		
		for(int i=0;i<2;i++)
		{
			msp[i]=new A09MinSclrProdct();
		
			System.out.println("enter the size of arrays");
			msp[i].size=msp[i].sc.nextInt();

		
			System.out.println("For first array");
			msp[i].arr1=msp[i].arrCreation();

			System.out.println("For second array");
			msp[i].arr2=msp[i].arrCreation();
		
			System.out.println("This is first array");
			msp[i].arrDisplay(msp[i].arr1);
		
			System.out.println();
			System.out.println("This is second array");
			msp[i].arrDisplay(msp[i].arr2);
		
			System.out.println();
			System.out.println("Ascending order of first array is ");
			msp[i].arr1=msp[i].ascSort(msp[i].arr1);
			msp[i].arrDisplay(msp[i].arr1);

		
			System.out.println();
			System.out.println("Descending order of second array is ");
			msp[i].arr2=msp[i].descSort(msp[i].arr2);
			msp[i].arrDisplay(msp[i].arr2);
	
			System.out.println();
			System.out.println("Minimum scalar product of two array is "
				+msp[i].minSclrProdct(msp[i].arr1,msp[i].arr2));
		}
		
	}
}