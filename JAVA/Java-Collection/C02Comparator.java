import java.util.*;

class AgeComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Emp e1=(Emp)obj1;
		Emp e2=(Emp)obj2;
		
		if(e1.eage==e2.eage)
			return 0;
		else if(e1.eage > e2.eage)
			return 1;
		else
			return -1;
	}
}

class IdComparator implements Comparator<Emp>
{
	public int compare(Emp e1,Emp e2)
	{
		if(e1.eid==e2.eid)
			return 0;
		else if(e1.eid > e2.eid)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Emp>
{
	public int compare(Emp e1,Emp e2)
	{
		return(e1.ename.compareTo(e2.ename));
		
	}
	
}

class C02Comparator
{
	public static void main(String args[])
	{
		List<Emp> list=new ArrayList<Emp>();

		list.add(new Emp(101,"anant",25));
		list.add(new Emp(100,"ram",50));
		list.add(new Emp(105,"gulab",10));
		list.add(new Emp(102,"pawan",05));

		System.out.println("Sorting using eage ");
		Collections.sort(list,new AgeComparator());
		for(Emp e : list)
		{
			System.out.println(e.eid+" "+e.ename+" "+e.eage);
		}

		System.out.println();

		System.out.println("Sorting using eid ");
		Collections.sort(list,new IdComparator());
		for(Emp e : list)
		{
			System.out.println(e.eid+" "+e.ename+" "+e.eage);
		}

		System.out.println();

		System.out.println("Sorting using ename ");
		Collections.sort(list,new NameComparator());
		for(Emp e : list)
		{
			System.out.println(e.eid+" "+e.ename+" "+e.eage);
		}
	}
}

		