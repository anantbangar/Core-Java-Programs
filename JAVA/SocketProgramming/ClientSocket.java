
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket 
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("Client connected...");
		
		Socket s=new Socket("localhost",9998);
		
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		
		String str1="",str2="";
		
		while(!str1.equals("stop"))
		{
			//str1=br.readLine();
			str1=sc.nextLine();
			dout.writeUTF(str1);
			dout.flush();
						
			str2=din.readUTF();
			System.out.println("server saying... "+str2);
		}
		dout.close();
		din.close();
		s.close();
	}

}
