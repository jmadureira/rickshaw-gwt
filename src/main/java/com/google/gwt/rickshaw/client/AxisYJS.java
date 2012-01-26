package com.google.gwt.rickshaw.client;

import com.google.gwt.core.client.JavaScriptObject;

public class AxisYJS extends JavaScriptObject {
	
	static public final native AxisYJS create(GraphJS graph) /*-{
		var yaxis = new $wnd.Rickshaw.Graph.Axis.Y({
			graph : graph,
			tickFormat: $wnd.Rickshaw.Fixtures.Number.formatKMBT,
			ticksTreatment: 'glow'
		});
		return yaxis;
	}-*/;
	
	protected AxisYJS() {}

}
