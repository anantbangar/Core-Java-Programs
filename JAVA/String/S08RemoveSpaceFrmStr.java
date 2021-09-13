import java.util.Scanner;

class S08RemoveSpaceFrmStr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string ");

		String str1,str2="";
		
		str1=sc.nextLine();

		for(int i=0;i<str1.length();i++)
		{
			if((str1.charAt(i))!=' ' && (str1.charAt(i))!='\t')
			{
				str2=str2+(str1.charAt(i));
			}
		}

		System.out.println("string after removing space from it is "+str2);
	}
}

		 