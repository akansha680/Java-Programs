//program for server application 
package mypack;
import java.rmi.*;
import java.rmi.registry.*;
 public class SchoolServer
{
public static void main(String args[])
{

try
{
// Create an object of the interface
// implementation class 
SchoolInterface obj = new School();

// rmiregistry within the server JVM with
// port number 1900 
LocateRegistry.createRegistry(1900);

// Binds the remote object by the name
// geeksforgeeks
 Naming.rebind("rmi://localhost:1900"+
"/akanksha",obj);
}
catch(Exception ae)
{
System.out.println(ae);
}
}
 
}
