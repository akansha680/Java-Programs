import java.util.*;
class Waffle
{
	private int price;
	private String flavour;
	public Waffle(String flavour,int price)
	{
		this.flavour=flavour;
		this.price=price;
	}
	public boolean equals(Object o)
	{
		if(o instanceof Waffle)
		{
			Waffle w1=(Waffle)o;
			return flavour.equals(w1.flavour) && price==w1.price;
		}	
		return false;
	}
	public String toString()
	{
		return String.format(flavour+price);
	}
}
class Equal1
{
	public static void main(String [] args)
	{
		Waffle w=new Waffle("Sweet",100);
		Waffle w2=new Waffle("Sweet",101);
		if(w.equals(w2))
		{
			System.out.println("Objects are equal");
		}
		else
		{
			System.out.println("Objects are not equal");
		}
		if(w==w2)
		{
			System.out.println("Objects are equal");
		}
		else
		{
			System.out.println("Objects are not equal");
		}
		
	}
}