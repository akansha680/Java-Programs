class Tree
{
	public void fruit()
	{
		System.out.println("This is tree class");
	}
}
class MangoTree extends Tree
{
	public void fruit()
	{
		System.out.println("This is MangoTree");
		String s1="yellow";
		System.out.println("Color of Mango is "+s1);
	}
}
class AppleTree extends Tree
{
	public void fruit()
	{
		System.out.println("This is AppleTree");
		String s1="red";
		System.out.println("Color of Apple is "+s1);
	}
}
class OrangeTree extends Tree
{
	public void fruit()
	{
		System.out.println("This is OrangeTree");
		String s1="Orange";
		System.out.println("Color of Orange is "+s1);
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		MangoTree mango=new MangoTree();
		AppleTree apple=new AppleTree();
		OrangeTree orange=new OrangeTree();
		apple.fruit();
		mango.fruit();
		orange.fruit();
	}
}