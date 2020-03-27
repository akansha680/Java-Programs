import java.util.*;
class InputMismatchException
{
	public static void main(String [] args)
	{
		InputMismatchException obj=new InputMismatchException();
		try{
			obj.myMethod();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Input Mismatch Exception occured");
		}
	}
	public void myMethod()throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter any number from 1 to 10");
		a=sc.nextInt();
		System.out.println("The number is"+a);
	}
}