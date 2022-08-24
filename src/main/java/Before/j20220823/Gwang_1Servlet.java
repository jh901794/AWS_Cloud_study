package Before.j20220823;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Gwang_1Servlet", value = "/Gwang_1Servlet")
public class Gwang_1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String _id = request.getParameter("ID");
        String _pwd = request.getParameter("PWD");

        System.out.println("id = " + _id + ", pwd = " + _pwd);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    //제어권을 다음 페이지로 넘김
}
