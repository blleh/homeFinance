package client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface HomeFinanceServiceAsync {
	void getMessage(String msg, AsyncCallback<String> async);
}
