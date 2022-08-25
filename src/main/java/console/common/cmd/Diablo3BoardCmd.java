package console.common.cmd;

import console.common.dao.Diablo3Dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class Diablo3BoardCmd extends BaseCommand{


	public Diablo3BoardCmd() {
		//모든 페이지 관리
		setNextPage("/w20220825/Login.jsp");
	}


	@Override
	public void doExecute(Map reqTray, HttpServletRequest request, HttpServletResponse response) {
		Diablo3Dao dao = new Diablo3Dao();


		List list = null;
		try {
			list = dao.Diablo3BoardList(getmysqlConnection(), reqTray);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			request.setAttribute("list1", list);

		}

	}










}