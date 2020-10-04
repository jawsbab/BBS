package common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action { // controller 규격!
	ActionForward execute (HttpServletRequest request, HttpServletResponse response) throws Exception;
}
