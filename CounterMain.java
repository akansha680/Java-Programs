class SharedCounter implements Runnable
{
	public static int counter=0;
	public void increment()
	{
		counter=counter+10;
	}
	public void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		try
		{
			Thread.sleep(800);
			increment();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("i am"+name+" "+"Counter is"+""+counter);
	}
}
class CounterMain
{
	public static void main(String [] args)
	{
		for(int i=0;i<10;i++)
		{
			Thread obj1=new Thread(new SharedCounter());
			obj1.start();
			obj1.yield();
		}
	}
}