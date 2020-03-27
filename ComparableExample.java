import java.util.*;
import java.io.*;
class Student implements Comparable<Student>{
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
public class ComparableExample{
	public static void main(String [] args)
	{
		ArrayList<Student> arraylist=new ArrayList<Student>();
		arraylist.add(new Student("John",26));
		arraylist.add(new Student("Micheal",34));
		arraylist.add(new Student("Racheal",17));
		Collections.sort(arraylist);
		System.out.println("Students after sorting");
		for(Student st:arraylist)
		{
			System.out.println(st.getName()+" "+st.getRoll());
		}
	}
}