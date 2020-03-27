class Electronics
{
	public static int price;
	public static class Television
	{
		public static void cost()
		{
			price=2000;
			System.out.println("Call through static method price is:"+price);
		}
		public void cost1()
		{
			price=5000;
			System.out.println("call through Normal Method Price is:"+price);
		}
	}
}
class StaticInnerClass
{
	public static void main(String [] args)
	{
		Electronics.Television.cost();//Calling Static Method
		Electronics.Television tv=new Electronics.Television();
		tv.cost1();
	}
}