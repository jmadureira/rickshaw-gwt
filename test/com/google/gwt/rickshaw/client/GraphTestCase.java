package com.google.gwt.rickshaw.client;

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
}
