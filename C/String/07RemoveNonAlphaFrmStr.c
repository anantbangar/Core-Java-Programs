#include<stdio.h>
#include<string.h>
void main()
{
	char str[50];
	char str1[50];

	printf("enter the string ");
	scanf("%[^\n]",str);
	
	printf("entered string is %s ",str);

	int len=strlen(str);

	int i,j=0;

	for(i=0;i<len;i++)
	{
		if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
		{
			str1[j]=str[i];
			j++;
		}
	}

	str1[j]='\0';

	printf("\nAfter removing non alphabets string is %s ",str1);
} 