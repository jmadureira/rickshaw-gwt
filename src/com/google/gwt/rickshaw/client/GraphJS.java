package com.google.gwt.rickshaw.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

public class GraphJS extends JavaScriptObject {

	static public final native boolean isDefined() /*-{
		return $wnd.Rickshaw != undefined && $wnd.Rickshaw.Graph != undefined;
	}-*/;

	static public final native GraphJS create(Element div) /*-{
		var graph = new $wnd.Rickshaw.Graph({
			element : div,
			series : new $wnd.Rickshaw.Series([])
		});
		return graph;
	}-*/;

	protected GraphJS() {
	}

	public final native void render() /*-{
		this.render();
	}-*/;

	/**
	 * @return The series instance of this graph.
	 */
	public final native SeriesJS series() /*-{
		return this.series;
	}-*/;

	public final native void update() /*-{
		this.update();
	}-*/;

	/**
	 * Returns the width of this graph. Note that this value may not be aligned
	 * with the width of the containing div.
	 * 
	 * @return The width of the graph.
	 */
	public final native int width() /*-{
		return this.width;
	}-*/;
}
