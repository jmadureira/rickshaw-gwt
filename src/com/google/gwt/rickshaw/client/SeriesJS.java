package com.google.gwt.rickshaw.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class SeriesJS extends JsArray<JavaScriptObject> {

	static public final native boolean isDefined() /*-{
		return $wnd.Rickshaw != undefined && $wnd.Rickshaw.Series != undefined;
	}-*/;

	static public final native SeriesJS create() /*-{
		return new $wnd.Rickshaw.Series();
	}-*/;

	protected SeriesJS() {
	}

	public final native void addData(JavaScriptObject data) /*-{
		this.addData(data);
	}-*/;

	public final native int getIndex(int index)/*-{
		return this.getIndex(index);
	}-*/;

	/**
	 * Returns the serie with the given name.
	 * 
	 * @param name The name of the serie being retrieved.
	 * @return The specified serie or null if none was found.
	 */
	public final native JavaScriptObject itemByName(String name)/*-{
		return this.itemByName(name);
	}-*/;

}
