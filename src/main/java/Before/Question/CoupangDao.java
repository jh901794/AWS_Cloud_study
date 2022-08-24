package Before.Question;

import java.sql.Connection;
import java.sql.DriverManager;

public class CoupangDao {
    static Connection mysqlconn;

    public static Connection getMySqlConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/gwang_1";
            String userid = "root";
            String passwd = "1234";
            mysqlconn = DriverManager.getConnection(url, userid, passwd);
            mysqlconn.setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mysqlconn;
    }
}
