package client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

public class Gui implements EntryPoint {

	public void onModuleLoad() {
		LoginDialog loginDialog = new LoginDialog();
		RootPanel.get().add(loginDialog);
	}

}
