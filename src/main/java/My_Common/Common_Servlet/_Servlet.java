package My_Common.Common_Servlet;

import My_Common.CommonCmd.Command;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet", value = "/Servlet")
public abstract class _Servlet extends HttpServlet implements Command {
    public _Servlet() {
    }

    @Override
    public void init() throws ServletException{
        System.out.println("init 1회 실행");
    }
    @Override
    public void init(ServletConfig config) throws ServletException{
        System.out.println("init 1회 실행");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doService(request,response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doService(request,response);
    }

    protected void doExecute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
    }
}
