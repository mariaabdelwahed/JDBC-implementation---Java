import java.sql.*;

public class SQLServerConnection {
    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dburl = "jdbc:sqlserver://DESKTOP-JS44HF2\\SQLEXPRESS;databaseName=test2;integratedSecurity=true";
            Connection connection = DriverManager.getConnection(dburl);
            Statement stat= connection.createStatement();
            String query = "Select * from Employee";
            ResultSet rs = stat.executeQuery(query);
            while(rs.next()) {
                System.out.println("empID: " + rs.getString(1) +
                        " ; depID: " + rs.getString(2) + " ; Name: " + rs.getString(5) +
                        " " + rs.getString(3) + " ; salary: " + rs.getString(4));
            }
        } catch(ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
}