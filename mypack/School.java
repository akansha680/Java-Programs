package mypack; import java.rmi.*;
import java.rmi.server.*; import mypack.Student; import java.util.*; import java.io.*;
public class School extends UnicastRemoteObject implements SchoolInterface
{
List<Student> list;
School() throws RemoteException
{
super();
list=new ArrayList<Student>();
}
public String admit(Student s) throws RemoteException
{
list.add(s);
return "New student added";
}

public Student search(int rollno) throws RemoteException
{
try
{
int count=0; for(Student s:list){
if(s.getRollNo()==rollno) return s;
count++;
 
}

if(count==list.size())
throw new Exception("invalid roll number");

return new Student(0,"");
}
catch(Exception e)
{
System.out.println("Invalid roll number");
}
return new Student(0,"");
}
}
