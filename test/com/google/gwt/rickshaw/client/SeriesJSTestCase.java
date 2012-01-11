package com.google.gwt.rickshaw.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.junit.client.GWTTestCase;

public class SeriesJSTestCase extends GWTTestCase {

	@Override
	public String getModuleName() {
		return "com.google.gwt.rickshaw.RickshawGWT";
	}
	
	public void testSeriesMustBeDefined() {
		assertEquals(true, SeriesJS.isDefined());
	}
	
	public void testSeriesCreation() {
		SeriesJS series = SeriesJS.create();
		assertNotNull(series);
	}
	
	public void testAddEmptySerie() {
		SeriesJS series = SeriesJS.create();
		assertNotNull(series);
		JSONObject map = new JSONObject();
		series.addData(map.getJavaScriptObject());
	}
	
	public void testAddSerie() {
		SeriesJS series = SeriesJS.create();
		assertNotNull(series);
		JSONObject map = new JSONObject();
		map.put("NewSerie", new JSONNumber(5));
		series.addData(map.getJavaScriptObject());
		assertEquals(1, series.length());
		JavaScriptObject obj = series.itemByName("NewSerie");
		assertNotNull(obj);
	}
}
