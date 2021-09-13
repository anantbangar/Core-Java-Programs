import java.util.*;

class G02UsingMap
{
	public static void main(String args[])
	{
		Map<Integer,String> map=new HashMap<Integer,String>();

		map.put(1,"anant");
		map.put(2,"pawan");
		map.put(3,"gulab");

		System.out.println(map);

		Set<Map.Entry<Integer,String>> set=map.entrySet();

		Iterator<Map.Entry<Integer,String>> itr=set.iterator();

		while(itr.hasNext())
		{
			Map.Entry m=itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}