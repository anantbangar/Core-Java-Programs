import java.util.*;
import java.io.*;
class FileDemo2
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner("C:/Users/Anant/Desktop/New folder/anant.txt");
		
		sc.useDelimiter("/");
		
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}System.out.println("delimiter used "+sc.delimiter());
	}
}