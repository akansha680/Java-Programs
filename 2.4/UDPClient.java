import java.net.*;
import java.util.*;
import java.io.*;
class UDPClient
{
	public static DatagramSocket clientsocket;
	public static DatagramPacket dp;
	public static BufferedReader dis;
	public static InetAddress ia;
	public static byte buf[]=new byte[1024];
	public static cport=789,sport=790;
	public static void main(String [] args)throws IOException
	{
		clientsocket=new DatagramSocket(cport);
		dp=new DatagramPacket(buf,buf.length);
		dis=new BufferedReader(new InputStreamReader(System.in));
		ia=InetAddress.getLocalHost();
		System.out.println("Client is Running...Type 'Stop' to Quit");
		while(true)
		{
			System.out.println("Date format available are case sensitive be careful \n DD-MM-YYYY\t MM-DD-YYYY\t YYYY-MM-DD");
			String str=new String(dis.readLine());
			buf=str.GetBytes();
			if(str.equals("STOP"))
			{
				System.out.println("Terminated...");
				
			}
		}
	}
}
