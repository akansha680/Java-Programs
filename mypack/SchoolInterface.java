package mypack;
// Creating a School interface 
import java.rmi.*;
import java.util.*; 
import mypack.Student;

public interface SchoolInterface extends Remote
{
// Declaring the method prototype
public String admit(Student s) throws RemoteException;
 public Student search(int rollno) throws RemoteException;
}
