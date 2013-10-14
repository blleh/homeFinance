package server.services;

import client.services.HomeFinanceService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class HomeFinanceServiceImpl extends RemoteServiceServlet implements HomeFinanceService {

	public String getMessage(String msg) {
		return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
	}
}