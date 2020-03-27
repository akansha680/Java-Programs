import java.util.*;
class StringToken
{
	public static void main(String []args)
	{
	String str="To be or not to be, that is the question"
               +"Whether this nobler in the mind to suffer" 
			   + " the slings and arrows of outrageous "
			   +" or to take arms against a sea of troubles," 
			   +" and by opposing end them?"; 
	int spaces=0,vowels=0,consonants=0;
	StringTokenizer st=new StringTokenizer(str);
	while(st.hasMoreTokens())
	{
		spaces++;
		String i=st.nextToken();
		int n=i.length();
		char arr[]=i.toCharArray();
		int i1=0;
		while(i1<n)
		{
			if(arr[i1]=='a'||arr[i1]=='e'||arr[i1]=='i'||arr[i1]=='o'||arr[i1]=='u'||
			arr[i1]=='A'||arr[i1]=='E'||arr[i1]=='I'||arr[i1]=='O'||arr[i1]=='U')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
			i1++;
		}
	}
	System.out.println("The text has \n"+vowels+"vowels\n"+consonants+"consonants\n"+spaces+"spaces");
	}  
}