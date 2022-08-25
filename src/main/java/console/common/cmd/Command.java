package console.common.cmd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public interface Command {

	void doExecute(Map reqTray, HttpServletRequest request, HttpServletResponse response);
}