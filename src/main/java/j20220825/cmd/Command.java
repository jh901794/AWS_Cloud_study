package j20220825.cmd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public interface Command {

	void doExecute(Map reqTray, HttpServletRequest request, HttpServletResponse response);
}