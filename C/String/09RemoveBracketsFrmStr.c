#include<stdio.h>
#include<string.h>
void main()
{
	char str[50];
	char str1[50];
	
	printf("enter the string ");
	scanf("%[^\n]",str);

	printf("entered string is %s ",str);

	int i,j=0,len=strlen(str);

	for(i=0;i<len;i++)
	{
		if(str[i]!='[' && str[i]!=']' && str[i]!='{' && str[i]!='}' && str[i]!='(' && str[i]!=')')
		{
			str1[j]=str[i];
			j++;
		}
	}
	str1[j]='\0';

	printf("\nAfter removing brackets string is %s ",str1);		
}
	