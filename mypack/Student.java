package mypack; import java.io.*;
public class Student implements Serializable{ int rollno;
String name;
public Student(int r,String n){ rollno=r;
name=n;
}
public int getRollNo(){
return rollno;
}
public String toString(){
return "Roll no: "+rollno+" Name:"+name;
}
 
}
