public class MethodLocalInnerClass
{
	//instance method of the outer classs
	void OuterMethod()
	{
		int num=23;
		System.out.println("In Outer Method");
		class MethodInnerClass
		{
			public void print()
			{
				System.out.println("This is method inner class"+num);
			}
		}
	MethodInnerClass inner=new MethodInnerClass();
	inner.print();
	}
	public static void main(String args[])
	{
		MethodLocalInnerClass outer=new  MethodLocalInnerClass();
		outer.OuterMethod();
	}
}