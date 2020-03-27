import java.util.*;
import java.io.*;
class Student implements Comparable<Student>
{
	private String name;
	private int roll;
	public Student(String nm,int rl)
	{
		this.name=nm;
		this.roll=rl;
	}
	public String getName()
	{
		return name;
	}
	public int getRoll()
	{
		return roll;
	}
	public int compareTo(Student st)
	{
		return this.roll-st.roll;
	}
}
class NameCompare implements Comparator<Student>
{
	public int compare(Student st1,Student st2)
	{
		return st1.getName().compareTo(st2.getName());
	}
}
class ComparatorExample
{
	public static void main(String [] args)
	{
		NameCompare namecompare=new NameCompare();
	ArrayList <Student> arraylist=new ArrayList<Student>();
	arraylist.add(new Student("John",27));
	arraylist.add(new Student("Micheal",36));
	arraylist.add(new Student("Racheal",17));
	Collections.sort(arraylist,namecompare);
	 for (Student stu: arraylist) 
            System.out.println(stu.getName() + " " +stu.getRoll());
}
}