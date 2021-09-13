import java.io.*;
class ReadTest
{
	public static void main(String[] args)
	{
		Console c=System.console();
		System.out.println("enter your name");
		String n=c.readLine();
		System.out.println(n);

		System.out.println("enter the password");
		char []ch=c.readPassword();
		String p=String.copyValueOf(ch);
		System.out.println(ch);
	}
}