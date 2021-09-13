class G04E_Element
{
	public static <E> void printArray(E[] arr)
	{
		for(E i : arr)
		{
			System.out.println(i);
		}
	}

	public static void main(String args[])
	{
		Integer[] intArray={10,20,30,50,40,60};

		Character[] charArray={'a','b','c','d'};

		System.out.println("printing Integer array ");
		
		printArray(intArray);

		System.out.println("printing Character array ");

		printArray(charArray);
	}
}