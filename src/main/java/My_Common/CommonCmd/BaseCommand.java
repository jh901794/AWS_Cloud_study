package My_Common.CommonCmd;

import My_Common.bean.Base_User_Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public abstract class BaseCommand {
    Connection conn;
    Base_User_Bean user_bean;
    Statement stat;

    public Connection DB_Connection() {
        if (conn != null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/gwang_1";
                String userid = "root";
                String passwd = "1234";
                conn = DriverManager.getConnection(url, userid, passwd);
                conn.setAutoCommit(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
