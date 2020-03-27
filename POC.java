import java.util.*;
class POC
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the String");
		str=sc.nextLine();
		System.out.println("Enter the position at which you want to search");
		int c=sc.nextInt();
        System.out.println("Character at position "+c+" "+str.charAt(c)+"\n with total length "+str.length()+"\nand in uppercase  "+str.toUpperCase());
		if(str.contains("hello"))
		{
			System.out.println("it contains");
		}
		else
		{
			System.out.println("it does not contains");
		}
		System.out.println("Index of a is"+str.indexOf('a'));
		String[] arrOfStr = str.split(" ", 2);
        System.out.println("After Splitting");
        for (String a : arrOfStr)
            System.out.println(a);
	}
}