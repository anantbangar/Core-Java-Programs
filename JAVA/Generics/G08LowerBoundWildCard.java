import java.util.*;

class G08LowerBoundWildCard
{
	static void displayList(List<? super Integer> list)
	{
		for(Object o : list)
		{
			System.out.println(o);
		}
	}

	public static void main(String args[])
	{
		List<Integer> listInt=Arrays.asList(10,20,40,70,3);

		List<Number> listNum=Arrays.asList(10,20.50,1,6.15);
		
		System.out.println("displaying Integer list ");

		displayList(listInt);

		System.out.println("displaying Number list ");

		displayList(listNum);

	}
}