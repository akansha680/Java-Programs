interface AnonymousInner
{
	int age=0;
	public void age();
}
class AnonymousInnerInterface
{
	public static void main(String [] args)
	{
	AnonymousInner obj=new AnonymousInner()
	{
		public void age()
		{
			System.out.println("Age is: "+24);
		}
	};
	obj.age();
	}
}