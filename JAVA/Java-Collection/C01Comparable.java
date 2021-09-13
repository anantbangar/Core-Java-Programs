import java.util.*;

class Emp implements Comparable<Emp>
{
	int eid;
	String ename;
	int eage;

	Emp(int eid,String ename,int eage)
	{
		this.eid=eid;
		this.ename=ename;
		this.eage=eage;
	}

	public int compareTo(Emp e)
	{	
		/* if(eid==e.eid)
			return 0;
		else if(eid > e.eid)	//compare using eid
			return 1;
		else 
			return -1; */

		/* if(eage==e.eage)
			return 0;
		else if(eage > e.eage)	//compare using eage
			return 1;
		else 
			return -1; */

		return(ename.compareTo(e.ename)); //compare usring ename
		
	}

}

class C01Comparable
{
	public static void main(String args[])
	{
		List<Emp> list=new ArrayList<Emp>();

		list.add(new Emp(101,"anant",25));
		list.add(new Emp(100,"ram",50));
		list.add(new Emp(105,"gulab",10));
		list.add(new Emp(102,"pawan",05));

		Collections.sort(list);

		for(Emp e : list)
		{
			System.out.println(e.eid+" "+e.ename+" "+e.eage);
		}
	}
}
