package client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

public interface UserServiceAsync {
	void login(String username, String password, AsyncCallback<String> async);

	void register(String username, String passowrd, AsyncCallback<String> async);

	void logout(AsyncCallback<Void> async);
}
