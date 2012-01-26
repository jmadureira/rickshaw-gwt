package com.google.gwt.rickshaw.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class LineJS extends JavaScriptObject {

	protected LineJS() {
	}

	public final native JsArray<PointJS> data() /*-{
		return this.data;
	}-*/;

	/**
	 * Returns the name given to this line.
	 * 
	 * @return The name of the line.
	 */
	public final native String name() /*-{
		return this.name;
	}-*/;
}
