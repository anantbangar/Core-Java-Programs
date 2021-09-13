#include<stdio.h>
void main()
{
	char str[50];
	int i,count=0;
	
	printf("enter the string ");
	scanf("%[^\n]",str);
	printf("entered string is %s ",str);

	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U')
		{
			count++;
		}
	}

	printf("\nnumber of vowels in string are %d ",count);  
}