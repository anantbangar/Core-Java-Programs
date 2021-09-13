#include<stdio.h>
#include<string.h>
void main()
{
	char str[50];
	char str1[50];
	int i,j=0;

	printf("enter the string ");
	scanf("%[^\n]",str);

	printf("entered string is %s ",str);

	int len=strlen(str);

	for(i=len-1;i>=0;i--)
	{
		str1[j]=str[i];
		j++;
		
	}
	str1[j]='\0';
	
	printf("\nReverse string is %s ",str1);

	int flag=0;

	for(i=0;i<len-1;i++)
	{
		if(str[i]!=str1[i])
		{
			flag=1;
			break;
		}
	}

	if(flag==0)
		printf("\nString is Palindrome");
	else
		printf("\nString is not Palindrome");
}	