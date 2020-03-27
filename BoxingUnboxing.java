class BoxingUnboxing
{
	public static void main(String [] args)
	{
		int i=100;
		Integer i1=i;//Autoboxing via Variable Assignment
		System.out.println(i+"\n"+i1);
		Box box=new Box();
		box.autobox(1000);//Autobox via Method Passing
		box.unbox(299);//Unboxing via Method Passing
	}
	public void autobox(int num)
	{
		Integer i=num;
		System.out.println(num);
	}
	public void unbox(Integer num)
	{
		int i=num;
		System.out.println(num);
	}
}