#include<stdio.h>
void main()
{
	char str[50];
	int i;

	printf("enter the string ");
	scanf("%[^\n]",str);
	printf("entered string is %s ",str);

	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]>='A' && str[i]<='Z')
		{
			str[i]=str[i]+32;
		}

		else if(str[i]>='a' && str[i]<='z')
		{
			str[i]=str[i]-32;
		}
	}

	printf("\nToggle string is %s ",str);
}