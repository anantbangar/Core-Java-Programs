import java.util.Scanner;

class S07RemoveNonAlphaFrmStr1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string ");

		String str1,str2="";
		
		str1=sc.nextLine();

		str2=str1.replaceAll("[^a-zA-Z]","");

		System.out.println("after removing non alphabets string is "+str2);
	}
}