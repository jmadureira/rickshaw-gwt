package com.google.gwt.rickshaw.client;

import com.google.gwt.core.client.JavaScriptObject;

public class HoverDetailJS extends JavaScriptObject {
	
	static public final native HoverDetailJS create(GraphJS graph) /*-{
		var hover = new $wnd.Rickshaw.Graph.HoverDetail( {
			graph: graph
		} );
		return hover;
	}-*/;
	
	protected HoverDetailJS() {}

}
