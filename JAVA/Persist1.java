import java.io.*;
import java.io.Serializable;

public class Persist1
{
	public static void main(String[] args)
	{
		try
		{
			

			FileInputStream fin=new FileInputStream("anant.txt");
			ObjectInputStream oin=new ObjectInputStream(fin);
			
			Student s1=(Student)oin.readObject();
			System.out.println(s1.rollno+ "  "+s1.name);
			s1.display();			
			oin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}