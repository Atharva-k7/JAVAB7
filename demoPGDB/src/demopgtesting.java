import java.sql.*;
class demopgtesting
{
    static void main(String[] args) throws Exception{
         /*
               import package
               load and register
               create connection
               create statement
               execute statement
               process the result
               close

          */
        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="0000";

        //values

        String sname="patil";
        int rollno=420;

        String sql="insert into student values (?,?);";
        //Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,uname,pass);

        System.out.println("connection done ");
        //Statement st=con.createStatement();

        
        PreparedStatement pst=con.prepareStatement(sql);
        pst.setString(1,sname);
        pst.setInt(2,rollno);
        //ResultSet rs=st.executeQuery(sql);
        pst.execute();
//        while(rs.next()){
//            System.out.print(" "+rs.getString("sname"));
//            System.out.print("-"+rs.getInt("rollno")+" \n");
//        }
        // rs.next();
        //String name=rs.getString("sname");
        //String rollno=rs.getString("rollno");
        //System.out.println("11 its here "+name);
        //System.out.println("name "+name+" rollno "+rollno);
        con.close();
        System.out.println("done");
    }
}