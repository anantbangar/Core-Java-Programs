import java.util.Scanner;

class S12CalFrqOfCharInStr
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
		int count=0;	
	
		for(int i=0;i<length;i++)
		{
			count=0;
			for(int j=0;j<length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
	
			System.out.println("Frequency of "+ch[i]+" is "+count);
		}
	}
}		