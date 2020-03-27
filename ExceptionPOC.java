import java.util.*;
class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}
class ExceptionPOC
{
	public static void main(String [] args)
	{
		int a=0,b=0,ch=0;
		Scanner sc=new Scanner(System.in);
		ExceptionPOC calculator=new ExceptionPOC();
		System.out.println("Enter values for a and b");
		try
		{
			if(sc.hasNextInt())
			{
			a=sc.nextInt();
			b=sc.nextInt();
		    }
			else
			{
				throw new MyException("Invalid Numeral!!!! Please enter valid number"); 
			}
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
		do{
System.out.println("Enter 1 for addition"+"\n"+"Enter 2 for subtraction"+"\n"+"Enter 3 for multiplication"+
 "\n"+"Enter 4 for division"+"\n"+"Enter 5 for modulus"+"\n"+"Enter 6 for Exit"+"\n");
ch=sc.nextInt();


switch(ch){
case 1:
System.out.println("Sum is"+calculator.add(a,b));
break;
case 2:
System.out.println("Subtraction is"+calculator.subtraction(a,b));
break;
case 3:
System.out.println("Multiply is"+calculator.multiply(a,b));
break;
case 4:
System.out.println("Division is"+calculator.division(a,b));
break;
case 5:
System.out.println("Modulus is"+calculator.modulus(a,b));
break;
case 6:
 System.exit(0);
break;
default:
System.out.println("Wrong choice");
}
}while(ch!=6);

}  //end of main

public int add(int a,int b)
{
return a+b;
}
public int subtraction(int a,int b)
{
return a-b;
}
public int multiply(int a,int b)
{
return a*b;
}
public int division(int a,int b)
{
return a/b;
}
public int modulus(int a,int b)
{
return a%b;
	}
}