import java.io.*;
import java.io.Serializable;
public class Student implements Serializable
{
	int rollno;
	String name;
	
	public Student(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
	}

	public void display()
	{
		System.out.println(rollno+" "+name);
	}
}