package client;

import client.ui.MainPage;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.CenterLayoutContainer;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class HomeFinance implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		DockLayoutPanel mainPanel = new DockLayoutPanel(Style.Unit.EM);

		BorderLayoutContainer borderLayoutContainer = new BorderLayoutContainer();
		borderLayoutContainer.add(new MainPage());

		mainPanel.add(borderLayoutContainer);
		RootLayoutPanel.get().add(mainPanel);
	}
}
