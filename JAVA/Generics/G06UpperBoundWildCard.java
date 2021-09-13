import java.util.*; 


class G06UpperBoundWildCard
{
	static double add(List<? extends Number> list)
	{
		double sum=0;
		
		for(Number n : list)
		{
			sum=sum+n.doubleValue();
		}

		return sum;

	}
	
	public static void main(String args[])
	{
		List<Integer> listInt=new ArrayList<Integer>();

		List<Double>listDb=new ArrayList<Double>();

		listInt.add(10);
		listInt.add(20);

		listDb.add(10.20);
		listDb.add(20.30);

		System.out.println("addtion of Integer list "+ add(listInt));

		System.out.println("addtion of Double list "+ add(listDb));
	}
}