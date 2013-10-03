package client;

import com.google.gwt.widget.client.TextButton;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.Dialog;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;


public class LoginDialog extends Dialog {

	// Placeholder
	public LoginDialog() {
		setHeadingText("Login form");
		BorderLayoutContainer layout = new BorderLayoutContainer();
		add(layout);

		ContentPanel center = new ContentPanel();
		center.add(new TextButton("Login"));
		layout.setCenterWidget(center);
	}
}
