package Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * Class action to be executed for a particular page
 * @author lingfangao@hotmail.com
 *
 */
public interface Action {
	
	public void doAction(HttpServletRequest request);

}
