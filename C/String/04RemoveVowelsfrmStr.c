#include<stdio.h>
#include<string.h>
int checkVowel(char);
void main()
{
	char str[500];
	char str1[500];
	int i,j=0;

	printf("enter the string ");
	scanf("%[^\n]",str);
	printf("entered string is %s ",str);

	int len=strlen(str);

	for(i=0;i<len;i++)
	{
		if(checkVowel(str[i])==0)
		{
			str1[j]=str[i];
			j++;
		}
		
	}
	str1[j]='\0';

	printf("\nafter removing vowels from string, string is %s ",str1);  
}

	int checkVowel(char ch)
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			return 1;
		}
		else 
			return 0;
	}