package j20220825.servlet;

import j20220825.cmd.Diablo3BoardCmd;
import j20220825.util.CommonUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class DiabloBoardContoller extends BaseServlet {
    @Override
    public final void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nextPage = null;

        try {
            Map map = CommonUtil.CommonPNames(request);
            Diablo3BoardCmd cmd = new Diablo3BoardCmd();
            cmd.doExecute(map, request, response);

            doForward(request, response, cmd.getNextPage());

        } catch (Exception ex) {
            // throw new AppException("Diablo3Controller.doService", ex);
        } finally {

        }

    }
}
