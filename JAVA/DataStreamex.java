import java.io.*;
import java.util.*;
class DataStreamex
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fin1=new FileInputStream("anant.txt");
			FileInputStream fin2=new FileInputStream("anant1.txt");
			FileInputStream fin3=new FileInputStream("anant2.txt");

			Vector v=new Vector();
			v.add(fin1);
			v.add(fin2);
			v.add(fin3);

			Enumeration e=v.elements();
			
			SequenceInputStream sin=new SequenceInputStream(e);
			
			
			

			FileOutputStream fout=new FileOutputStream("anant3.txt");
			int j=0;
			while((j=sin.read())!=-1)
			{
				fout.write(j);
			}

			

			sin.close();			

			fin1.close();
			fin2.close();
			fin3.close();
			fout.close();

			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}