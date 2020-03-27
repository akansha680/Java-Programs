import java.util.Scanner;
import java.lang.*;
class DivideByZeroException
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		DivideByZeroException calculator=new DivideByZeroException();
		int ch=0,a,b;
		System.out.println("Enter value for two integer");
		a=in.nextInt();
		b=in.nextInt();
		do{
			System.out.println("Enter 1 for addition"+"\n"+"Enter 2 for subtraction"+"\n"+"Enter 3 for multiplication"+
			"\n"+"Enter 4 for division"+"\n"+"Enter 5 for modulus"+"\n"+"Enter 6 for Exit"+"\n");
			ch=in.nextInt();
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
	try
	{
return a/b;
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally
	{
		System.out.println("Exception caught");
	}
	return 0;
}
public int modulus(int a,int b)
{
return a%b;
}
} // end of class
