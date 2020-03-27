import java.util.*;
interface Account
{
	public void open();
	public void close();
	public void withdraw();
	public void deposit();
}
class SavingAccount implements Account
{
	Scanner sc=new Scanner(System.in);
	final double rate=5.6;
	double amount;
	final int noOfTrans=6;
	static int count=0;
	public void open()
	{
		System.out.println("enter the amount");
		amount=sc.nextDouble();
		System.out.println("YOUR SAVINGS ACCOUNT HAS BEEN OPENED WITH INTEREST RATE:"+rate+"AND TRANSACTIONS:"+noOfTrans);
		
	}
	public void close()
	{
		System.out.println("Saving account is closed");
	}
	public void withdraw()
	{
		double amt;
		System.out.println("enter the amount to be withdrawn:");
		amt=sc.nextDouble();
		SavingAccount.count++;
		if(count<=6)
		{
			if(amount-amt>0)
				System.out.println("new amount is:"+(amount=amount-amt)+"after withdrawing"+amt);
			else
				System.out.println("the account cannot hold negative balane");
		}
		else
			System.out.println("total transactions cannot be more than  "+noOfTrans);
		}
	public void deposit()
	{
		double amt;
		System.out.println("enter the amount to deposit");
		amt=sc.nextDouble();
		System.out.println("new amount:"+(amount+=amt)+"after depositing"+amt);
	}	
}
class CurrentAccount implements Account
{
	Scanner sc=new Scanner(System.in);
	final double rate=3.6;
	double amount;
	public void open()
	{
		System.out.println("enter the amount");
		amount=sc.nextDouble();
System.out.println("YOUR CURRENT ACCOUNT HAS BEEN OPENED WITH INTEREST RATE:"+rate);
	}
	public void close()
	{
		System.out.println("Current account is closed");
	}
	public void withdraw()
	{
		double amt;
		System.out.println("enter the amount to be withdrawn:");
		amt=sc.nextDouble();	
		System.out.println("new amount is:"+(amount=amount-amt)+" after withdrawing "+amt);
	}	
	public void deposit()
	{
		double amt;
		System.out.println("enter the amount to be deposited:");
		amt=sc.nextDouble();
		System.out.println("new amount:"+(amount+=amt)+" after depositing "+amt);
	}
}
class Interfaces
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		Account ac;
		int ch,ch1;
		do
		{	
			System.out.println(" MENU");
			System.out.println("1.Saving Account");
			System.out.println("2.current account");
			System.out.println("3.exit");
			System.out.println("enter choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:ac=new SavingAccount();
					   ac.open();
					   do
					   {
					System.out.println("1.Deposit");
					System.out.println("2.Withdraw");
					System.out.println("3.close account");
					System.out.println("4.exit");
					System.out.println("enter choice:");
					ch1=sc.nextInt();
				switch(ch1)
					{
					case 1:ac.deposit();
					        break;
					case 2:ac.withdraw();
                                                                          break;
					case 3:ac.close();
                                       		    break;
					case 4:System.exit(0);
							}
						}while(true);
			    case 2:ac=new CurrentAccount();
					   ac.open();
					   do
					   {
					System.out.println("1.Deposit");
					System.out.println("2.Withdraw");
					System.out.println("3.close account");
					System.out.println("4.exit");	
					System.out.println("enter choice:");
					ch1=sc.nextInt();
					switch(ch1)
					{
						case 1:ac.deposit();
						             break;
						case 2:ac.withdraw();
                                      				            break;
						case 3:ac.close();
                                       					break;
						case 4:System.exit(0);
							}
					    }while(true);
			     case 3:System.exit(0);
			}
		}while(true);

	}
}