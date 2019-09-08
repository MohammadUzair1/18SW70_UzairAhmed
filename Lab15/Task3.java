import java.sql.*;
class Task3{
    public static void main(String []args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","uzairahmed");
            Statement stmt = conn.createStatement();
            ResultSet rset = stmt.executeQuery("select * from students WHERE SEMESTER=2");
            int i=1;
            while(rset.next()){
                System.out.println("********Student "+i+"********");
                System.out.println("Roll No: "+rset.getString(1));
                System.out.println("Name: "+rset.getString(2));
                System.out.println("Batch: "+rset.getInt(3));
                System.out.println("Dept: "+rset.getString(4));
                System.out.println("Year: "+rset.getString(5));
                System.out.println("Semester: "+rset.getInt(6));
                i++;
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }   
    }
}     
        