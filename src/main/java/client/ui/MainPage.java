package client.ui;

import client.services.UserService;
import client.services.UserServiceAsync;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.logging.server.RemoteLoggingServiceUtil;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.info.Info;

public class MainPage extends ContentPanel {

	UserServiceAsync userService = GWT.create(UserService.class);

	public MainPage() {
		setHeadingText("Main panel");
		BorderLayoutContainer container = new BorderLayoutContainer();
		container.setBorders(true);
		container.add(new Label("labelka"));
		getButtonBar().add(getLoginButton());
		getButtonBar().add(getLogoutButton());
		add(container);
	}

	private Button getLoginButton() {
		Button button = new Button("login");
		button.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent clickEvent) {
				userService.login("sampleUser", "samplePassword", new AsyncCallback<String>() {
					@Override
					public void onFailure(Throwable throwable) {
						Info.display("Error", "Operation failed");
					}

					@Override
					public void onSuccess(String s) {
						Info.display("Success", "Returned: " + s);
					}
				});
			}
		});
		return button;
	}

	private Button getLogoutButton() {
		Button button = new Button("logout");
		button.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent clickEvent) {
				userService.logout(new AsyncCallback<Void>() {
					@Override
					public void onFailure(Throwable throwable) {
						Info.display("FAIL", "Failed");
					}

					@Override
					public void onSuccess(Void aVoid) {
						Info.display("Yay", "Logged out");
					}
				});
			}
		});
		return button;
	}
}
