import java.util.*;
abstract class Employee
{
	public int empno;
	String name;
	public Employee(int empno,String name)
	{
		this.empno=empno;
		this.name=name;
	}
	public abstract double calculate();
}
class TemporaryEmployee extends Employee
{
	int hours;
	double rate;
	double salary;
	public TemporaryEmployee(int empno,String name,int hours,double rate)
	{
		super(empno,name);
		this.hours=hours;
		this.rate=rate;
		salary=0.0;
	}
	public double calculate()
	{
		salary=hours*rate;
		return salary;
	}
}
class PermanentEmployee extends Employee
{
	float daPercent;
	float hraPercent;
	float pfPercent;
	double bSalary;
	double salary;
	public PermanentEmployee(int empno,String name,float daPercent,float hraPercent,float pfPercent,double bSalary)
	{
		super(empno,name);
		this.daPercent=daPercent;
		this.hraPercent=hraPercent;
		this.pfPercent=pfPercent;
		this.bSalary=bSalary;
	}
	public double calculate()
	{
		salary=bSalary+(daPercent/100)*bSalary+(hraPercent/100)*bSalary+(pfPercent/100)*bSalary;
		return salary;
	}
}
class AbstractClasses
{
	public static void main(String args[])
	{
		Employee e1[]=new TemporaryEmployee[2];
		int flag1=0,flag2=0;
		Scanner sc=new Scanner(System.in);
		e1[0]=new TemporaryEmployee(10,"john",12,500);
		e1[1]=new TemporaryEmployee(11,"wright",13,500);
		Employee e2[]=new PermanentEmployee[2];
		e2[0]=new PermanentEmployee(12,"Alex",12.5f,5,6,200);
		e2[1]=new PermanentEmployee(13,"Hales",12,5,7,400);
		int eno;
		System.out.println("enter employee no");
		eno=sc.nextInt();
		for(Employee e:e1)
		{
			if(e.empno==eno)
			{
				System.out.println("Salary:"+e.calculate());
				flag1=1;
				break;
			}
		}
		for(Employee e:e2)
		{
			if(e.empno==eno)
			{
				System.out.println("Salary:"+e.calculate());
				flag2=1;
				break;
			}
		}
		if(flag1==0 && flag2==0)
			System.out.println("empno not found");
	}
}