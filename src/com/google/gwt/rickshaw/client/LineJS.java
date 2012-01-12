package com.google.gwt.rickshaw.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class LineJS extends JavaScriptObject {

	protected LineJS() {}
	
	public final native JsArray<PointJS> data() /*-{
		return this.data;
	}-*/;
}
