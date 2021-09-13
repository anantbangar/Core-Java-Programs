import java.util.*;

class G07UnBoundedWildCard
{
	static void displayList(List<?> list)
	{
		for(Object o : list)
		{
			System.out.println(o);
		}
	}
	
	public static void main(String args[])
	{
		List<Integer> listInt=Arrays.asList(10,20,50,80,90);

		List <String> listStr=Arrays.asList("anant","pawan","gulab");

		System.out.println("Displaying Integer list ");

		displayList(listInt);

		System.out.println("Displaying String list ");

		displayList(listStr);
	}
}