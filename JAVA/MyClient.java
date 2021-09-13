import java.util.*;
import java.io.*;
import java.net.*;

class MyClient
{
	public static void main(String[] args)
	{
		try
		{
			Socket s=new Socket("192.168.0.104",3333);
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			DataInputStream dis=new DataInputStream(s.getInputStream());
			Scanner sc=new Scanner(System.in);

			String str="",str2="";
			while(!(str.equals("stop")))
			{
				str2=sc.nextLine();
				dos.writeUTF(str2);
				str=dis.readUTF();
				System.out.println("server saying "+str);
				dos.flush();
			}
			
			dis.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}