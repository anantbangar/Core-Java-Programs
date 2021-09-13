import java.util.Scanner;

class S13NonRepeatingCharInStr
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
			if(ch[i]==' ')
			{
				continue;
			}
			for(int j=0;j<length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(count==1)
				System.out.println(ch[i]+" is non repeating ");
		}
	}
}