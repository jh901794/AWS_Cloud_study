package j20220824;

import Common.Common_Servlet.Base_Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/w20220824/Servlet_index_next.jsp")
public class Servlet3 extends Base_Servlet {
    @Override
    protected void doExecute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Excute");
    }
}
