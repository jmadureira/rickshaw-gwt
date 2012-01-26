package com.google.gwt.rickshaw.client;

import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;

public class GraphTestCase extends GWTTestCase {

	@Override
	public String getModuleName() {
		return "com.google.gwt.rickshaw.RickshawGWT";
	}

	public void testRickshawMustBeDefined() {
		assertEquals(true, GraphJS.isDefined());
	}
	
	public void testGraphJSCreate() {
		Element div = DOM.createDiv();
		GraphJS graphjs = GraphJS.create(div);
		assertNotNull(graphjs);
	}
	
	public void testCreateWithASeries() {
		SeriesJS series = SeriesJS.create();
		JSONObject map = new JSONObject();
		map.put("NewSerie", new JSONNumber(5));
		series.addData(map.getJavaScriptObject());
		assertEquals(1, series.length());
		Element div = DOM.createDiv();
		GraphJS graphjs = GraphJS.create(div, series);
		assertNotNull(graphjs);
		assertEquals(1, graphjs.series().length());
		
	}
}
