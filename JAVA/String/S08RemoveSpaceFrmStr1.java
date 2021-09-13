import java.util.Scanner;

class S08RemoveSpaceFrmStr1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string ");

		String str1;
		
		str1=sc.nextLine();

		char[] ch=str1.toCharArray();

		StringBuffer sb=new StringBuffer();

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ' && ch[i]!='\t')
			{
				sb.append(ch[i]);
			}
		}

		System.out.println("string after removing space from it is "+sb);
	}
}

		 