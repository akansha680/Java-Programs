import java.util.*;
import java.lang.*;
class Product
{
	public static void main(String [] args)
	{
		int n,answer=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			answer=(answer*arr[i])%(10*10*10*10*10*10*10*10*10+7);
		}
		System.out.println(answer);
	
	}
}