package Common.Common_Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Base_Servlet extends HttpServlet {
    public Base_Servlet() {
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

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doExecute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
