import java.sql.*;
class Task2{
    public static void main(String []args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","uzairahmed");
            System.out.println("Connected!!!!!");
            String roll_num[]= {"18SW52","18SW56","18SW70","17SW74","18SW82"};
            String name[]= {"Usama","Ahmed","Uzair","Imtiaz","Waqar"};
            String batch[]={"18","18","18","17","18"};
            String dept[]= {"Software","Software","Software","Software","Software"};
            int year[]= {1,1,1,2,1};
            int semester[]={2,2,2,4,2};
            PreparedStatement pstmt ;
            for(int i=1; i<=5; i++){
                pstmt = conn.prepareStatement("insert into students(ROLL_NUM,NAME,BATCH,DEPT,YEAR,SEMESTER) values(?,?,?,?,?,?)");
                pstmt.setString(1, roll_num[i]);
                pstmt.setString(2, name[i]);
                pstmt.setString(3, batch[i]);
                pstmt.setString(4, dept[i]);
                pstmt.setInt(5, year[i]);
                pstmt.setInt(6, semester[i]);
                pstmt.executeUpdate(); 
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}