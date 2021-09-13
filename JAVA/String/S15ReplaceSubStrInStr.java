import java.util.Scanner;
import java.util.Arrays;

class S15ReplaceSubStrInStr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String str1=sc.nextLine();

		System.out.println("enter string to replace ");
		String oldStr=sc.nextLine();

		System.out.println("enter new string ");
		String newStr=sc.nextLine();

		String replaceStr=str1.replace(oldStr,newStr);

		System.out.println("New String is = "+replaceStr);
	}
}