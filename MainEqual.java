class Equal
{
	private int price;
	private String flavour;
	public Equal(String flavour,int price)
	{
		this.flavour=flavour;
		this.price=price;
	}
	public boolean equals(Object o)
	{
		if(o instanceof Equal)
		{
			Equal e1=(Equal)o;
			return flavour.equals(e1.flavour)&&(price==e1.price);
		}
		return false;
	}
	public String toString(){
		return String.format(flavour+price);
	}
}
class MainEqual
{
	public static void main(String [] args)
	{
		Equal e=new Equal("sweet",100);
		Equal e2=new Equal("sweet",101);
		if(e.equals(e2))
		{
			System.out.println("Objects are equal");
		}
		else
		{
			System.out.println("Objects are not equal");
		}
		if(e==e2)
		{
			System.out.println("Objects are equal");
		}
		else
		{
			System.out.println("Objects are not equal");
		}
	}
}