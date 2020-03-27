class reverseHello extends Thread
{
	private int counter;
	public reverseHello(int counter)
	{
		super("Thread"+counter);
		this.counter=counter;
	}
	public void run()
	{
		counter++;
		if(counter<=51)
		{
			reverseHello obj=new reverseHello(counter);
			obj.start();
			try{
				obj.join();
				System.out.println("Hello from "+getName());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class ReverseThread 
{
	public static void main(String [] args)
	{
		reverseHello obj1=new reverseHello(1);
		obj1.start();
	}
}