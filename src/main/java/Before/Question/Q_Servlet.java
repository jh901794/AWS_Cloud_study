package Before.Question;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "Servlet2", value = "/Servlet2")
public class Q_Servlet extends HttpServlet {
    Connection conn;
    String query = "SELECT * FROM login_coupang";
    Coupang_Bean bean;
    Statement stat;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");
        String password = request.getParameter("pwd");
        if(bean == null) {
            bean = new Coupang_Bean(id, password);
        }
        conn = CoupangDao.getMySqlConnection();
        try {
            stat = conn.createStatement();
            ResultSet set = stat.executeQuery(query);
            while (set.next()) {
                if (bean.getId().equals(set.getString("id")) && bean.getPwd().equals(set.getString("pwd"))) {
                    response.sendRedirect("Question/Q_Main_Coupang.jsp");
                    return;
                } else {
                    response.sendRedirect("Question/Q_Login_Coupang.jsp");
                    return;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
