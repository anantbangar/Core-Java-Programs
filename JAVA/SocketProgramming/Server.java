
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server 
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("server started.....");
		System.out.println("waiting for client connection....");
				
		ServerSocket ss=new ServerSocket(9998);
		Socket s=ss.accept();
		
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		DataInputStream din=new DataInputStream(s.getInputStream());
		
		//BufferedReader br=new BufferedReader(new java.io.InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		
		String str1="",str2="";
		
		while(!str1.equals("stop"))
		{
			str1=din.readUTF();
			System.out.println("Client saying... "+str1);
			
			//str2=br.readLine();
			str2=sc.nextLine();
			dout.writeUTF(str2);
			dout.flush();
		}
		din.close();
		dout.close();
		s.close();
		ss.close();
		
	}

}
