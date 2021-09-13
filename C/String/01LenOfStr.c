#include<stdio.h>
void main()
{
	char str[50];
	int len=0,i;

	printf("enter the string ");
	scanf("%[^\n]",str);

	printf("entered string is %s ",str);

	for(i=0;str[i]!='\0';i++)
	{
		len++;
	}

	printf("\nlength of string is %d ",len);

	
}