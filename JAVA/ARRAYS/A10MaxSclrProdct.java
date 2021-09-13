import java.util.*;
class A10MaxSclrProdct
{
	Scanner sc=new Scanner(System.in);
	int size;
	int arr1[],arr2[];

	public int[] arrCreation()
	{
		int arr[]=new int[size];
		System.out.println("enter the elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();

		}
		return arr;

	}

	public void display(int arr[])
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public int[] ascOrder(int arr[])
	{
		int temp,i,j;

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

	public int maxSclrProdct(int arr1[],int arr2[])
	{
		int sum=0;

		for(int i=0;i<size;i++)
		{
			sum=sum+(arr1[i]*arr2[i]);
		}
		return sum;
	}

	public static void main(String args[])
	{
		A10MaxSclrProdct msp=new A10MaxSclrProdct();

		System.out.println("enter the size of arrays");

		msp.size=msp.sc.nextInt();

		System.out.println("for array one");
		msp.arr1=msp.arrCreation();

		System.out.println("entered array is ");
		msp.display(msp.arr1);

		System.out.println();
		System.out.println("for array two");
		msp.arr2=msp.arrCreation();
		
		System.out.println("entered array is ");
		msp.display(msp.arr2);

		System.out.println();
		System.out.println("ascending order of array one is ");
		msp.arr1=msp.ascOrder(msp.arr1);
		msp.display(msp.arr1);

		System.out.println();
		System.out.println("ascending order of array two is ");
		msp.arr2=msp.ascOrder(msp.arr2);
		msp.display(msp.arr2);

		System.out.println("maximum scalar product of both arrays is ");
		System.out.println(msp.maxSclrProdct(msp.arr1,msp.arr2));	

		

	}
		
}