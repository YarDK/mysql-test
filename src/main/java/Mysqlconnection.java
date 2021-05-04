import java.sql.*;

public class Mysqlconnection {

    public static void main(String[] args) {
        Connection conn;
        try {
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=");

            /*Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select idtable1,value from table1");
            while (rs.next()){
                System.out.println(rs.getInt("idtable1"));
                System.out.println(rs.getString("value"));
            }*/

            // Do something with the Connection

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
