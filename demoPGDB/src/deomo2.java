import java.sql.*;
public class deomo2 {
    static void main(String[] args)throws Exception {
        Class.forName("org.postgresql.Driver");
int rollno=007;
String sname="prathemesh";
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo","postgres","0000");
        System.out.println("connection done");
        String sql="select * from student order by rollno;";
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
            System.out.print(rs.getString("sname")+" ");
            System.out.print(rs.getInt("rollno")+"\n");
        }
        System.out.println("done feteching all result done in ");

        con.close();
    }
}
