import java.util.*;
import java.io.*;
import java.net.*;

class MyServer
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket ss=new ServerSocket(3333);
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			Scanner sc=new Scanner(System.in);
			
			String str="",str2="";
			while(!(str.equals("stop")))
			{
				str=dis.readUTF();
				System.out.println("client saying "+str);
				str2=sc.nextLine();
				dos.writeUTF(str2);
				dos.flush();
			}

			dis.close();
			s.close();
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}