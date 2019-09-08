import java.sql.*;
class Task4{
    public static void main(String []args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","uzairahmed");
            PreparedStatement pstmt = conn.prepareStatement("update students set ROLL_NUM='18SW77' WHERE ROLL_NUM='18SW82'");
            pstmt.executeUpdate();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}