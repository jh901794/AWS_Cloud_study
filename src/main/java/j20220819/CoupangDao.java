package j20220819;

import Common.BaseCommand;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CoupangDao {
    static Connection conn;
    public static ArrayList Coupang_list(){
        StringBuffer query = new StringBuffer();
        query.append("SELECT * FROM coupang");

       conn = BaseCommand.getMySqlConnection();

        Statement stat = null;
        ArrayList arr = new ArrayList();
        try {
                stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(query.toString());
            while (rs.next()){
                CoupangBean bean = new CoupangBean(rs.getString("id"),rs.getString("pwd")
                        ,rs.getString("name"),rs.getString("phone"));
                arr.add(bean);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return arr;
    }
}
