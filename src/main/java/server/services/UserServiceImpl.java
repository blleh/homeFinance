package server.services;

import client.services.UserService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class UserServiceImpl  extends RemoteServiceServlet implements UserService {

	@Override
	public String login(String username, String password) {
		String uid = (String) getThreadLocalRequest().getSession().getAttribute("uid");
		if (uid == null) {
			getThreadLocalRequest().getSession().setAttribute("uid", username);
			return String.format("Logged: %s", username);
		} else {
			return "Already logged in.";
		}
	}

	@Override
	public String register(String username, String passowrd) {
		return null;
	}

	@Override
	public void logout() {
		getThreadLocalRequest().getSession().invalidate();
	}
}
