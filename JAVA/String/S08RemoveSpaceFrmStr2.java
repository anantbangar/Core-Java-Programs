import java.util.Scanner;

class S08RemoveSpaceFrmStr2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string ");

		String str1;

		String[] str2;

		StringBuffer sb=new StringBuffer();
		
		str1=sc.nextLine();

		str2=str1.split("[\\s]");
	
		for(String s : str2)
		{
			sb.append(s);
		}

		System.out.println("string after removing space from it is "+sb);

		String s1=str1.replaceAll("[\\s]","");

		System.out.println("string after removing space from it is "+s1);

	}
}