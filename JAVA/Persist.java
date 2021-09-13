import java.io.*;

class Persist
{
	public static void main(String args[])
	{
		try
		{
			Student s=new Student(1000,"ram");

			FileOutputStream fout=new FileOutputStream("anant.txt");
			ObjectOutputStream oout=new ObjectOutputStream(fout);

			oout.writeObject(s);
			oout.flush();
			oout.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
		