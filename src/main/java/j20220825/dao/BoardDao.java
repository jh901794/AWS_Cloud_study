package j20220825.dao;

import j20220825.bean.Diablo_Board_Bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class BoardDao {

    public List list = new ArrayList();


    public List DiabloBoardList(Connection conn, Map key) throws Exception {

        Statement stat = conn.createStatement();
        StringBuffer query = new StringBuffer();
        boolean login_chk = false;
        query.append("SELECT * FROM diabloboard");

        ResultSet rs = stat.executeQuery(query.toString());
        int init = 0;

        System.out.println("보드 실행됨");
        System.out.println("sql : " + query.toString());

        while (rs.next()) {
            Diablo_Board_Bean freebean = new Diablo_Board_Bean(rs.getString("num"), rs.getString("subject"), rs.getString("userid"),  rs.getString("c_date"),  rs.getString("email"), rs.getString("views"), rs.getString("recommend"));
            list.add(freebean);
            init = 0;
        }
        return list;
    }
}