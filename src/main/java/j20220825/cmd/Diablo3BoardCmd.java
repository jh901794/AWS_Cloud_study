package j20220825.cmd;

import j20220825.dao.BoardDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class Diablo3BoardCmd extends BaseCommand {


	public Diablo3BoardCmd() {
		//모든 페이지 관리
		setNextPage("/w20220825/diabloindex.jsp");
	}


	@Override
	public void doExecute(Map reqTray, HttpServletRequest request, HttpServletResponse response) {
		BoardDao dao = new BoardDao();
		List list = null;

		try {
			list = dao.DiabloBoardList(getmysqlConnection(), reqTray);

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}finally {
			request.setAttribute("list1", list);
		}
	}
}
