package com.google.gwt.rickshaw.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class SeriesJS extends JsArray<LineJS> {

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
	 * Returns the line with the given name.
	 * 
	 * @param name
	 *            The name of the line data being retrieved.
	 * @return The specified line or null if none was found.
	 */
	public final native LineJS itemByName(String name)/*-{
		return this.itemByName(name);
	}-*/;

	public final native void load(JavaScriptObject data) /*-{
		this.load(data);
	}-*/;

	/**
	 * Sets the time interval for these series.
	 * 
	 * @param time
	 *            Time time in milliseconds being specified.
	 */
	public final native void setTimeInterval(int time) /*-{
		this.setTimeInterval(time);
	}-*/;

}
