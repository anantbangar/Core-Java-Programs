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
}