package client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("homeFinanceService")
public interface HomeFinanceService extends RemoteService {
	// Sample interface method of remote interface
	String getMessage(String msg);

	/**
	 * Utility/Convenience class.
	 * Use HomeFinanceService.App.getInstance() to access static instance of homefinanceServiceAsync
	 */
	public static class App {
		private static HomeFinanceServiceAsync ourInstance = GWT.create(HomeFinanceService.class);

		public static synchronized HomeFinanceServiceAsync getInstance() {
			return ourInstance;
		}
	}
}
