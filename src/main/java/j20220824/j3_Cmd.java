package j20220824;

import Common.CommonCmd.BaseCommand;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class j3_Cmd implements BaseCommand {
    Connection mysql_conn;
    String m_url = "jdbc:mysql://localhost:3306/gwang_1";
    String m_userid = "root";
    String m_passwd = "1234";

    public Connection getMysql_Conn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("드라이버 로딩");
            mysql_conn = DriverManager.getConnection(m_url, m_userid, m_passwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mysql_conn;
    }

    @Override
    public void doCommand() {

    }
}
