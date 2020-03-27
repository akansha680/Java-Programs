/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Akanksha
 */
public class Assignment3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //StudentDAO dao=StudentDAO.getInstance();
       /* dao.insertStudent(6,"Akanksha");
        dao.insertStudent(7,"Akansha");
        dao.insertStudent(8,"Tarun");
        dao.deleteStudent(8);*/
       // dao.updateStudent(7,"Akarshit");
        //dao.displayStudent();
       // Student s1=dao.getStudent(12);
       // System.out.println(s1.sname);
        DALWrapper dal=DALWrapper.getInstance();
    }
    
}
class StudentDAO{
    private volatile static StudentDAO single_instance=null;
    private StudentDAO(){}
    public static StudentDAO getInstance(){
        if(single_instance==null){
            synchronized (StudentDAO.class){
                if(single_instance==null)
                    single_instance=new StudentDAO();
            }
        }
        return single_instance;
    }
    public Connection getConnection(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Student","Akanksha","123456");
            return con;
        }catch(Exception E){
            System.out.println(E);
        }
        return null;
    }
    public void insertStudent(int rollno,String name){
        try{
            Connection con=getConnection();
            PreparedStatement preparedStatement=con.prepareStatement("Insert into AKANKSHA.STUDENT values(?,?)");
            preparedStatement.setInt(1,rollno);
            preparedStatement.setString(2, name);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    public void deleteStudent(int rollno){
        try{
            Connection con=getConnection();
            PreparedStatement preparedStatement=con.prepareStatement("Delete from AKANKSHA.STUDENT where rollno=(?)");
            preparedStatement.setInt(1,rollno);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        }catch(Exception e){System.out.println(e);}
    }
    public void updateStudent(int rollno,String name){
        try{
            Connection con=getConnection();
            PreparedStatement preparedStatement=con.prepareStatement("Update AKANKSHA.STUDENT set sname=(?) where rollno=(?)");
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,rollno);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        }catch(Exception e){System.out.println(e);}
    }
    public void displayStudent(){
        try{
            Connection con=getConnection();
            PreparedStatement preparedStatement=con.prepareStatement("Select * from Akanksha.Student");
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
                System.out.println("rollno is: "+rs.getInt("rollno"));
                System.out.println("name is: "+rs.getString("sname"));
            }
        }catch(Exception e){System.out.println(e);}
    }
    public Student getStudent(int rollno){
        try{
            String query="select sname from AKANKSHA.STUDENT where rollno="+rollno;
            Student s = new Student();
            s.rollno= rollno;
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/Student","Akanksha","123456");
            Statement st= con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name=rs.getString(1);
            s.sname=name;
            return s;
        }catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    } 
}
class Student{
    public int rollno;
    public String sname;
}