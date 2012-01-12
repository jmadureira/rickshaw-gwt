package com.google.gwt.rickshaw.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
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
	
	public void testAddDataShouldCreateANewSerie() {
		SeriesJS series = SeriesJS.create();
		assertNotNull(series);
		JSONObject map = new JSONObject();
		map.put("NewSerie", new JSONNumber(5));
		series.addData(map.getJavaScriptObject());
		assertEquals(1, series.length());
		LineJS obj = series.itemByName("NewSerie");
		assertNotNull(obj);
	}
	
	public void testAddSeveralDataToTheSameSerie() {
		SeriesJS series = SeriesJS.create();
		assertNotNull(series);
		JSONObject map = new JSONObject();
		map.put("NewSerie", new JSONNumber(5));
		series.addData(map.getJavaScriptObject());
		assertEquals(1, series.length());
		map.put("NewSerie", new JSONNumber(7));
		series.addData(map.getJavaScriptObject());
		LineJS line = series.itemByName("NewSerie");
		assertNotNull(line);
		// the first element is zero
		assertEquals(3, line.data().length());
		assertEquals(0, line.data().get(0).getY());
		assertEquals(5, line.data().get(1).getY());
		assertEquals(7, line.data().get(2).getY());
	}
	
}
