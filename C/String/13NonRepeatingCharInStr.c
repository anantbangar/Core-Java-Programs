#include<stdio.h>
#include<string.h>
void main()
{
	char str[100];
	
	printf("enter the string ");
	scanf("%[^\n]",str);

	printf("entered string is %s ",str);

	int i,j,count;
	int len=strlen(str);

	for(i=0;i<len;i++)
	{
		count=0;
		for(j=0;j<len;j++)
		{
			if(str[i]==str[j])
			{
				count++;
			}
		}

		if(count==1)
		{
			printf("\nCharacter %c is non repeating character ",str[i]);
		}
	
		
	}


}