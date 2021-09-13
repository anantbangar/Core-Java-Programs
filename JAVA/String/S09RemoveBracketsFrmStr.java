import java.util.Scanner;

class S09RemoveBracketsFrmStr
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string ");

		String str1=sc.nextLine();

		String str2="";
		
		char[] ch=str1.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='[' && ch[i]!=']' && ch[i]!='{' && ch[i]!='}' && ch[i]!='(' && ch[i]!=')')
			{
				str2=str2+ch[i];
			}
		}

		System.out.println("after removing all brackets from string is "+str2);
	}
}
		 