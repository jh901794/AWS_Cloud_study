package Common.util;

import javax.servlet.http.HttpServletRequest;

public class CommonUtil {
    // null 체크
	public static Object IsNull(HttpServletRequest request, int choice, String input){
	Object inputvalue = "";
	switch (choice) {
	case 1:
		if(request.getParameter(input) != null){
			inputvalue = request.getParameter(input);
		}
		break;
	case 2:
		if(request.getParameter(input) != null){
			inputvalue = Integer.parseInt(request.getParameter(input));
		}
		break;
	}
	
	return inputvalue;
}
}
