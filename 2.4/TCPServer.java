import java.net.*;
import java.io.*;
class Employee
{
	public String empid;
	public String empname;
	public String department;
	Employee(String empid,String empname,String dept)
	{
		this.empid=empid;
		this.empname=empname;
		this.department=dept;
	}
}
class TCPServer
{
	public static void main(String [] args)
	{
		Employee[] e=new Employee[2];
		e[0]=new Employee("101","John","Design");
		e[1]=new Employee("102","Zoe","management");
		try
		{
			ServerSocket ss=new ServerSocket(1500);
			Socket s=ss.accept();
			DataInputStream in=new DataInputStream(s.getInputStream());
			DataOutputStream out=new DataOutputStream(s.getOutputStream());
			String line="";
			String id="";
			while(line!=null)
			{
				line=in.readUTF();
				id=line;
				break;
			}
			System.out.println(id);
			for(Employee a:e)
			{
				if(a.empid.equals(id))
				{
					String I="Employee id:"+a.empid+"\n"+"Employee name:"+a.empname+"\n"+"Employee department:"+a.department;
					System.out.println(I);
					out.writeUTF(I);
				}
			}
			in.close();
			out.close();
			s.close();
			ss.close();
		}
		catch(IOException ex)
		{
			System.out.println("Exception caught");
		}
	}
}