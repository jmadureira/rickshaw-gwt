package com.google.gwt.rickshaw.client;

import com.google.gwt.core.client.JavaScriptObject;

public class PointJS extends JavaScriptObject {

	protected PointJS() {}
	
	public final native int getX() /*-{
		return this.x;
	}-*/;
	
	public final native int getY() /*-{
		return this.y;
	}-*/;
}
