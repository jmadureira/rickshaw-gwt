package com.google.gwt.rickshaw.client;

import com.google.gwt.core.client.JavaScriptObject;

public class AxisTimeJS extends JavaScriptObject {
	
	static public final native AxisYJS create(GraphJS graph) /*-{
		var axis = new $wnd.Rickshaw.Graph.Axis.Time({
			graph : graph,
			ticksTreatment: 'glow'
		});
		return axis;
	}-*/;
	
	protected AxisTimeJS() {}

}
