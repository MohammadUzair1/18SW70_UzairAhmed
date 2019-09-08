import java.sql.*;
class Task1{
    public static void main(String []args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","uzairahmed");
            System.out.println("Connected!!!!!");
            Statement st= conn.createStatement();
            ResultSet rs= st.executeQuery("select * from students"); 
            conn.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}