package server;

import client.HomeFinanceService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class HomeFinanceServiceImpl extends RemoteServiceServlet implements HomeFinanceService {
	// Implementation of sample interface method
	public String getMessage(String msg) {
		return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
	}
}