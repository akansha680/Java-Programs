import java.net.*;
import java.io.*;
import java.util.*;
class TCPClient
{
	public static void main(String args[])
	{
		try
		{
			Socket ss=new Socket("127.0.0.1",1500);
			Scanner sc=new Scanner(System.in);
			DataOutputStream out=new DataOutputStream(ss.getOutputStream());
			DataInputStream in=new DataInputStream(ss.getInputStream());
			int id=sc.nextInt();
			String line="";
			out.writeUTF(""+id);
			while(line!=null)
			{
				line+=in.readUTF();
				System.out.println(line);
			}
			in.close();
			out.close();
			ss.close();
		}
		catch(IOException ex)
		{
			System.out.println("Exception caught");
		}
	}
}