import java.util.*;

class G01SimpleExample
{
	public static void main(String args[])
	{
		ArrayList<String> alist=new ArrayList<String>();

		alist.add("Anant");
		alist.add("Pawan");
		
		//alist.add(10);

		alist.add("10");

		System.out.println(alist);

		Iterator<String> itr=alist.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}