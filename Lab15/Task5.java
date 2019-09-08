import java.sql.*;
class Task5{
    public static void main(String []args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","uzairahmed");
            PreparedStatement pstmt = conn.prepareStatement("delete from students WHERE YEAR=1");
            pstmt.executeUpdate();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}