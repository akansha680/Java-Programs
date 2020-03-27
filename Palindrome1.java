class Palind implements Runnable
{
	public void run()
	{
		rev();
	}
	public void rev()
	{
		try
		{
			for(int n=100;n<=1000;++n)
			{
				int rem,nr=0;
				int nc=n;
				while(nc>0)
				{
					rem=nc%10;
					nr=nr*10+rem;
					nc=nc/10;
				}
				if(n==nr)
					System.out.println(" "+n);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class Palindrome1
{
	public static void main(String args[])
	{
		Thread obj=new Thread (new Palind());
		obj.start();
	}
}