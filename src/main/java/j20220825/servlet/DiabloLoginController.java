package j20220825.servlet;

import j20220825.cmd.DiabloLoginCmd;
import j20220825.util.CommonUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Servlet implementation class Diablo3Controller
 */

//life cycle : servlet : init(한번만 실행)-> doget dopost destory
public class DiabloLoginController extends BaseServlet {


    @Override
    public final void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nextPage = null;
        try {
            Map map = CommonUtil.CommonPNames(request);
            DiabloLoginCmd cmd = new DiabloLoginCmd();
            cmd.doExecute(map, request, response);

            doForward(request, response, cmd.getNextPage());

        } catch (Exception ex) {
        }finally {

        }

    }


}