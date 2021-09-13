#include<stdio.h>
#include<string.h>
void main()
{
	char str[100];
	
	printf("enter the string ");
	scanf("%[^\n]",str);

	printf("entered string is %s ",str);

	int i,sum=0,len=strlen(str);

	for(i=0;i<len;i++)
	{
		if((i==0 || i==(len-1)) && (str[i]>='a' && str[i]<='z'))
		{
			str[i]=str[i]-32;
		}

		else if(str[i]==' ')
		{
			if(str[i-1]>='a' && str[i-1]<='z')
			{
				str[i-1]=str[i-1]-32;
			}

			if(str[i+1]>='a' && str[i+1]<='z')
			{
				str[i+1]=str[i+1]-32;
			}
		}

	}

	printf("\n%s ",str);
}