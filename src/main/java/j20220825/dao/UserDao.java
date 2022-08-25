package j20220825.dao;

import j20220825.util.CommonUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

public class UserDao {
    public Boolean DiabloUserList(Connection conn, Map key) throws Exception{

        Statement stat = conn.createStatement();
        StringBuffer query = new StringBuffer();

        query.append("select * from diablologin");

        if(!(key.get("userid")==null || key.get("userid").equals(""))) {

            query.append("WHERE       ");
            query.append("userid =" + CommonUtil.Qutter(key.get("userid").toString(), 2));

        }
        if(!(key.get("passwd")==null || key.get("passwd").equals(""))) {
            query.append("AND passwd =" + CommonUtil.Qutter(key.get("passwd").toString(), 2) +      " \n");
        }
        ResultSet rs = stat.executeQuery(query.toString());

        System.out.println("유저 실행됨");
        System.out.println("sql : " + query.toString());
        if(!rs.next()){
            return false;
        }else{
            return true;
        }
    }
}


/*
*         while(rs.next()) {
            System.out.println(CommonUtil.CommonLogin("userid"));
            System.out.println(CommonUtil.CommonLogin("passwd"));
            if(!(key.get("userid")==null || key.get("userid").equals(""))) {

                query.append("WHERE       ");
                query.append("userid =" + CommonUtil.Qutter(key.get("userid").toString(), 2));

            }

            if(!(key.get("passwd")==null || key.get("passwd").equals(""))) {
                query.append("AND passwd =" + CommonUtil.Qutter(key.get("passwd").toString(), 2) +      " \n");
            }
        }
        return login_chk;
* */