import java.util.Scanner;
public class PalindromeString
{	
	/*public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");				
		String st = sc.next();
		
		int len = st.length();
		
		String st1 = "";
		for(int i = 0 ; i < len ; i++)
		{
			
			char ch = st.charAt(i);
			st1 = ch + st1;	
		}
		System.out.println("st= "+st+" st1= "+st1);
		
		if(st.equals(st1))
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
															
	}*/

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.next();

		StringBuffer sb=new StringBuffer(st);

		sb.reverse();
		String st1=sb.toString();
		System.out.println("st= "+st+" st1= "+st1);
		if(st.equals(st1))
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
			
	}

		
}