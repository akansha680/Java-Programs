package mypack;
import java.rmi.*;
 import java.util.*;
public class ClientRequest
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
 try
{
// lookup method to find reference of remote object
 SchoolInterface access =(SchoolInterface)Naming.lookup("rmi://localhost:1900"+ "/akanksha");


System.out.println("Enter roll number: "); 
int r=scan.nextInt();
scan.nextLine(); 
System.out.println("Enter name: "); 
String n=scan.nextLine();

Student stu=new Student(r,n); 
System.out.println(access.admit(stu));

System.out.println("Enter roll number: ");
 int rollno=scan.nextInt();
 
Student s=access.search(rollno);
 System.out.println(s);
}
catch(Exception ae)
{
System.out.println(ae);
}
}
}
