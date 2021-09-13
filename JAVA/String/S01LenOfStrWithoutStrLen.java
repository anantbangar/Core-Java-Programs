import java.util.Scanner;


class S01LenOfStrWithoutStrLen
{
	public static void main(String args[])
	{
		System.out.println("enter the string ");

		Scanner sc=new Scanner(System.in);

		String str;
		int length=0;

		str=sc.nextLine();

		for(char ch : str.toCharArray())
		{
			length++;
		}

		System.out.println("length of String is "+length);
	}
}