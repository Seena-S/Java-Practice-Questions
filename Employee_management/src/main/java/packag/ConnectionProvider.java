package packag;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    private static Connection con = null;

    public static Connection getCon() {
        try {
            if (con == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management", "root", "Seena");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
