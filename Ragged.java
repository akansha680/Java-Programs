import java.util.*;
class Ragged{
	int n;
	int arr[][];
	public static void main(String [] args)
	{
		StringBuilder s1;
		Ragged r=new Ragged();
		Scanner sc=new Scanner(System.in);
		System.out.println("Rows");
		r.n=sc.nextInt();
		r.arr=new int[r.n][];
		for(int i=0;i<r.n;i++)
		{
			s1=new StringBuilder();
			r.arr[i]=new int[(i+1)];
			for(int j=0;j<=i;j++)
			{
				r.arr[i][j]=j+1;
				s1.append(r.arr[i][j]);
			}
			int k=r.n+i;
			//Format Specifier
			String s2=String.format("%"+k+"s",s1);
			
			System.out.println(s2);
		}
		for(int i=0;i<r.n;i++)
		{
			s1=new StringBuilder();
			for(int j=0;j<=i;j++)
			{
				s1.append(r.arr[i][j]);
			}
			String s2=String.format("%"+r.n+"s",s1);
			System.out.println(s2);
		}

			}
}