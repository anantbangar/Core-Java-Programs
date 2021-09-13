import java.util.Scanner;

class S11CapitlzFirstandLastCharOfEachWordInStr
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1;
		System.out.println("enter the string ");
		str1=sc.nextLine();
		System.out.println("entered string is "+str1);
		
		char[] ch=str1.toCharArray();
		int length=ch.length;	
	
		for(int i=0;i<length;i++)
		{
			if(i==0 || i==length-1)
			{
				ch[i]=Character.toUpperCase(ch[i]);
			}
			else if(ch[i]==' ')
			{
				ch[i-1]=Character.toUpperCase(ch[i-1]);
				ch[i+1]=Character.toUpperCase(ch[i+1]);
			}
		}
		
		String str2=String.valueOf(ch);
		System.out.println("after capitalizing first and last character of each word in string,string is ");
		System.out.println(str2);
	}
	
}