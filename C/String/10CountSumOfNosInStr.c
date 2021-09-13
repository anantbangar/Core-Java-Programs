#include<stdio.h>
#include<string.h>
void main()
{
	char str[50];
	char str1[50];

	printf("enter the string ");
	scanf("%[^\n]",str);

	printf("entered string is %s ",str);

	int i,sum=0,len=strlen(str);

	for(i=0;i<len;i++)
	{
		if(str[i]>='0' && str[i]<='9')
		{
			sum=sum+(str[i]-'0');
		}
	}

	printf("\nSum of number in string is %d ",sum);
}