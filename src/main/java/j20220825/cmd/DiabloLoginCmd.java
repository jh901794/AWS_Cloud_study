package j20220825.cmd;


import j20220825.dao.UserDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class DiabloLoginCmd extends BaseCommand {

    public DiabloLoginCmd() {
        setNextPage("/w20220825/Login.jsp");
    }

    @Override
    public void doExecute(Map reqTray, HttpServletRequest request, HttpServletResponse response) {
        UserDao dao = new UserDao();
        Boolean login_chk = false;
        try{
            if(dao.DiabloUserList(getmysqlConnection(),reqTray)){
                System.out.println("로그인 성공");
                setNextPage("/diablo3.do");
            }else{
                System.out.println("로그인 실패");
                setNextPage("/diablologin.do");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {

        }
    }
}
